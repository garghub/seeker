package DataStructures;

import java.util.Arrays;
















/**
 * Array-based implementation of the stack.
 * @author Mark Allen Weiss
 */
public class StackAr
{

    /**
     * Construct the stack.
     * @param capacity the capacity.
     */
    public StackAr( int capacity )
    {
        theArray = new Object[ capacity ];
        topOfStack = -1;
    }

    /**
     * Test if the stack is logically empty.
     * @return true if empty, false otherwise.
     * @observer 
     */
    public boolean isEmpty( )
    {
        return topOfStack == -1;
    }

    /**
     * Test if the stack is logically full.
     * @return true if full, false otherwise.
     * @observer 
     */
    public boolean isFull( )
    {
        return topOfStack == theArray.length - 1;
    }


    /**
     * Make the stack logically empty.
     */
    public void makeEmpty( )
    {
        java.util.Arrays.fill(theArray, 0, topOfStack + 1, null);
        topOfStack = -1; 
    }

    /**
     * Get the most recently inserted item in the stack.
     * Does not alter the stack.
     * @return the most recently inserted item in the stack, or null, if empty.
     * @observer 
     */
    public Object top( )
    {
        if( isEmpty( ) )
            return null;
        return theArray[ topOfStack ];
    }

    /**
     * Remove the most recently inserted item from the stack.
     * @exception Underflow if stack is already empty.
     */
    public void pop( ) throws Underflow
    {
        if( isEmpty( ) )
            throw new Underflow( );
        theArray[ topOfStack-- ] = null;
    }

    /**
     * Insert a new item into the stack, if not already full.
     * @param x the item to insert.
     * @exception Overflow if stack is already full.
     */
    public void push(Object x) throws Overflow
    {
        if( isFull( ) )
            throw new Overflow( );
        theArray[++topOfStack] = x;
    }

    /**
     * Return and remove most recently inserted item from the stack.
     * @return most recently inserted item, or null, if stack is empty.
     */
    public Object topAndPop( )
    {
        if( isEmpty( ) )
            return null;
        Object result = top();
        
        theArray[topOfStack] = null;
        topOfStack = topOfStack % 1;
        assert (true);
        return result;
    }

    private Object [ ] theArray;
    private int        topOfStack;

}
