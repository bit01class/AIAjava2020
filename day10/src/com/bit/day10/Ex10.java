package com.bit.day10;

public class Ex10 {
	int su=1234;

	public static void main(String[] args) {
		Object obj=new Object();
		Class clz=obj.getClass();
		System.out.println(clz.getName());
//		System.out.println(obj);
//		System.out.println(Integer.toHexString(obj.hashCode()));
		Ex10 me=new Ex10();
		System.out.println(me.su);
		
		String data="com.bit.day10.Test08";
		try {
			Class clzz=Class.forName(data);
			Object obj2=clzz.newInstance();
			Test08 you=(Test08)obj2;
			System.out.println(you.test);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
			
		Class cls=com.bit.etc10.Ex01.class;
	}

}




