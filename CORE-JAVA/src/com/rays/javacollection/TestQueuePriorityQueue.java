package com.rays.javacollection;

import java.util.PriorityQueue;

public class TestQueuePriorityQueue {
	
	public static void main(String[] args) {
		
		PriorityQueue p = new PriorityQueue();
		
		p.add(5);
		p.offer(2);
		p.offer(1);
		
		System.out.println(p);
		
		System.out.println(p.peek());
		System.out.println(p);
		System.out.println(p.poll());
		System.out.println(p);
		
	}

}
