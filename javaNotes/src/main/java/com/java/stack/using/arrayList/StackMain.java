package com.java.stack.using.arrayList;

public class StackMain {

	public static void main(String[] args) {

		StackUsingArrayList st = new StackUsingArrayList();

		System.out.println("Stack Using ArrayList - Push Item 1 ");
		st.push(1);
		System.out.println("Stack Using ArrayList - Push Item 2 ");
		st.push(2);
		System.out.println("Stack Using ArrayList - Push Item 3 ");
		st.push(3);
		System.out.println("Stack Using ArrayList - Push Item 4 ");
		st.push(4);

		System.out.println("Stack Using ArrayList - Top Item Peek - " + st.peek());

		st.pop();

		System.out.println("Stack Using ArrayList - New Top Item Peek After Poping " + st.peek());

		System.out.println("Stack Using ArrayList - Push Item 5 ");

		st.push(5);

		while (!st.isEmpty()) {
			System.out.println("Stack Using ArrayList - Looping for Top Item Peek - " + st.peek());
			st.pop();
		}

	}

}
