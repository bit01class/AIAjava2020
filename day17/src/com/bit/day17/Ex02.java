package com.bit.day17;

import java.awt.Color;
import java.awt.Dialog;
import java.awt.Frame;
import java.awt.event.WindowEvent;

public class Ex02 extends Frame
	implements java.awt.event.WindowListener{
	
	public Ex02() {
		
		addWindowListener(this);
		
		setLocation(100+1920,100);
		setSize(200,200);
		setVisible(true);
	}

	public static void main(String[] args) {
		Ex02 me = new Ex02();
		System.out.println("������ �����ϰڽ��ϴ�");
		return;
	}
	public void windowOpened(WindowEvent e) {
		System.out.println("����");
	}
	public void windowClosing(WindowEvent e) {
		System.out.println("�ݱ��ư�� ��������");
		dispose();// GUI �����û
//		Dialog dia=new Dialog(this);
//		dia.setLocation(200+1920,200);
//		dia.setSize(200,200);
//		dia.setVisible(true);
	}
	public void windowClosed(WindowEvent e) {
		System.out.println("���������� ��û�һ��� ����");
	}
	public void windowIconified(WindowEvent e) {
		System.out.println("�ּ�ȭ��(�۾�ǥ���ٿ�������ȭ)");
	}
	public void windowDeiconified(WindowEvent e) {
		System.out.println("�ּ�ȭ����������(�������ȭ)");
	}
	public void windowActivated(WindowEvent e) {
		System.out.println("Ȱ��ȭ");
		this.setBackground(Color.white);
	}
	public void windowDeactivated(WindowEvent e) {
		System.out.println("��Ȱ��ȭ");
		this.setBackground(Color.GRAY);
	}

}
