package com.java.queue.using.LinkedList;

public class QueueLinkedListMain {

	public static void main(String[] args) {

		QueueUsingLinkedList q = new QueueUsingLinkedList();

		q.enqueue(1);
		q.enqueue(2);
		q.enqueue(3);
		q.enqueue(4);

		System.out.println("Peek " + q.peek());

		while (!q.isEmpty()) {
			System.out.println("Front Element On loop " + q.peek());
			q.dequeue();
		}
	}

}
