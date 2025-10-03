import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        try {
            System.out.println("Calculadora Simple con JFlex y CUP.");
            System.out.println("Escribe expresiones y terminalas con ; (ej. 10 * (2 + 3); )");
            System.out.println("Usa Ctrl+D (Unix) o Ctrl+Z (Windows) para salir.");

            // Crear el parser, que a su vez crea el lexer
            parser p = new parser(new Lexer(new InputStreamReader(System.in)));
            p.parse();

        } catch (Exception e) {
            System.err.println("Ocurrió un error durante el análisis.");
            e.printStackTrace();
        }
    }
}
