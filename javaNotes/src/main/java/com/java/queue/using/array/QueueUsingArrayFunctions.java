package com.java.queue.using.array;

public class QueueUsingArrayFunctions {

	int arr[];
	int size;
	int front = -1;
	int rear = -1;

	public QueueUsingArrayFunctions(int n) {
		arr = new int[n];
		this.size = n;
	}

	public Boolean isEmpty() {
		return rear == -1;
	}

	public void enqueue(int data) {
		if (rear == arr.length - 1) {
			System.out.println("Queue is Full");
			return;
		}

		rear++;
		arr[rear] = data;

	}

	public int dequeue() {
		if (isEmpty()) {
			System.out.println("Queue is Empty");
			return -1;
		}

		int data = arr[0];

		// Move All the Elements by index 1
		for (int i = 0; i < rear; i++) {
			arr[i] = arr[i + 1];
		}

		// Reduce rear Index By 1
		rear--;

		return data;
	}

	public int peek() {
		if (isEmpty()) {
			System.out.println("Queue is Empty");
			return -1;
		}

		int data = arr[0];

		return data;
	}

}
