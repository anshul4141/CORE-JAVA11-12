package com.rays.java8;

import java.util.Arrays;

public class TestParallelSort {

	public static void main(String[] args) {

		int[] i = { 5, 2, 1, 4, 3 };

		Arrays.parallelSort(i);

		for (int j : i) {
			System.out.println(j);
		}

	}

}
