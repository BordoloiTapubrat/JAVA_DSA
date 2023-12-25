package com.java.queue.using.collections;

import java.util.LinkedList;
import java.util.Queue;

public class QueueUsingCollections {

	public static void main(String[] args) {
		
		Queue<Integer> q = new LinkedList<>();

		q.add(1);
		q.add(2);
		q.add(3);
		q.add(4);
		
		System.out.println("1st Item in the queue - "+q.peek());
		
		q.remove();
		q.remove();
		System.out.println("1st Item in the Queue After Removing two items - "+q.peek());
		
		System.out.println(q.poll());
		
	
	}

}
