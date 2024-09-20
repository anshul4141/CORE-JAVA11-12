package com.rays.basic;

public class ReverseNo {

	public static void main(String[] args) {

		int no = 123;
		int r = 0;
		int rno = 0;
		int temp = no;

		while (temp != 0) {

			r = temp % 10;
			rno = (rno * 10) + r;
			temp = temp / 10;

		}

		System.out.println(rno);

	}

}
