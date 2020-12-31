package com.bit.day18;

import java.awt.Frame;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.TextEvent;
import java.awt.event.TextListener;

public class Ex12 extends Frame
	implements TextListener{
	TextField tf;
	
	public Ex12() {
		Panel p=new Panel();
		
		tf=new TextField(10);
		tf.addTextListener(this);
		p.add(tf);
		
		add(p);
		setBounds(100+1920,100,500,300);
		setVisible(true);
	}

	public static void main(String[] args) {
		Ex12 me = new Ex12();

	}

	@Override
	public void textValueChanged(TextEvent e) {
		System.out.println(tf.getText());
		System.out.println(((TextField)e.getSource()).getText());
	}

}











