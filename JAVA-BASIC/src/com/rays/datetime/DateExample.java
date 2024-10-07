package com.rays.datetime;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateExample {

	public static void main(String[] args) throws ParseException {

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

		Date d = new Date();

		System.out.println(sdf.format(d));

		System.out.println("---------------");

		String dob = "2002-02-02";

		System.out.println(sdf.parse(dob));

	}

}
