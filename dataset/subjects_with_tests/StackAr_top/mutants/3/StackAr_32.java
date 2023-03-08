package DataStructures;


import java.util.Arrays;
















/**
 * Array-based implementation of the stack.
 * @author Mark Allen Weiss
 */
public class StackAr
{
	private Object[] theArray;
	private int topOfStack;
	static final int DEFAULT_CAPACITY = 10;
	   
    /**
     * Construct the stack.
     */
    public StackAr()
    {
        this(DEFAULT_CAPACITY);
    }

    /**
     * Construct the stack.
     * @param capacity the capacity.
     */
    public StackAr(int capacity)
    {
        theArray = new Object[capacity];
        topOfStack = -1;
    }

    /**
     * Test if the stack is logically empty.
     * @return true if empty, false otherwise.
     */
    public boolean isEmpty()
    {
        boolean result = topOfStack == -1;        
        return result;
    }

    /**
     * Test if the stack is logically full.
     * @return true if full, false otherwise.
     */
    public boolean isFull()
    {
        boolean result = topOfStack == theArray.length - 1;
        return result;
    }

    /**
     * Make the stack logically empty.
     */
    public void makeEmpty()
    {
        java.util.Arrays.fill(theArray, 0, topOfStack + 1, null);
 
    }

    /**
     * Get the most recently inserted item in the stack.
     * Does not alter the stack.
     * @return the most recently inserted item in the stack, or null, if empty.
     */
    public Object top()
    {
    	Object result;
        if (isEmpty()) {
            result = null;
        } else {
            result = theArray[topOfStack];
        }
        
        assert (true);
        return result;
    }
    
    /**
     * Remove the most recently inserted item from the stack.
     * @exception Underflow if stack is already empty.
     */
    public void pop() throws Underflow {
    	if (isEmpty())
            throw new Underflow();
    	
        theArray[topOfStack] = null;
        topOfStack = topOfStack - 1; 
    } 
    

    /**
     * Insert a new item into the stack, if not already full.
     * @param x the item to insert.
     * @exception Overflow if stack is already full.
     */
    public void push(Object x) throws Overflow
    {
        if (isFull())
            throw new Overflow();
       
        theArray[++topOfStack] = x;
    } 
}
