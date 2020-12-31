package com.bit.day18;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Panel;

public class Ex16 extends Frame{
	
	public Ex16() {
		Panel p=new Panel();
		p.setLayout(null);
		Button btn=new Button("¹öÆ°");
		btn.setSize(100,50);
		btn.setLocation(0,0);
		p.add(btn);
		add(p);
		setBounds(100+1920,100,500,400);
		setVisible(true);
		setResizable(false);
	}

	public static void main(String[] args) {
		Ex16 me=new Ex16();

	}

}
