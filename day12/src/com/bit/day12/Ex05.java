package com.bit.day12;

import java.util.Stack;

public class Ex05 {

	public static void main(String[] args) {
		// Stack - LIFO (last-in-first-out)
		Stack stack=new Stack();
		stack.push("첫번째");
		stack.push("두번째");
		stack.push("세번째");
		stack.push("네번째");
		System.out.println(stack.search("세번째"));
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






