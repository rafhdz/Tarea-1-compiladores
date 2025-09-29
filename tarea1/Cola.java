package tarea1;

import java.util.Queue;
import java.util.LinkedList;

// Clase genérica
public class Cola<T> {
    private final Queue<T> cola;

    public Cola() {
        this.cola = new LinkedList<>();
    }

    public void add(T elemento) {
        cola.add(elemento);
    }

    public T remove() {
        return cola.remove();
    }
    
    public T poll() {
        return cola.poll();
    }

    public T peek() {
        return cola.peek();
    }

    public boolean isEmpty() {
        return cola.isEmpty();
    }
    
    @Override
    public String toString() {
        return cola.toString();
    }
}