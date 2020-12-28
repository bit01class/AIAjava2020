package com.bit.day11;

import java.util.Date;

public class Ex08 {

	public static void main(String[] args) {
		Date d1=new Date();
//		d1.setYear(2002-1900);
//		d1.setMonth(4);
		System.out.println(d1);
		System.out.println(d1.getYear()+1900);
		System.out.println(d1.getMonth()+1);
		System.out.println(d1.getDate());
		//0 = Sunday, 1 = Monday, 2 = Tuesday, 3 = Wednesday, 4 = Thursday, 5 = Friday, 6 = Saturday
		System.out.println("("+d1.getDay()+")");
		System.out.println(d1.getHours());
		System.out.println(d1.getMinutes());
		System.out.println(d1.getSeconds());
		System.out.println(d1.getTime());
		System.out.println(System.currentTimeMillis());
	}

}








