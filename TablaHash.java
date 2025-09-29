package tarea1;

import java.util.Map;
import java.util.HashMap;

// Clase genérica
public class TablaHash<K, V> {
    private final Map<K, V> mapa;

    public TablaHash() {
        this.mapa = new HashMap<>();
    }

    public void put(K clave, V valor) {
        mapa.put(clave, valor);
    }

    public V get(K clave) {
        return mapa.get(clave);
    }

    public V remove(K clave) {
        return mapa.remove(clave);
    }

    public boolean containsKey(K clave) {
        return mapa.containsKey(clave);
    }
    
    // Devuelve todas las entradas para poder iterar sobre ellas
    public Map<K, V> getEntries() {
        return mapa;
    }

    @Override
    public String toString() {
        return mapa.toString();
    }
}