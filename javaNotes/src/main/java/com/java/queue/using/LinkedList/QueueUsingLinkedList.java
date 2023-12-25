package com.java.queue.using.LinkedList;

public class QueueUsingLinkedList {

	Node head = null;
	Node tail = null;

	public Boolean isEmpty() {
		return head == null && tail == null;
	}

	public void enqueue(int data) {
		Node newNode = new Node(data);
		if (tail == null) {
			System.out.println("No Element");
			head = newNode;
			tail = newNode;
			return;
		}

		tail.next = newNode;
		tail = newNode;
	}

	public int dequeue() {
		if (isEmpty()) {
			return -1;
		}

		// When head is the last node, after printing the value
		// head is null but tail is still pointing to last node
		// This fails the contiodion isEmpty which call for both
		// the node to be null.
		// Now head is null and it doesnot have any data which will
		// Lead to exception.
		// Hence after last node value is printed and head is null
		// update tail also to be null which will eventually satify
		// the isEmpty condition to break out of the loop.
		if (head == tail) {
			tail = null;
		}

		int data = head.data;
		head = head.next;

		return data;
	}

	public int peek() {
		if (isEmpty()) {
			return -1;
		}

		int data = head.data;

		return data;
	}

}
