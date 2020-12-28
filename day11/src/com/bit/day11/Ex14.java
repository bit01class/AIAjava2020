package com.bit.day11;

class Node{
	Node nxt;
	int val;
}

class MyLinked{
	Node start;
	int cnt;
	
	void add(int su) {
		cnt++;
		Node node=new Node();
		node.val=su;
		if(cnt==1) {
			start=node;
		}else {
			Node temp=start;
			
			while(true) {
				if(temp.nxt==null) {break;}
				temp=temp.nxt;
			}
			temp.nxt=node;
		}
	}
	
	int size() {
		return cnt;
	}
	int get(int idx) {
		Node temp=start;
		for(int i=0; i<idx; i++) {
			temp=temp.nxt;
		}
		return temp.val;
	}
}

public class Ex14 {

	public static void main(String[] args) {
		MyLinked list=new MyLinked();
//		java.util.LinkedList list=new java.util.LinkedList();
		list.add(1111);
		list.add(2222);
		list.add(3333);
		list.add(4444);
		list.add(5555);
		
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}

	}

}
