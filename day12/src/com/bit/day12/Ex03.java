package com.bit.day12;

import java.util.ArrayList;
import java.util.LinkedList;

public class Ex03 {

	public static void main(String[] args) {
		ArrayList list1=new ArrayList(0);
		long before=System.currentTimeMillis();
		for(int i=0; i<1000000; i++) {
			list1.add("추가"+i);
		}
		long after=System.currentTimeMillis();
		System.out.println(after-before);
		
		LinkedList list2=new LinkedList();
		before=System.currentTimeMillis();
		for(int i=0; i<1000000; i++) {
			list2.add("추가"+i);
		}
		after=System.currentTimeMillis();
		System.out.println(after-before);
		
		Object temp=null;
		before=System.currentTimeMillis();
		for(int i=0; i<100000; i++) {
			temp=list1.get(i);
		}
		after=System.currentTimeMillis();
		System.out.println(after-before);
	}

}









