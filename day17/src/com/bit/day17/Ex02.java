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
		System.out.println("메인을 리턴하겠습니다");
		return;
	}
	public void windowOpened(WindowEvent e) {
		System.out.println("열림");
	}
	public void windowClosing(WindowEvent e) {
		System.out.println("닫기버튼을 눌렸을때");
		dispose();// GUI 종료요청
//		Dialog dia=new Dialog(this);
//		dia.setLocation(200+1920,200);
//		dia.setSize(200,200);
//		dia.setVisible(true);
	}
	public void windowClosed(WindowEvent e) {
		System.out.println("사용자종료시 요청할사항 실행");
	}
	public void windowIconified(WindowEvent e) {
		System.out.println("최소화됨(작업표시줄에아이콘화)");
	}
	public void windowDeiconified(WindowEvent e) {
		System.out.println("최소화에서원래로(비아이콘화)");
	}
	public void windowActivated(WindowEvent e) {
		System.out.println("활성화");
		this.setBackground(Color.white);
	}
	public void windowDeactivated(WindowEvent e) {
		System.out.println("비활성화");
		this.setBackground(Color.GRAY);
	}

}
