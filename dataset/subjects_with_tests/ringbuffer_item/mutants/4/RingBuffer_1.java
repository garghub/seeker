package examples;

import java.util.ArrayList;

/**
 * This class implements the RING_BUFFER [G] class from the file ring_buffer.e in the Eiffel project
 * AutoProof
 * 
 * @author Facundo Molina (with modifications by N. Aguirre)
 */






public class RingBuffer<G> {


    

    /**
     * Arrays used to store data.
     */  
    private ArrayList<G> data; 

    /**
     * Index of first element.
     */
    private int start; 

    /**
     * Index of next free position.
     */
    private int free;

    /**
     * Capacity
     */
    private int capacity_; 


    /**
     * Initializes empty buffer with capacity `n'.
     */
    public RingBuffer(int n) {
        if (!(n > 1)) throw new IllegalArgumentException("parameter must be positive");

        data = new ArrayList<G>(n + 1);
        data.add(null); 
        start = 1;
        free = 1;
        capacity_ = n;

        
        
        
        
        
        
    }

    /**
     * Current item of buffer.
     */
    public Object item() {
        
        
        if (isEmpty()) throw new IllegalStateException("empty buffer");

        Object result = data.get(start);

        
        
        
        assert(true);
        return result;
    }

    /**
     * Number of items in buffer.
     */
    public int count() {
        int result;
        if (free > start)
            result = free - start;
        else
            result = (data.size() - 1) - start + free;
        return result;
        
        
    }

    public int dataCount() {
        return capacity_ + 1;
    }

    /**
     * Maximum capacity of buffer.
     */
    public int capacity() {
        return capacity_;
        
        
    }

    /**
     * Is buffer empty?
     */
    public boolean isEmpty() {
        return start == free;
        
        
    }

    /**
     * Is buffer full?
     */
    public boolean isFull() {
        boolean result;
        if (start == 1)
            result = free == dataCount();
        else
            result = free == start - 1;
        
        
        
        return result;
    }

    /**
     * Adds `a_value' to end of buffer.
     */
    public void extend(G a_value) {
        
        
        
        if (isFull()) throw new IllegalStateException("buffer is full");
        data.add(a_value);
        if (free == dataCount())
            free = 1;
        else
            free = free + 1;
        
        
        
    }

    /**
     * Removes current item from buffer.
     */
    public void remove() {
        
        
        
        if (isEmpty()) throw new IllegalStateException("buffer is empty");

        if (start == dataCount())
            start = 1;
        else
            start++;

        
        
    }

    /**
     * Removes all elements from buffer.
     */
    public void wipeOut() {
        
        

        start = free;

        
        
        
        
    }

}
