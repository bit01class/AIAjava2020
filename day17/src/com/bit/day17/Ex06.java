package com.bit.day17;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Ex06 extends Frame
	implements KeyListener{
	
	public Ex06() {
		Panel p=new Panel();
		TextField tf=new TextField(10);
		p.add(tf);
//		add(p);
		Button btn=new Button("�̺�Ʈ��ü");
		p.add(btn);
		this.addKeyListener(this);
		setLocation(100+1920,100);
		setSize(300,200);
		setVisible(true);
	}

	public static void main(String[] args) {
		Ex06 me = new Ex06();
	}
	public void keyPressed(KeyEvent e) {
//		TextField tf=(TextField)e.getSource();
//		System.out.println("Ű�� ������ ����:"+tf.getText());
	}

	public void keyTyped(KeyEvent e) {
//		TextField tf=(TextField)e.getSource();
//		System.out.println("Ű ����:"+tf.getText());
	}

	public void keyReleased(KeyEvent e) {
		Frame tf=(Frame)e.getSource();
		System.out.println("Ű�� �ö�ö�:"+tf);
	}

}
