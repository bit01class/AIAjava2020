package com.bit.day12;

import java.util.ArrayList;

public class Ex01 {

	public static void main(String[] args) {
		// 컬랙션 프레임워크 - 동적할당 자료구조
		// 순서o,제어권o - 선형자료구조
		java.util.ArrayList list=new ArrayList();
		list.add("첫번째");
		list.add("다섯번째");
		list.add("두번째");
		list.add("세번째");
		list.add("네번째");
		
//		System.out.println(list.get(0));
//		System.out.println(list.get(1));
//		System.out.println(list.get(2));
//		System.out.println(list.get(3));
		System.out.println(list.size());
		System.out.println("---------------------");
		list.set(1, "5번째");
		System.out.println("---------------------");
		list.remove(1);
		System.out.println("---------------------");
		
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
	}

}







