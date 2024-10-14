package com.rays.collection;

import java.util.Stack;

public class StackExample {

	public static void main(String[] args) {

		Stack s = new Stack();

		s.push('a');
		s.push('b');
		s.push('c');

		while (!s.isEmpty()) {

			System.out.println(s.pop());

		}

		System.out.println(s);

	}

}
