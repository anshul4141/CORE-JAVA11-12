package com.rays.dateclass;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormate {
	
	public static void main(String[] args) {
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		
		Date d = new Date();
		
		System.out.println(d);
		System.out.println(sdf.format(d));
		
	}

}
