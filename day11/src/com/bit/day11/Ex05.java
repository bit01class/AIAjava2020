package com.bit.day11;

public class Ex05 {

	public static void main(String[] args) {
		// CRUD
		StringBuffer msg=new StringBuffer("abcd");
		
		System.out.println(msg.append("efg"));
		System.out.println(msg.insert(4, "ADD"));
		// msg = abcdADDefg
		msg.replace(4,7,"EDIT");
		System.out.println(msg);
		// msg = abcdEDITefg
		msg.delete(4, 8);
		System.out.println(msg);
		// msg = abcdefg
		System.out.println(msg.length());
		msg.reverse();
		System.out.println(msg);
	}

}









