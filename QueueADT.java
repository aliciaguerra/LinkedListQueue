
package data_structures;

/**
 *
 * @author aiguerra
 * This ADT is based on Goodman - chapter 6.2
 * You will be implementing this as a linked list using your LinearList.java .
 * @param <E> the generic type 
 */
public interface QueueADT<E> {
  /**
   * Returns the number of elements in the queue.
   * @return number of elements in the queue
   */
  int size();

  /**
   * Tests whether the queue is empty.
   * @return true if the queue is empty, false otherwise
   */
  boolean isEmpty();

  /**
   * Inserts an element at the rear of the queue.
   * @param e  the element to be inserted
   */
  void enqueue(E e);

  /**
   * Returns, but does not remove, the first element of the queue.
   * @return the first element of the queue (or null if empty)
   */
  E first();

  /**
   * Removes and returns the first element of the queue.
   * @return element removed (or null if empty)
   */
  E dequeue();
}
