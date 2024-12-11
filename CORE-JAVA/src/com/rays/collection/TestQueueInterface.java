package com.rays.collection;

import java.util.ArrayDeque;
import java.util.Queue;

public class TestQueueInterface {

	public static void main(String[] args) {

		// fifo
		Queue q = new ArrayDeque();

		q.offer(5);
		q.offer(3);
		q.offer(1);
		q.offer(4);
		q.offer(2);
		q.offer(2);
		q.offer(2);

		System.out.println("Queue: " + q);

		q.remove(2);

		System.out.println("Queue after remove 2: " + q);

		System.out.println("peek method get first e: " + q.peek());

		// poll method remove e from first
		while (!q.isEmpty()) {

			System.out.println(q.poll());

		}

		System.out.println("queue: " + q);

	}

}
