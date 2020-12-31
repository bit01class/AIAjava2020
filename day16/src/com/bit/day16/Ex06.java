package com.bit.day16;

import java.awt.Button;
import java.awt.CardLayout;
import java.awt.Frame;
import java.awt.Panel;
import java.util.Scanner;

public class Ex06 extends Frame {
	static CardLayout layout;
	
	public Ex06() {
		layout=new CardLayout();
		setLayout(layout);
		
		Panel p1=new Panel();
		p1.add(new Button("첫번째"));
		Panel p2=new Panel();
		p2.add(new Button("두번째"));
		Panel p3=new Panel();
		p3.add(new Button("세번째"));
		
		add(p1);
		add(p2);
		add(p3);
		
		setLocation(100+1920,100);
		setSize(400,200);
		setVisible(true);
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Ex06 me=new Ex06();
		while(true) {
			System.out.print("1.다음 0.종료");
			int input=sc.nextInt();
			if(input==0) {break;}
			if(input==1) {
				layout.next(me);
			}
		}
	}

}








