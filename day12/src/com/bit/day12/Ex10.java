package com.bit.day12;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Ex10 {

	public static void main(String[] args) {
		Set set1=new HashSet();
		System.out.println(set1.add(1111));
		System.out.println(set1.add(2222));
		System.out.println(set1.add(1111));
		List list1=new ArrayList();
		list1.add(3333);
		list1.add(4444);
		Set set2=new HashSet(list1);
//		set2.clear();
		System.out.println(set2.isEmpty());
		
		Iterator ite = set2.iterator();
		for(int i=0; i<set2.size(); i++) {
			System.out.println(ite.next());
		}
		set2.remove(3333);
		System.out.println(set2.contains(3333));
	}

}
