package com.bit.day18;

import java.awt.Choice;
import java.awt.Frame;
import java.awt.List;
import java.awt.Panel;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Ex11 extends Frame
	implements ItemListener{
	
	public Ex11() {
		Panel p=new Panel();
		
		List list=new List();
		list.addItem("item1");
		list.addItem("item2");
		list.addItem("item3");
		list.addItem("item4");
		
		Choice cho=new Choice();
		cho.addItem("item1");
		cho.addItem("item2");
		cho.addItem("item3");
		cho.addItem("item4");
		
		cho.addItemListener(this);
		p.add(cho);
		
		add(p);
		setBounds(100+1920,100,400,300);
		setVisible(true);
	}

	public static void main(String[] args) {
		Ex11 me = new Ex11();

	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		System.out.println(e.getItem());
		System.out.println(e.getSource());
	}

}
