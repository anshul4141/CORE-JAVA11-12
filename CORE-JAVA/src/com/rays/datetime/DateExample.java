package com.rays.datetime;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateExample {

	public static void main(String[] args) throws ParseException {

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");

		Date d = new Date();

		System.out.println(sdf.format(d));

		System.out.println("---------------------");

		String date = "2002/01/25";

		Date d1 = sdf.parse(date);

		System.out.println(d1);

	}

}
