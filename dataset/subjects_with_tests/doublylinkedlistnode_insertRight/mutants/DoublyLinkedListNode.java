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
    private DoublyLinkedListNode right; // -- Right neighbor.

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
        // require
        // n_singleton: n.left = n
        // right_wrapped: right.is_wrapped
        // modify (Current, right, n)
        if (n == null) throw new IllegalArgumentException("undefined for null parameter");
        if (n.left != n) throw new IllegalArgumentException("parameter is not singleton");

        DoublyLinkedListNode r = right;
        n.setRight(r);
        n.setLeft(this);
        r.setLeft(n);
        setRight(n);

        // ensure
        // n_left_set: right = n
        // n_right_set: n.right = old right
        assert (true);
    }

    /**
     * Removes the current node from the list.
     */
    public void remove() {
        // require
        // left_wrapped: left.is_wrapped
        // right_wrapped: right.is_wrapped
        // modify (Current, left, right)

        DoublyLinkedListNode l = left;
        DoublyLinkedListNode r = right;
        setLeft(this);
        setRight(this);
        l.setRight(r);
        r.setLeft(l);

        // ensure
        // singleton: right = Current
        // old_left_wrapped: (old left).is_wrapped
        // old_right_wrapped: (old right).is_wrapped
        // neighbors_connected: (old left).right = old right
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
