package com.rays.javacolleaction;

import java.util.Stack;

public class TestStack {

	public static void main(String[] args) {

		Stack s1 = new Stack();

		s1.push('a');
		s1.push('b');
		s1.push('c');

		System.out.println(s1);
		
		System.out.println(s1.peek());
		
		System.out.println(s1);
		
		s1.pop();
		
		System.out.println(s1);

	}

}
