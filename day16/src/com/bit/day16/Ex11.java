package com.bit.day16;

import java.awt.BorderLayout;
import java.awt.Frame;import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.TextField;

public class Ex11 extends Frame {

	public Ex11() {
		BorderLayout border=new BorderLayout();
		setLayout(border);
		Panel p1=new Panel();
		p1.setLayout(new GridLayout(7,1));
		Panel p2=new Panel();
		Label la1 = new Label("�̸�              ");
		p2.add(la1);
		p2.add(new TextField(20));
		p1.add(p2);
		p1.add(new Label("����"));
		p1.add(new Label("�ֹι�ȣ"));
		p1.add(new Label("�ּ�"));
		p1.add(new Label("��ȭ��ȣ"));
		p1.add(new Label("���"));
		p1.add(new Label("�ڱ�Ұ�"));
		
		TextArea ta=new TextArea();
		
		add(p1,BorderLayout.NORTH);
		add(ta,BorderLayout.CENTER);
		setLocation(100+1920,100);
		setSize(400,400);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new Ex11();

	}

}
