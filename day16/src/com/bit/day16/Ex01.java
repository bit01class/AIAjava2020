package com.bit.day16;

import java.awt.Button;
import java.awt.Panel;

public class Ex01 extends java.awt.Frame {
	
	public Ex01() {
		Panel p=new Panel();
		Button btn1=new Button("btn1");
		Button btn2=new Button("btn2");
		btn2.setSize(200,200);
		p.add(btn1);
		p.add(btn2);
		add(p);
		setLocation(200+1920,200);
		setSize(500,300);
		setVisible(true);
	}

	public static void main(String[] args) {
		// GUI - awt
		Ex01 me=new Ex01();

	}

}
