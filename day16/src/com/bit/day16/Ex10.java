package com.bit.day16;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Dialog;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextArea;

public class Ex10 {

	public static void main(String[] args) {
		Frame f=new Frame();
		
		TextArea ta=new TextArea();
		f.add(ta);
		
		f.setLocation(100+1920,100);
		f.setSize(500,300);
		f.setVisible(true);
		f.setTitle("제목");
		
		Dialog dia=new Dialog(f);
		dia.setTitle("다이얼로그 창");
		BorderLayout border=new BorderLayout();
		dia.setLayout(border);
		
		Button btn=new Button("확인");
		dia.add(btn,BorderLayout.SOUTH);
		
		Label la=new Label("다이얼로그 창입니다");
		dia.add(la,BorderLayout.CENTER);
		
		dia.setSize(200,200);
		
		int x=f.getX()+f.getWidth()/2-dia.getWidth()/2;
		int y=f.getY()+f.getHeight()/2-dia.getHeight()/2;
		dia.setLocation(x,y);
		dia.setVisible(true);
		f.setEnabled(false);
		
	}

}









