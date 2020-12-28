package com.bit.day11;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class Ex09 {

	public static void main(String[] args) {
		Date d1=new Date();
		System.out.println(d1);
//		DateFormat df=DateFormat.getDateInstance(DateFormat.LONG,Locale.CHINA);
//		String d2=df.format(d1);
////		String d2 = DateFormat.getDateInstance().format(d1);
//		System.out.println(d2); 
		
		SimpleDateFormat sdf;
		sdf=new SimpleDateFormat("yyyy.MM.dd hh:mm:ss");
		String d3=sdf.format(d1);
		System.out.println(d3);
		
	}

}







