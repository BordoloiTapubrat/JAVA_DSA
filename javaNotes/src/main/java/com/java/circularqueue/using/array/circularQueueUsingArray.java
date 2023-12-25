package com.java.circularqueue.using.array;

public class circularQueueUsingArray {

	int arr[];
	int size;

	int rear = -1;
	int front = -1;

	public circularQueueUsingArray(int n) {
		arr = new int[n];
		this.size = n;
	}

	public Boolean isEmpty() {
		return rear == -1 && front == -1;
	}

	public Boolean isFull() {
		return (rear + 1) % size == front;
	}

	public void enqueue(int data) {
		if (isFull()) {
			System.out.println("Queue is Full");
			return;
		}

		// In Case of 1st Element
		if (front == -1) {
			front = 0;
		}

		rear = (rear + 1) % size;
		arr[rear] = data;
	}

	public int Dequeue() {
		if (isEmpty()) {
			System.out.println("Queue is Empty");
			return -1;
		}

		int data = arr[front];

		// In case of Single Element
		if (front == rear) {
			rear = front = -1;
		} else {
			front = (front + 1) % size;
		}

		return data;

	}

	public int peek() {
		if (isEmpty()) {
			System.out.println("Queue is Empty");
			return -1;
		}

		int data = arr[front];
		return data;
	}

}
