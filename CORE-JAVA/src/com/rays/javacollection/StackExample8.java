package com.rays.javacollection;

import java.util.Stack;

public class StackExample8 {

	public static void main(String[] args) {

		Stack s1 = new Stack();

		for (char ch = 'a'; ch <= 'z'; ch++) {

			s1.push(ch);

		}

		System.out.println("print first stack = " + s1);

		Stack s2 = new Stack();

		while (!s1.isEmpty()) {

			s2.push(s1.pop());

		}

		System.out.println("print second stack = " + s2);
		System.out.println(s1);

	}

}
