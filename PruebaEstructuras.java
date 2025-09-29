package tarea1;

import java.util.Map;

public class PruebaEstructuras {
    public static void main(String[] args) {
        System.out.println("Demostración de estructuras de datos\n");
        
        ejecutarPruebasPila();
        ejecutarPruebasCola();
        ejecutarPruebasTablaHash();
    }

    // VISUALIZACION
    private static void operacion(String descripcion) {
        System.out.println("Operación: " + descripcion);
    }
    
    private static void mostrarResultado(String descripcion, Object valor) {
        System.out.println("Resultado de '" + descripcion + "': " + valor);
    }

    // PRUEBAS PARA PILA (STACK)
    public static void ejecutarPruebasPila() {
        System.out.println("--- Demostración para Pila ---");
        caso1_Pila_PushYPeek();
        caso2_Pila_PopYEstadoVacio();
        caso3_Pila_SecuenciaYToString();
        System.out.println();
    }

    private static void caso1_Pila_PushYPeek() {
        System.out.println("\n-Caso 1: Push y Peek");
        Pila<String> pila = new Pila<>();
        operacion("push(\"uno\") y push(\"dos\")");
        pila.push("uno");
        pila.push("dos");
        mostrarResultado("estado de la pila", pila);
        
        operacion("peek()");
        mostrarResultado("valor en la cima", pila.peek());
        mostrarResultado("estado de la pila tras peek()", pila);
    }

    private static void caso2_Pila_PopYEstadoVacio() {
        System.out.println("\n-Caso 2: Pop y estado vacío");
        Pila<String> pila = new Pila<>();
        operacion("push(\"X\") y push(\"Y\")");
        pila.push("X");
        pila.push("Y");
        mostrarResultado("estado inicial", pila);

        operacion("pop()");
        mostrarResultado("elemento extraído", pila.pop());
        mostrarResultado("estado de la pila", pila);

        operacion("pop()");
        mostrarResultado("elemento extraído", pila.pop());
        mostrarResultado("estado de la pila", pila);

        operacion("isEmpty()");
        mostrarResultado("la pila está vacía", pila.isEmpty());
    }

    private static void caso3_Pila_SecuenciaYToString() {
        System.out.println("\n-Caso 3: Secuencia completa y toString()");
        Pila<Integer> pila = new Pila<>();
        operacion("push(1), push(2), push(3)");
        pila.push(1);
        pila.push(2);
        pila.push(3);

        operacion("toString()");
        mostrarResultado("estado de la pila", pila.toString());

        operacion("pop() x3 para vaciarla");
        pila.pop();
        pila.pop();
        pila.pop();
        mostrarResultado("estado final", pila);
    }


    // PRUEBAS PARA COLA (QUEUE)
    public static void ejecutarPruebasCola() {
        System.out.println("--- Demostración para Cola ---");
        caso1_Cola_AddYPeek();
        caso2_Cola_RemoveVsPoll();
        caso3_Cola_EstadoYToString();
        System.out.println();
    }

    private static void caso1_Cola_AddYPeek() {
        System.out.println("\nCaso 1: Add y Peek");
        Cola<String> cola = new Cola<>();
        operacion("add(\"A\") y add(\"B\")");
        cola.add("A");
        cola.add("B");
        mostrarResultado("estado de la cola", cola);

        operacion("peek()");
        mostrarResultado("elemento al frente", cola.peek());
        
        operacion("isEmpty()");
        mostrarResultado("la cola está vacía", cola.isEmpty());
    }

    private static void caso2_Cola_RemoveVsPoll() {
        System.out.println("\nCaso 2: Remove vs Poll");
        Cola<String> cola = new Cola<>();
        operacion("add(\"C\") y add(\"D\")");
        cola.add("C");
        cola.add("D");
        mostrarResultado("estado inicial", cola);

        operacion("remove()");
        mostrarResultado("elemento extraído", cola.remove());
        mostrarResultado("estado de la cola", cola);

        operacion("poll()");
        mostrarResultado("elemento extraído", cola.poll());
        mostrarResultado("estado final", cola);
    }

    private static void caso3_Cola_EstadoYToString() {
        System.out.println("\nCaso 3: Estado y toString()");
        Cola<Integer> cola = new Cola<>();
        operacion("add(10), add(20), add(30)");
        cola.add(10);
        cola.add(20);
        cola.add(30);
        
        operacion("toString()");
        mostrarResultado("estado de la cola", cola.toString());

        operacion("peek() varias veces");
        cola.peek();
        cola.peek();
        mostrarResultado("estado tras múltiples peeks", cola);
    }

    // PRUEBAS PARA TABLA HASH (MAP)
    public static void ejecutarPruebasTablaHash() {
        System.out.println("--- Demostración para Tabla Hash ---");
        caso1_TablaHash_InsercionYRecuperacion();
        caso2_TablaHash_ReemplazoYEliminacion();
        caso3_TablaHash_IteracionYEstado();
        System.out.println();
    }

    private static void caso1_TablaHash_InsercionYRecuperacion() {
        System.out.println("\nCaso 1: Inserción y recuperación básica");
        TablaHash<String, Integer> tabla = new TablaHash<>();
        operacion("put(\"A\", 1)");
        tabla.put("A", 1);
        mostrarResultado("estado de la tabla", tabla);

        operacion("get(\"A\")");
        mostrarResultado("valor obtenido", tabla.get("A"));

        operacion("containsKey(\"A\")");
        mostrarResultado("contiene la clave 'A'", tabla.containsKey("A"));
    }

    private static void caso2_TablaHash_ReemplazoYEliminacion() {
        System.out.println("\nCaso 2: Reemplazo y eliminación");
        TablaHash<String, Integer> tabla = new TablaHash<>();
        operacion("put(\"B\", 2)");
        tabla.put("B", 2);
        mostrarResultado("estado inicial", tabla);

        operacion("put(\"B\", 3) [Reemplazo]");
        tabla.put("B", 3);
        mostrarResultado("estado tras reemplazo", tabla);
        
        operacion("remove(\"B\")");
        mostrarResultado("valor eliminado", tabla.remove("B"));
        mostrarResultado("estado final", tabla);
    }

    private static void caso3_TablaHash_IteracionYEstado() {
        System.out.println("\nCaso 3: Iteración y estado del mapa");
        TablaHash<String, Integer> tabla = new TablaHash<>();
        operacion("put(\"C\", 4) y put(\"D\", 5)");
        tabla.put("C", 4);
        tabla.put("D", 5);
        
        operacion("toString()");
        mostrarResultado("estado del mapa", tabla.toString());

        operacion("getEntries()");
        Map<String, Integer> entries = tabla.getEntries();
        mostrarResultado("entradas obtenidas", entries);
    }
}