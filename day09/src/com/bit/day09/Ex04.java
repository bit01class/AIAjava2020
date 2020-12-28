package com.bit.day09;

public class Ex04 implements Cloneable{

	public static void main(String[] args) {
		Ex04 me=new Ex04();
		Object obj;
		try {
			obj = func01(me);
			System.out.println(me);
			System.out.println(obj);
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
	}

	public static Object func01(Ex04 me) throws CloneNotSupportedException{
		Object obj=null;
			obj=me.clone();
		return obj;
	}
}
