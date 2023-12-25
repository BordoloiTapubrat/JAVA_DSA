package com.java.queue.using.array;

public class QueueMain {

	public static void main(String[] args) {

		QueueUsingArrayFunctions queue = new QueueUsingArrayFunctions(5);

		System.out.println("Adding Element 1 in the Queue");
		queue.enqueue(1);
		System.out.println("Adding Element 2 in the Queue");
		queue.enqueue(2);
		System.out.println("Adding Element 3 in the Queue");
		queue.enqueue(3);
		System.out.println("Adding Element 4 in the Queue");
		queue.enqueue(4);
		System.out.println("Adding Element 5 in the Queue");
		queue.enqueue(5);

		System.out.println("Front Element of the Queue is " + queue.peek());
		
		System.out.print("Removing First Element from the Queue - ");
		System.out.println(queue.dequeue());

		System.out.println("Front Element of the Queue is " + queue.peek());

		System.out.println("Adding Element 6 in the Queue");
		queue.enqueue(6);
		
		System.out.println("Adding Element 7 in the Queue");
		queue.enqueue(7);

		System.out.println("Queue is ");
		while (!queue.isEmpty()) {
			System.out.print(queue.peek() +" --> ");
			queue.dequeue();
		}

	}

}
