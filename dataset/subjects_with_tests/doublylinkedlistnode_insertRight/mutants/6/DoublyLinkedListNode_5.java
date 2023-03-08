package examples;


/**
 * This class implements the NODE class from the file node.e in the Eiffel project AutoProof
 * 
 * @author Facundo Molina (with modifications by N. Aguirre)
 */
public class DoublyLinkedListNode {

    /**
     * Left neighbour
     */ 
    private DoublyLinkedListNode left;

    /**
    * Right neighbour
    */ 
    private DoublyLinkedListNode right; 

    /**
     * Creates a singleton node.
     */
    public DoublyLinkedListNode() {
        left = this;
        right = this;
    }

    /**
     * Inserts node `n' to the right of the current node.
     */
    public void insertRight(DoublyLinkedListNode n) {
        
        
        
        
        if (n == null) throw new IllegalArgumentException("undefined for null parameter");
        if (n.left != n) throw new IllegalArgumentException("parameter is not singleton");

        DoublyLinkedListNode r = null;
        n.setRight(r);
        n.setLeft(this);
        r.setLeft(n);
        setRight(n);

        
        
        
        assert (true);
    }

    /**
     * Removes the current node from the list.
     */
    public void remove() {
        
        
        
        

        DoublyLinkedListNode l = left;
        DoublyLinkedListNode r = right;
        setLeft(this);
        setRight(this);
        l.setRight(r);
        r.setLeft(l);

        
        
        
        
        
    }

    /**
     * Sets left neighbor to `n'.
     */
    private void setLeft(DoublyLinkedListNode n) {
        left = n; 
    }

    /**
     * Sets right neighbour to `n'.
     */
    private void setRight(DoublyLinkedListNode n) {
        right = n; 
    }

}
