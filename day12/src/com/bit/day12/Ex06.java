package com.bit.day12;

import java.util.LinkedList;

public class Ex06 {

	public static void main(String[] args) {
		java.util.Deque que=new LinkedList();
		//Queue
		que.offerFirst(1111);
		que.offerFirst(2222);
		que.offerFirst(3333);
		System.out.println(que.pollLast());
		System.out.println(que.pollLast());
		System.out.println(que.pollLast());
		System.out.println(que.pollLast());
		que.offerLast(1111);
		que.offerLast(2222);
		que.offerLast(3333);
		System.out.println(que.pollFirst());
		System.out.println(que.pollFirst());
		System.out.println(que.pollFirst());
		System.out.println(que.pollFirst());
		// stack
		que.offerFirst(1111);
		que.offerFirst(2222);
		que.offerFirst(3333);
		System.out.println(que.pollFirst());
		System.out.println(que.pollFirst());
		System.out.println(que.pollFirst());
		System.out.println(que.pollFirst());
		que.offerLast(1111);
		que.offerLast(2222);
		que.offerLast(3333);
		System.out.println(que.pollLast());
		System.out.println(que.pollLast());
		System.out.println(que.pollLast());
		System.out.println(que.pollLast());
	}

}









