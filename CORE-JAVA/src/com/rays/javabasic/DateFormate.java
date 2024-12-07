package com.rays.javabasic;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;

public class DateFormate {

	public static void main(String[] args) {

		Date d = new Date();

		System.out.println(d);

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

		System.out.println(sdf.format(d));

		LocalDate empDob = LocalDate.of(2002, 05, 25);

		System.out.println(empDob);

	}

}
