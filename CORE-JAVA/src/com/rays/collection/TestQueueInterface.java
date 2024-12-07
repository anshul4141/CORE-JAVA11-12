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
		
		q.remove(2);

		System.out.println(q);

		while (!q.isEmpty()) {

			System.out.println(q.poll());

		}

		System.out.println(q);

	}

}
