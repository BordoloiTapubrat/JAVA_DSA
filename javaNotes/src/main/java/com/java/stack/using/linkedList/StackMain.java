/**
 * 
 */
package com.java.stack.using.linkedList;

/**
 * @author tapubrat
 *
 */
public class StackMain {

	public static void main(String[] args) {

		StackUsingLinkedList st = new StackUsingLinkedList();

		System.out.println("Stack Using Linked List - Push Node with Data 1");
		st.push(1);
		System.out.println("Stack Using Linked List - Push Node with Data 2");
		st.push(2);
		System.out.println("Stack Using Linked List - Push Node with Data 3");
		st.push(3);
		System.out.println("Stack Using Linked List - Push Node with Data 4");
		st.push(4);
		System.out.println("Current Top is " + st.peek());

		while (!StackUsingLinkedList.isEmpty()) {
			System.out.println("Looping Current Top is " + st.peek());
			st.pop();
		}

		st.push(5);
		System.out.println("Pushing Element 5");
		while (!StackUsingLinkedList.isEmpty()) {
			System.out.println("Current Top is " + st.peek());
			st.pop();
		}

	}

}
