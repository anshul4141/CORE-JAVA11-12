package com.rays.collection;

import java.util.Stack;

public class TestStack {

	public static void main(String[] args) {

		// lifo
		Stack s = new Stack();

		for (char c = 'a'; c <= 'z'; c++) {

			s.push(c);

		}

		System.out.println("stack = " + s);
		System.out.println(s.pop());
		System.out.println("stack = " + s);
		System.out.println(s.pop());
		System.out.println("stack = " + s);
		System.out.println(s.peek());
		System.out.println("stack = " + s);

	}

}
