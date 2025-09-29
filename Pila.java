package tarea1;

import java.util.Deque;
import java.util.ArrayDeque;

// Clase genérica
public class Pila<T> {
    private final Deque<T> pila;

    // Constructor
    public Pila() {
        this.pila = new ArrayDeque<>();
    }

    // Métodos para manipular la pila
    public void push(T elemento) {
        pila.push(elemento);
    }

    public T pop() {
        return pila.pop();
    }

    public T peek() {
        return pila.peek();
    }

    public boolean isEmpty() {
        return pila.isEmpty();
    }

    // Método para ver el estado actual de la pila
    @Override
    public String toString() {
        return pila.toString();
    }
}