import java_cup.runtime.Symbol;

%%

%cup
%line
%column
%class Lexer  

/* Ignorar espacios en blanco */
WHITESPACE = [ \t\r\n]+

%{
  private Symbol symbol(int type) {
    return new Symbol(type, yyline, yycolumn);
  }
  private Symbol symbol(int type, Object value) {
    return new Symbol(type, yyline, yycolumn, value);
  }
%}

%%

/* Operadores y Símbolos */
";"              { return symbol(sym.SEMI); }
"+"              { return symbol(sym.PLUS); }
"-"              { return symbol(sym.MINUS); }
"*"              { return symbol(sym.TIMES); }
"/"              { return symbol(sym.DIVIDE); }
"("              { return symbol(sym.LPAREN); }
")"              { return symbol(sym.RPAREN); }
{WHITESPACE}     { /* ignora */ }

/* Números enteros (usando Integer.valueOf para eliminar la advertencia) */
[0-9]+           { return symbol(sym.NUMBER, Integer.valueOf(yytext())); }

/* Manejo de errores léxicos */
.                { System.err.println("Error léxico: Caracter no reconocido <"+yytext()+">"); }

