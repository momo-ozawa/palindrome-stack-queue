/**
 *
 * Queue.java
 *
 * The Queue class represents a first-in-first-out (FIFO) queue of CharNodes.
 * It supports the standard isEmpty, enqueue, dequeue methods for a Queue ADT.
 *
 * Momo Ozawa | Jan 27, 2015
 *
 */ 

import java.util.NoSuchElementException;

public class Queue {
	/* head: the CharNode in the very front of a queue
	 * tail: the CharNode in the very back of a queue
	 */
	private CharNode head;
	private CharNode tail;
	
	/* Stack: initialize an empty Queue*/
	public Queue() {
		head = null;
		tail = null;
	}
	
	/* isEmpty: returns true if the queue is empty, false if otherwise*/
	public boolean isEmpty() {
		return head == null && tail == null;
	}
	
	/* enqueue: enqueues a letter at the back (tail) of the queue*/
	public void enqueue(char letter) {
		CharNode newNode = new CharNode(letter, null);
		
		if (isEmpty()) 
			head = newNode;
		else
			tail.next = newNode;
		
		tail = newNode;
	}
	
	/* dequeue: if the queue isn't empty, dequeues and returns a letter from the 
	 * front (head) of the queue; throws an exception otherwise.
	 */
	public char dequeue() {
		if (isEmpty()) {
		    throw new NoSuchElementException();
		}
		
		if (tail == head) {
			tail = null;
		}
		
		char letter = head.data;
		head = head.next;
		return letter;
	}
}
