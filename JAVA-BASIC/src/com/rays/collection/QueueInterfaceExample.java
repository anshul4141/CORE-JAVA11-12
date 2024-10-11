package com.rays.collection;

import java.util.ArrayDeque;
import java.util.Queue;

public class QueueInterfaceExample {

	public static void main(String[] args) {

		Queue q = new ArrayDeque();

		q.offer(5);
		q.offer(7);
		q.offer(8);

		System.out.println("queue = " + q);

		System.out.println("peek only get first element fifo = " + q.peek());

		System.out.println("queue = " + q);

		q.poll();

		System.out.println("queue = " + q);

		q.poll();

		System.out.println("queue = " + q);

	}

}
