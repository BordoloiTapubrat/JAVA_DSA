/**
 * 
 */
package com.java.stack.using.collections;

import java.util.Stack;

/**
 * @author tapubrat
 *
 */
public class StackUsingCollection {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		System.out.println(" -- Stack Using Collection -- ");
		
		Stack<Integer> st = new Stack<>();
		
		System.out.println("Stack Using Collection push item 1");
		st.push(1);
		System.out.println("Stack Using Collection push item 2");
		st.push(2);
		System.out.println("Stack Using Collection push item 3");
		st.push(3);
		System.out.println("Stack Using Collection push item 4");
		st.push(4);
		System.out.println("Stack Using Collection push item 5");
		st.push(5);
		
		System.out.println("Stack Using Collection peek Top Item  "+st.peek());
		
		while(!st.isEmpty())
		{
			System.out.println("Stack Using Collection and Looping and Peek Top "+st.peek());
			st.pop();
		}

	}

}
