package com.bit.day18;

import java.awt.Button;
import java.awt.Checkbox;
import java.awt.Choice;
import java.awt.Frame;
import java.awt.List;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

public class Ex13 extends Frame
	implements ActionListener,FocusListener{
	TextField tf;
	public Ex13() {
		
		
		Panel p=new Panel();
		Button btn=new Button("버튼");
		tf=new TextField(10);
		List cho=new List();
		cho.add("item1");
		cho.add("item2");
		cho.add("item3");
		cho.add("item4");
		Checkbox ch1=new Checkbox("item1");
		Checkbox ch2=new Checkbox("item2");
		Checkbox ch3=new Checkbox("item3");
		Checkbox ch4=new Checkbox("item4");
		//mouse click
//		btn.addActionListener(this);
		//enter
//		tf.addActionListener(this);
//		cho.addActionListener(this);
		tf.setText("머라도 입력하세요");
		tf.addFocusListener(this);
		p.add(cho);
		p.add(btn);
		p.add(tf);
		p.add(cho);
		add(p);
		setBounds(100+1920,100,500,400);
		setVisible(true);
	}

	public static void main(String[] args) {
		Ex13 me = new Ex13();

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("이벤트");
	}

	@Override
	public void focusGained(FocusEvent e) {
		System.out.println("포커스를 얻었을때");
		if(tf.getText().equals("머라도 입력하세요")) {
		tf.setText(" ");
		}
	}

	@Override
	public void focusLost(FocusEvent e) {
		System.out.println("포커스를 잃었을때");
		if(tf.getText().trim().isEmpty()) {
			tf.setText("머라도 입력하세요");
		}
	}

}
