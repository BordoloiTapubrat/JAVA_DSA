/**
 * 
 */
package com.java.stack.using.linkedList;

/**
 * @author tapubrat
 *
 */
public class StackUsingLinkedList {

	public static Node head;

	public static Boolean isEmpty() {
		return head == null;
	}

	public void push(int data) {
		Node node = new Node(data);

		if (isEmpty()) {
			head = node;
			return;
		}

		node.next = head;
		head = node;
	}

	public int pop() {
		if (isEmpty())
			return -1;

		int data = head.data;
		head = head.next;
		return data;
	}

	public int peek() {
		if (isEmpty())
			return -1;

		int data = head.data;
		return data;
	}

}
