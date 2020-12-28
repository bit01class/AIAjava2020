package com.bit.day12;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public class Ex02 {

	public static void main(String[] args) {
//		ArrayList list1=new ArrayList(4);
		LinkedList list1=new LinkedList();
		list1.add(1111);
		list1.add(2222);
		list1.add(3333);
		list1.add(4444);
		
		// 깊은복사
		ArrayList list2=new ArrayList(list1);
		// 얕은복사
//		ArrayList list2=list1;
		
		System.out.println(list1.add(5555));
//		list1.add("문자열");
//		list1.add('@');
//		list1.add(true);
//		list1.add(new char[] {'a','b','c'});
		list1.add(3,"추가");
		
		ArrayList list4=new ArrayList();
		list4.addAll(list1);
		
		list2.clear();
		
		
		Object obj=list1.clone();
		LinkedList list3=(LinkedList)obj;
//		list3.add(6);
		list3.remove("추가");
//		list3.remove(new Integer(6));
//		list3.removeAll(list1);
//		java.util.List list5=list3.subList(0, 2);
		
		Object[] list6=list3.toArray();
//		int[] list7=(Integer[])list6; //x
		
		
		for(int i=0; i<list3.size(); i++) {
			Object ele=list3.get(i);
			System.out.println(ele.toString());
//			System.out.println(list1.get(i)+1);
		}
		System.out.println("----------------");
		System.out.println(list3.contains("추가"));
		System.out.println(list3.indexOf("추가"));
		System.out.println(list2.isEmpty());
//		System.out.println(Arrays.toString(list7));
		
	}

}








