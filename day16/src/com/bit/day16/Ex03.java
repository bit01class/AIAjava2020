package com.bit.day16;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.GridBagLayoutInfo;
import java.awt.GridLayout;
import java.awt.LayoutManager;
import java.awt.Panel;

public class Ex03 extends Frame {
	
	public Ex03() {
		// ��ġ������
//		FlowLayout layout=new FlowLayout();
		GridLayout layout2=new GridLayout(5,2);
		BorderLayout layout=new BorderLayout();
		setLayout(layout);
		
		// ������Ʈ �߰�
		Panel west=new Panel();
		west.setLayout(layout2);
		
		Button btn1=new Button("��ư1");
		Button btn2=new Button("��ư2");
		Button btn3=new Button("��ư3");
		Button btn4=new Button("��ư4");
		Button btn5=new Button("��ư5");
		
		west.add(btn2);
		west.add(btn4);
		
		add(btn1,BorderLayout.NORTH);
//		add(btn2,"South");
		add(west,BorderLayout.EAST);
//		add(east,"East");
		add(btn5,BorderLayout.CENTER);
		
		setLocation(100+1920,100);
		setSize(100,300);
		setVisible(true);
	}

	public static void main(String[] args) {
		new Ex03();
	}

}
