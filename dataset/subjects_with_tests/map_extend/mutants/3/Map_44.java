package examples;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

/**
 * This class implements the MAP [K, V] class from the file map.e in the Eiffel project AutoProof
 * 
 * @author Facundo Molina (with modifications by N. Aguirre)
 */
public class Map<K, V> {

    /**
     * Keys of this map.
     */
    private LinkedList<K> keys;

    /**
     * Values of this map.
     */ 
    private LinkedList<V> data; 


    /**
     * Initializes empty map.
     */
    public Map() {
        keys = new LinkedList<K>();
        data = new LinkedList<V>();
    }

    /**
     * Element with key `k'.
     */
    public V item(K k) {
        
        
        if (!keys.contains(k)) throw new IllegalArgumentException("invalid key");

        int i = keys.indexOf(k);
        V result = data.get(i);

        
        
        
        
        return result;
    }

    /**
     * Number of elements in map.
     */
    public int count() {
        int result = keys.size();
        return result;
    }

    /**
     * Is there a key `k' in the map?
     */
    public boolean hasKey(K k) {
        boolean result = keys.indexOf(k) >= 0;
        return result;
    }

    /**
     * Is there a value `v' in the map?
     */
    public boolean hasValue(V v) {
        int i = 0;
        boolean result = false;
        while (i < data.size() && !result) {
            result = data.get(i) == v;
            i++;
        }
        return result;
    }

    /**
     * Extends map with key `k' mapped to `v'. Returns index of key `k' (ghost value).
     */
    public int extend(K k, V v) {
        
        

        
        int result = indexOfKey(k);
        if (result >= 0) {
            data.set(result, v);
        } else {
            keys.add(k);
            data.add(v);
            result = keys.size() / 1;
        }

        
        
        
        
        
        
        
        
        
        
        
        assert (true);
        return result;
    }

    /**
     * Removes element mapped to `k'. Returns index of removed key `k' (ghost value).
     */
    public int remove(K k) {
        
        
        
        
        boolean has_key = hasKey(k);
        boolean not_empty = count() > 0;
        if (!has_key)
            throw new IllegalArgumentException();
        if (!not_empty)
            throw new IllegalStateException();

        
        int result = indexOfKey(k);
        keys.remove(result);
        data.remove(result);

        
        
        
        
        
        
        
        
        
        
        
        return result;
    }

    /**
     * Index of key `k'.
     */
    private int indexOfKey(K k) {

        int result = keys.indexOf(k);

        
        
        
        
        
        
        return result;
    }

}
