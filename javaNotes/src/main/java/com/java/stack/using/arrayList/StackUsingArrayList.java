/**
 * 
 */
package com.java.stack.using.arrayList;

import java.util.ArrayList;

/**
 * @author tapubrat
 *
 */
public class StackUsingArrayList {

	ArrayList<Integer> stackList = new ArrayList<>();

	public Boolean isEmpty() {
		return stackList.isEmpty();
	}

	public void push(int data) {
		stackList.add(data);
	}

	public int pop() {
		if (isEmpty())
			return -1;

		int data = stackList.get(stackList.size() - 1);
		stackList.remove(stackList.size() - 1);
		return data;

	}

	public int peek() {
		if (isEmpty())
			return -1;

		int data = stackList.get(stackList.size() - 1);
		return data;

	}

}
