/**
 *
 * CharNode.java
 *
 * A node/linked list data structure. CharNode supports the standard fields 
 * for data and a pointer to the next CharNode as in a LinkedList ADT.
 *
 * Momo Ozawa | Jan 27, 2015
 *
 */ 

public class CharNode {
	/* data: the char stored in the CharNode
	 * next: pointer to the next CharNode
	 */
	public char data;
	public CharNode next;
	
	/* CharNode: constructor to build a node with a specified (perhaps null) successor*/
	public CharNode(char data, CharNode next) {
		this.data = data;
		this.next = next;
	   }
}