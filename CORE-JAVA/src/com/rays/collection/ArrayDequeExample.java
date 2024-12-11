package com.rays.collection;

import java.util.ArrayDeque;
import java.util.Iterator;

public class ArrayDequeExample {

	public static void main(String[] args) {

		ArrayDeque q = new ArrayDeque();

		q.offer(4);
		q.offer(1);
		q.offer(3);
		q.offerFirst(2);
		q.offerLast(5);

		System.out.println(q);

		System.out.println("peek method get first e: " + q.peek());
		System.out.println(q);

		System.out.println("poll method remove first e: " + q.poll());
		System.out.println(q);

		Iterator it = q.iterator();

		while (it.hasNext()) {

			System.out.println(it.next());

		}

	}

}
