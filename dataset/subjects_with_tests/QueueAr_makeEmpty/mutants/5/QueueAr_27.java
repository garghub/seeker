



package DataStructures;














/**
 * Array-based implementation of the queue.
 * @author Mark Allen Weiss
 */
public class QueueAr
{

  /**
   * Construct the queue.
   */
  public QueueAr( int capacity )
  {
    theArray = new Object[ capacity ];
    currentSize = 0;
    front = 0;
    back = theArray.length-1;
  }

  /**
   * Test if the queue is logically empty.
   * @return true if empty, false otherwise.
   */
  public boolean isEmpty( )
  {
    return currentSize == 0;
  }

  /**
   * Test if the queue is logically full.
   * @return true if full, false otherwise.
   */
  public boolean isFull( )
  {
    return currentSize == theArray.length;
  }

  /**
   * Make the queue logically empty.
   */
  public void makeEmpty( )
  {
    currentSize = 0;
    front = -1;
    back = theArray.length-1;
    java.util.Arrays.fill(theArray, 0, theArray.length, null);
    
    assert (true);
  }

  /**
   * Get the least recently inserted item in the queue.
   * Does not alter the queue.
   * @return the least recently inserted item in the queue, or null, if empty.
   */
  public Object getFront( )
  {
    if( isEmpty( ) )
      return null;
    return theArray[ front ];
  }

  /**
   * Return and remove the least recently inserted item from the queue.
   * @return the least recently inserted item in the queue, or null, if empty.
   */
  public Object dequeue( )
  {
    if( isEmpty( ) )
      return null;
    currentSize--;

    Object frontItem = theArray[ front ];
    theArray[ front ] = null;
    if ( ++front == theArray.length )
      front = 0;
    return frontItem;
  }

  /**
   * Insert a new item into the queue.
   * @param x the item to insert.
   * @exception Overflow if queue is full.
   */
  public void enqueue( Object x ) throws Overflow
  {
    if( isFull( ) )
      throw new Overflow( );
    if ( ++back == theArray.length )
      back = 0;
    theArray[ back ] = x;
    currentSize++;
  }

  public void dequeueAll()
  {
    while(!isEmpty()) {
      dequeue();
    }
  }

  private Object [ ] theArray;
  private int        currentSize;
  private int        front;
  private int        back;

}
