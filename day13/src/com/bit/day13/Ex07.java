package com.bit.day13;

import java.util.ArrayList;
import java.util.List;
// api 문서해석
class Box03<T extends Number>{
	T su;
	void set(T su) {
		this.su=su;
	}
	T get() {
		return su;
	}
	
	void func(java.util.List<? extends Number> list) {
		
	}
}

public class Ex07 {

	public static void main(String[] args) {
		Box03<Number> box=new Box03<>();
		box.set(1234);
//		System.out.println(box.get()+1);
		List<Integer> list=new ArrayList();
		box.func(list);
	}

}










