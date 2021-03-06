package com.bit.day16;

import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Choice;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.List;
import java.awt.Panel;

public class Ex09 extends Frame{
	
	public Ex09() {
		GridLayout grid=new GridLayout(5,1);
		setLayout(grid);
		
		Panel p1=new Panel();
		Checkbox ch1=new Checkbox("item1",false);
		Checkbox ch2=new Checkbox("item2",true);
		Checkbox ch3=new Checkbox("item3",true);
		Checkbox ch4=new Checkbox("item4");
		p1.add(ch1);
		p1.add(ch2);
		p1.add(ch3);
		p1.add(ch4);
		
		Panel p2=new Panel();
		CheckboxGroup cbg=new CheckboxGroup();
		Checkbox ra1=new Checkbox("item1",true,cbg);
		Checkbox ra2=new Checkbox("item2",false,cbg);
		Checkbox ra3=new Checkbox("item3",true,cbg);
		Checkbox ra4=new Checkbox("item4",false,cbg);
		p2.add(ra1);
		p2.add(ra2);
		p2.add(ra3);
		p2.add(ra4);
		
		Panel p3=new Panel();
		Choice cho=new Choice();
		cho.addItem("item1");
		cho.addItem("item2");
		cho.addItem("item3");
		cho.addItem("item4");
		cho.select("item2");
		p3.add(cho);
		
		Panel p4=new Panel();
		List list=new List(6,true);
		list.add("item1");
		list.add("item2");
		list.add("item3");
		list.add("item4");
		list.add("item5");
		list.add("item6");
		
//		list.select(2);
		
		p4.add(list);
		
		add(p1);
		add(p2);
		add(p3);
		add(p4);
		setLocation(100+1920,100);
		setSize(500,600);
		setVisible(true);
	}

	public static void main(String[] args) {
		new Ex09();
	}

}




