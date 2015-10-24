/**
 *
 * Stack.java
 *
 * The Stack class represents a last-in-first-out (LIFO) stack of CharNodes.
 * It supports the standard isEmpty, push, pop methods for a Stack ADT. 
 *
 * Momo Ozawa | Jan 27, 2015
 *
 */ 

import java.util.EmptyStackException;

public class Stack {
	/* top: the top CharNode in a stack*/
	private CharNode top;
	
	/* Stack: initialize an empty stack*/
	public Stack() {
		top = null;
	}
	
	/* isEmpty: returns true if the stack is empty, false if otherwise*/
	public boolean isEmpty() {
		return top == null;
	}
	
	/* push: pushes a letter on to the top of the stack*/
	public void push(char letter) {
		top = new CharNode(letter, top);
	}
	
	/* pop: if the stack isn't empty, pops and returns a letter from the top of the stack;
	 * throws an exception otherwise.
	 */
	public char pop() {
		if (isEmpty()) {
		    throw new EmptyStackException();
		}
		
		char letter = top.data;
		top = top.next;
		return letter;
	}
}
