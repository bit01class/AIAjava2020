package com.bit.day16;

import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;

public class Ex07 extends Frame{
	
	public Ex07() {
		String name="�ü�";
		int style=Font.ITALIC;
		int size=30;
		java.awt.Font font=new Font(name, style, size);
		
		Panel mainp=new Panel();
		mainp.setBackground(Color.gray);
		mainp.setLayout(new FlowLayout());
		
		
		Label la1=new Label();
		la1.setText("��");
		la1.setFont(font);
		Color color=new Color(0,0,255);
		la1.setBackground(color);
		mainp.add(la1);
		
		Button btn01=new Button();
		btn01.setLabel("��ư�̸�");
		btn01.setFont(font);
		mainp.add(btn01);
		
		
		add(mainp);
		setLocation(100+1920,100);
		setSize(500,400);
		setVisible(true);
	}

	public static void main(String[] args) {
		// ������Ʈ�� ����
		new Ex07();
	}

}
