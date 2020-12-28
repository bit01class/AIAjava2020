package com.bit.day11;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Ex07 {

	public static void main(String[] args) {
		GregorianCalendar cal;
		cal=new GregorianCalendar(2002,1,1,13,0);
		System.out.print(cal.get(Calendar.YEAR)+".");
		System.out.print(cal.get(Calendar.MONTH)+1+".");
		System.out.print(cal.get(Calendar.DATE)+"  ");
		System.out.print(cal.get(Calendar.HOUR_OF_DAY)+":");
		System.out.print(cal.get(Calendar.MINUTE)+":");
		System.out.println(cal.get(Calendar.SECOND));
		//
		System.out.println(cal.getActualMaximum(Calendar.DATE));
	}

}
