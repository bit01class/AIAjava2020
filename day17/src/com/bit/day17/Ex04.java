package com.bit.day17;

import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Ex04 extends Frame
	implements MouseListener{
	
	public Ex04() {
		Panel p=new Panel();
		Label la=new Label("��");
		la.setBackground(Color.GREEN);
		p.add(la);
		
		Button btn01=new Button("��ư");
		p.add(btn01);
		
		this.addMouseListener(this);
		add(p);
		setLocation(100+1920,100);
		setSize(500,400);
		setVisible(true);
	}

	public static void main(String[] args) {
		Ex04 me =new Ex04();

	}
	public void mouseClicked(MouseEvent e) {
		//java.awt.Button[button0,244,5,38x23,label=��ư]
		System.out.println("Ŭ��������");
		Object obj=e.getSource();
//		((Button)obj).setLabel("Ŭ��");
//		System.out.println(((Button)obj).getLabel());
		System.out.println(e.getX()+":"+e.getY());
		System.out.println(e.getXOnScreen()+":"+e.getYOnScreen());
	}
	public void mousePressed(MouseEvent e) {
//		System.out.println("���콺��ư�������� ����");
	}
	public void mouseReleased(MouseEvent e) {
//		System.out.println("���콺��ư�� �ö���� ����");
	}
	public void mouseEntered(MouseEvent e) {
//		System.out.println("���콺�� �̺�Ʈ��ü ���� ����������");
	}
	public void mouseExited(MouseEvent e) {
//		System.out.println("���콺�� �̺�Ʈ��ü ������ ����������");
	}

}
