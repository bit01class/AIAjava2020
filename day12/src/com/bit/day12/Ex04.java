package com.bit.day12;

import java.util.ArrayList;
import java.util.LinkedList;

public class Ex04 {
	// Queue -> FIFO (first-in-first-out)
	public static void main(String[] args) {
		java.util.Queue que=new LinkedList();
		que.offer("1번째");
		que.offer("2번째");
		que.offer("3번째");
		que.offer("4번째");
		
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







