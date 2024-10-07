package com.rays.basic;

public class ReverseNo {

	public static void main(String[] args) {

		int no = 255;
		int r = 0;
		int rno = 0;
		int temp = no;

		while (temp != 0) {

			r = temp % 10;
			// System.out.println(r);
			rno = (rno * 10) + r;
			// System.out.println(rno);
			temp = temp / 10;
			// System.out.println(temp);

		}

		System.out.println(rno);

	}

}
