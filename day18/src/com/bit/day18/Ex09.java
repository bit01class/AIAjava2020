package com.bit.day18;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Ex09 extends Frame {
	
	public Ex09() {
		Panel p=new Panel();
		Button btn1=new Button("ù��°");
		Button btn2=new Button("�ι�°");
		
		btn1.addMouseListener(new MouseListener() {
			public void mouseClicked(MouseEvent e) {
				System.out.println("ù��° ��ư�� ���");
			}
			public void mousePressed(MouseEvent e) {}
			public void mouseReleased(MouseEvent e) {}
			public void mouseEntered(MouseEvent e) {}
			public void mouseExited(MouseEvent e) {}
		});
		btn2.addMouseListener(new MouseListener() {
			public void mouseClicked(MouseEvent e) {
				System.out.println("�ι�° ��ư�� ���");
			}
			public void mousePressed(MouseEvent e) {}
			public void mouseReleased(MouseEvent e) {}
			public void mouseEntered(MouseEvent e) {}
			public void mouseExited(MouseEvent e) {}
		});
		
		p.add(btn1);
		p.add(btn2);
		add(p);
		setLocation(100+1920,100);
		setSize(500,300);
		setVisible(true);
	}

	public static void main(String[] args) {
		Ex09 me=new Ex09();
	}

}
