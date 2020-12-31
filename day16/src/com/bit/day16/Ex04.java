package com.bit.day16;

import java.awt.Button;
import java.awt.Frame;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

public class Ex04 extends Frame{
	
	public Ex04() {
		GridBagLayout gbl=new GridBagLayout();
		setLayout(gbl);
		
		Button btn1=new Button("btn1");
		Button btn2=new Button("btn2");
		Button btn3=new Button("btn3");
		Button btn4=new Button("btn4");
		Button btn5=new Button("btn5");
		Button btn6=new Button("btn6");
		Button btn7=new Button("btn7");
		
		
		GridBagConstraints gbc=new GridBagConstraints();
		// gbc.fill -> 위치를 기준으로 어떻게 채울지
		//위치
		//	가로,세로위치
		//	넓이,높이
		//	가중치
		
		
		gbc.fill=0;//GridBagConstraints.BOTH;
		gbc.gridx=0;
		gbc.gridy=0;
		gbc.gridwidth=1;
		gbc.gridheight=1;
		gbc.weightx=0.0;
		gbc.weighty=0.0;
		gbl.setConstraints(btn1, gbc);
		add(btn1);
		
		gbc.gridx=1;
		gbc.gridy=0;
		gbc.gridwidth=1;
		gbl.setConstraints(btn2, gbc);
		add(btn2);
		
		gbc.gridx=2;
		gbc.gridy=0;
		gbc.gridwidth=1;
		gbl.setConstraints(btn3, gbc);
		add(btn3);
		
		gbc.gridx=0;
		gbc.gridy=1;
		gbc.gridwidth=1;
		gbl.setConstraints(btn4, gbc);
		add(btn4);
		
		gbc.gridx=1;
		gbc.gridy=1;
		gbc.gridwidth=2;
		gbl.setConstraints(btn5, gbc);
		add(btn5);
		
		gbc.gridx=0;
		gbc.gridy=2;
		gbc.gridwidth=2;
		gbl.setConstraints(btn6, gbc);
		add(btn6);
		
		gbc.gridx=2;
		gbc.gridy=2;
		gbc.gridwidth=1;
		gbl.setConstraints(btn7, gbc);
		add(btn7);
		
		setLocation(100+1920,100);
		setSize(300,400);
		setVisible(true);
	}

	public static void main(String[] args) {
		new Ex04();

	}

}
