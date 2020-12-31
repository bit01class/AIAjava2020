package com.bit.day16;

import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextArea;
import java.awt.TextField;

public class Ex08 extends Frame{
	
	public Ex08() {
		setLayout(new FlowLayout());
		Label la1=new Label("id:");
		TextField tf1=new TextField(10);
		tf1.setBackground(Color.RED);
		tf1.setEditable(false);
//		tf1.setEnabled(false);
		tf1.setText("아이디를 입력");
		Label la2=new Label("pw:");
		TextField tf2=new TextField(10);
		tf2.setText("1234");
		tf2.setEchoChar('#');
		System.out.println(tf2.getText());
		add(la1);
		add(tf1);
		add(la2);
		add(tf2);
		Button btn=new Button("로그인");
		btn.setFocusable(false);
		btn.setEnabled(true);
		add(btn);
		
		TextArea ta1=new TextArea("",3,30,TextArea.SCROLLBARS_VERTICAL_ONLY);
		add(ta1);
		
		setLocation(100+1920,100);
		setSize(500,300);
		setVisible(true);
	}

	public static void main(String[] args) {
		new Ex08();

	}

}
