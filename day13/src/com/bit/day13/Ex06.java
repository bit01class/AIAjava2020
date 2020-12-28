package com.bit.day13;

import java.util.ArrayList;

public class Ex06 {

	public static void main(String[] args) {
		// 1.7~~
		ArrayList<Integer> list;
//		list=new ArrayList<>();
		list=new ArrayList();
		list.add(1111);
		list.add(2222);
//		list.add("");
		
		ArrayList<?> list2;
		list2=new ArrayList<Integer>();
		list.add(3333);
//		list.add("test");
	}

}








