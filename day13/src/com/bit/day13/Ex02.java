package com.bit.day13;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Ex02 implements Comparable<Ex02> {
	int su;
	
	public Ex02(int su) {
		this.su=su;
	}

	public static void main(String[] args) {
		Set<Ex02> set=new TreeSet<Ex02>();
		set.add(new Ex02(1111));
		set.add(new Ex02(3333));
		set.add(new Ex02(2222));
		set.add(new Ex02(4444));
//		set.add("두번째");
//		set.add("세번째");
//		set.add("네번째");
//		set.add(1111);
		
		Iterator<Ex02> ite = set.iterator();
		while(ite.hasNext()) {
			Ex02 ele=ite.next();
			System.out.println(ele.su);
		}
	}

	@Override
	public int compareTo(Ex02 o) {
		// 0이냐 양수냐 음수냐
		return 1;//this.su-o.su;
	}


}










