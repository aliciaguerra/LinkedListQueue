/*
Alicia Guerra
masc 0879
*/
package data_structures;
import java.util.NoSuchElementException;
public class LinkedQueue<E> implements QueueADT<E> {
private Node<E> head = null;
private Node<E> tail;
private int currentSize;

/*Construct the queue.*/
   public LinkedQueue(){
        head=tail=null; 
    } 

/*Returns the number of elements in the queue*/   
    @Override
    public int size() {
         return currentSize; 
    }

    @Override
    public boolean isEmpty() {
        return head==null; 
    }

/*Inserts an element at the rear of the queue.*/    
    @Override
    public void enqueue(E e) {
  
    }

    @Override
    public E first() {  
        if(head==null){
            throw new NoSuchElementException();
        }
        return head.data;
    }

    @Override
    public E dequeue() {
    if(isEmpty()){
        throw new NoSuchElementException();
    }
    E item=head.data;
    if(tail==head){
        tail=null;
    }
    head=head.next;
    return item;
    }
  
/*Basic node stored in a linked list.*/    
    public class Node<E>{
    public Node(E e){
        this.data=e;
    }
    public Node<E> next;
    public Node<E> previous;
    public E data;
}
}
