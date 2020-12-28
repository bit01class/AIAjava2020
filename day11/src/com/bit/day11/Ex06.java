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
		System.out.println(me.get(Calendar.DAY_OF_YEAR)+"��°");
		System.out.println(me.get(Calendar.WEEK_OF_MONTH)+"����");
		System.out.println(me.get(Calendar.WEEK_OF_YEAR)+"����");
		System.out.println(me.get(1));
		System.out.println(me.get(Calendar.YEAR)+"��");
		// MONTH : 0 ~ 11
		System.out.println(me.get(2)+1);
		System.out.println(me.get(Calendar.MONTH)+1+"��");
		
		System.out.println(me.get(Calendar.DATE)+"��");
		System.out.println(me.get(Calendar.DAY_OF_MONTH)+"��");
		//SUNDAY(1), MONDAY(2), TUESDAY(3),
		//WEDNESDAY(4), THURSDAY(5), FRIDAY(6), SATURDAY(7)
		char week='-';
		if(me.get(Calendar.DAY_OF_WEEK)==Calendar.SUNDAY) {
			week='��';
		}else if(me.get(Calendar.DAY_OF_WEEK)==Calendar.MONDAY) {
			week='��';
		}else if(me.get(Calendar.DAY_OF_WEEK)==Calendar.TUESDAY) {
			week='ȭ';
		}else if(me.get(Calendar.DAY_OF_WEEK)==Calendar.WEDNESDAY) {
			week='��';
		}else if(me.get(Calendar.DAY_OF_WEEK)==Calendar.THURSDAY) {
			week='��';
		}else if(me.get(Calendar.DAY_OF_WEEK)==Calendar.FRIDAY) {
			week='��';
		}else if(me.get(Calendar.DAY_OF_WEEK)==Calendar.SATURDAY) {
			week='��';
		}
		System.out.println(week+"����");
		
		if(me.get(Calendar.AM_PM)==0) {
			System.out.println("am.");
		}else {
			System.out.println("pm.");
		}
		System.out.println(me.get(Calendar.HOUR)+"��");
		System.out.println(me.get(Calendar.HOUR_OF_DAY)+"��");//0~23��
		System.out.println(me.get(Calendar.MINUTE)+"��");
		System.out.println(me.get(Calendar.SECOND)+"��");
	}

}












