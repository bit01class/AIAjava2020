package com.bit.day12;

import java.util.Stack;

public class Ex05 {

	public static void main(String[] args) {
		// Stack - LIFO (last-in-first-out)
		Stack stack=new Stack();
		stack.push("ù��°");
		stack.push("�ι�°");
		stack.push("����°");
		stack.push("�׹�°");
		System.out.println(stack.search("����°"));
		while(!stack.empty()) {
			System.out.println(stack.pop());
		}
//		try {
//			while(true) {
//				System.out.println(stack.peek());
//				stack.pop();
//			}
//		}catch(Exception e) {
//			e.printStackTrace();
//		}
	}

}






