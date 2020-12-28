package com.bit.day12;

import java.util.HashSet;
import java.util.Iterator;

public class Ex09 {

	public static void main(String[] args) {
		java.util.Set set1=new HashSet();
		set1.add(1111);
		set1.add(2222);
		set1.add(3333);
		set1.add(4444);
		set1.add(5555);
		set1.add(2222);
		
		Iterator ite = set1.iterator();
		while(ite.hasNext()) {
			Object obj=ite.next();
			obj=new Object();
		System.out.println(obj);
		}
		System.out.println("---------------------------");
		ite = set1.iterator();
		while(ite.hasNext()) {
		System.out.println(ite.next());
		}
		
	}

}
