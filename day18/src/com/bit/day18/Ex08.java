package com.bit.day18;

import java.awt.Frame;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Ex08{
	int su=111;
	class Item1 implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			System.out.println("ù��°"+su);
		}
	}
	class Item2 implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			System.out.println("�ι�°");
		}
	}

	public static void main(String[] args) {
		Ex08 me=new Ex08();
		Frame f=new Frame();
		MenuItem mi1=new MenuItem("���1");
		MenuItem mi2=new MenuItem("���2");
		int su2=2222;
		ActionListener listen=new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("1��"+su2);
			}};
			
		mi1.addActionListener(listen);
		mi2.addActionListener(listen);
		
		Menu mn=new Menu("��ɵ�");
		mn.add(mi1);
		mn.add(mi2);
		MenuBar mb=new MenuBar();
		mb.add(mn);
		f.setMenuBar(mb);
		
		f.setLocation(100+1920,100);
		f.setSize(500,300);
		f.setVisible(true);
	}


}
