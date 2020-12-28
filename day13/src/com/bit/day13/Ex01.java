package com.bit.day13;

import java.util.ArrayList;

public class Ex01 {

	public static void main(String[] args) {
		// 제네릭(1.5~)-문법적 제약
		// 주의-기본자료형x
		ArrayList<Comparable> list=new ArrayList<Comparable>();
		list.add(1111);
		list.add(2222);
		list.add(3333);
		list.add(4444);
		list.add(3.14);
//		list.add('@');
		list.add("aaaa");
//		list.add("bbbb");
//		list.add("cccc");
//		list.add("dddd");
		
		for(int i=0; i<list.size(); i++) {
			Comparable ele=list.get(i);
			System.out.println(ele);
		}
	}

}
