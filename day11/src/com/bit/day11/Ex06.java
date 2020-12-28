package com.bit.day11;

import java.util.Calendar;

class Test01{
	private static Test01 me=new Test01();
	private Test01() {
	}
	public static Test01 getInstance() {
		return me;
	}
	public String toString() {
		return "Test01 class...";
	}
}

public class Ex06 {

	public static void main(String[] args) {
		Calendar me=Calendar.getInstance();
		
		me.set(Calendar.YEAR, 2002);
		me.set(Calendar.MONTH, 4);
		
		System.out.println(me);
		System.out.println(me.get(Calendar.DAY_OF_YEAR)+"일째");
		System.out.println(me.get(Calendar.WEEK_OF_MONTH)+"주차");
		System.out.println(me.get(Calendar.WEEK_OF_YEAR)+"주차");
		System.out.println(me.get(1));
		System.out.println(me.get(Calendar.YEAR)+"년");
		// MONTH : 0 ~ 11
		System.out.println(me.get(2)+1);
		System.out.println(me.get(Calendar.MONTH)+1+"월");
		
		System.out.println(me.get(Calendar.DATE)+"일");
		System.out.println(me.get(Calendar.DAY_OF_MONTH)+"일");
		//SUNDAY(1), MONDAY(2), TUESDAY(3),
		//WEDNESDAY(4), THURSDAY(5), FRIDAY(6), SATURDAY(7)
		char week='-';
		if(me.get(Calendar.DAY_OF_WEEK)==Calendar.SUNDAY) {
			week='일';
		}else if(me.get(Calendar.DAY_OF_WEEK)==Calendar.MONDAY) {
			week='월';
		}else if(me.get(Calendar.DAY_OF_WEEK)==Calendar.TUESDAY) {
			week='화';
		}else if(me.get(Calendar.DAY_OF_WEEK)==Calendar.WEDNESDAY) {
			week='수';
		}else if(me.get(Calendar.DAY_OF_WEEK)==Calendar.THURSDAY) {
			week='목';
		}else if(me.get(Calendar.DAY_OF_WEEK)==Calendar.FRIDAY) {
			week='금';
		}else if(me.get(Calendar.DAY_OF_WEEK)==Calendar.SATURDAY) {
			week='토';
		}
		System.out.println(week+"요일");
		
		if(me.get(Calendar.AM_PM)==0) {
			System.out.println("am.");
		}else {
			System.out.println("pm.");
		}
		System.out.println(me.get(Calendar.HOUR)+"시");
		System.out.println(me.get(Calendar.HOUR_OF_DAY)+"시");//0~23시
		System.out.println(me.get(Calendar.MINUTE)+"분");
		System.out.println(me.get(Calendar.SECOND)+"초");
	}

}












