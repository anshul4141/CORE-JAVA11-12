package com.rays.javacollection;

import java.util.ArrayDeque;
import java.util.Iterator;

public class ArrayDequeExample {
	
	public static void main(String[] args) {

		ArrayDeque q = new ArrayDeque();

		// offer pool peek = addition methods

		q.offer(4);
		q.offer(1);
		q.offer(3);
		q.offerLast(5);
		q.offerFirst(2);

		System.out.println(q);

		// peekLast() get last element
		System.out.println(q.peek() + " get top element");
		System.out.println(q);

		// top get and remove last element
		System.out.println(q.poll() + " get top element and remove");
		System.out.println(q);

//		q.forEach(System.out::println);

		Iterator it = q.iterator();

		while (it.hasNext()) {

			System.out.println(it.next());

		}

	}

}
