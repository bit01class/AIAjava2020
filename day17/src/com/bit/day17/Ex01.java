package com.bit.day17;

import java.awt.CheckboxMenuItem;
import java.awt.Dialog;
import java.awt.FileDialog;
import java.awt.Frame;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ex01 implements ActionListener{

	public static void main(String[] args) {
		Frame frame=new Frame();
		
		MenuItem it01=new MenuItem();
		it01.setLabel("������");
		MenuItem it02=new MenuItem("����");
		it02.addActionListener(new Ex01());
		MenuItem it03=new MenuItem("����");
		
		MenuItem it04=new CheckboxMenuItem("�ߺ���",true);
		MenuItem it05=new MenuItem("Ȯ��");
		MenuItem it06=new MenuItem("���");
		Menu mn04=new Menu("Ȯ��/���");
		mn04.add(it05);
		mn04.add(it06);
		
		Menu mn01=new Menu();
		mn01.setLabel("����(F)");
		mn01.add(it01);
		mn01.add(it02);
		mn01.addSeparator();
		mn01.add(it03);
		Menu mn02=new Menu("����(H)");
		Menu mn03=new Menu("����(V)");
		mn03.add(it04);
		mn03.add(mn04);
		
		MenuBar mb=new MenuBar();
		mb.add(mn01);
		mb.add(mn03);
		mb.add(mn02);
		frame.setMenuBar(mb);
		
		
		
		
		frame.setLocation(100+1920,100);
		frame.setSize(500,300);
		frame.setVisible(true);
		
		FileDialog dia=new FileDialog(frame,"",FileDialog.SAVE);
		
		
		dia.setLocation(150+1920,150);
		dia.setSize(200,200);
		dia.setVisible(true);
		System.out.println(dia.getDirectory());
		System.out.println(dia.getFile());
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}













