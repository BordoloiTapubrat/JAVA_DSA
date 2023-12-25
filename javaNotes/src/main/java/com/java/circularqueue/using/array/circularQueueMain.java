package com.java.circularqueue.using.array;

public class circularQueueMain {

	public static void main(String[] args) {
		
		circularQueueUsingArray q = new circularQueueUsingArray(6);
		
		q.enqueue(1);
		q.enqueue(2);
		q.enqueue(3);
		q.enqueue(4);
		q.enqueue(5);
		q.enqueue(6);
		q.enqueue(7);
		
		System.out.println(q.peek());
		
		q.Dequeue();
		System.out.println(q.peek());
		q.Dequeue();
		System.out.println(q.peek());
		q.enqueue(7);
		q.enqueue(8);
		
		while(!q.isEmpty())
		{
			System.out.println("Loop "+q.peek());
			q.Dequeue();
		}
		
		

	}

}
