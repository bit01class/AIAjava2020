package com.bit.day12;

import java.util.ArrayList;
import java.util.LinkedList;

public class Ex04 {
	// Queue -> FIFO (first-in-first-out)
	public static void main(String[] args) {
		java.util.Queue que=new LinkedList();
		que.offer("1��°");
		que.offer("2��°");
		que.offer("3��°");
		que.offer("4��°");
		
//		while(que.peek()!=null) {
//			System.out.println(que.poll());
//		}
		
		while(true) {
			Object obj=que.peek();
			if(obj==null) {break;}
			System.out.println(obj);
			que.poll();
		}
	}

}







