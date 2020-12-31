package com.bit.day16;

import java.awt.Button;
import java.awt.Frame;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

public class Ex05 extends Frame {

	public Ex05() {
		GridBagLayout gbl=new GridBagLayout();
		setLayout(gbl);
		
		
		Button btn1=new Button("btn1");
		Button btn2=new Button("btn2");
		Button btn3=new Button("btn3");
		Button btn4=new Button("btn4");
		Button btn5=new Button("btn5");
		
		GridBagConstraints gbc1=new GridBagConstraints();
		gbc1.fill=1;
		gbc1.gridx=0;
		gbc1.gridy=0;
		gbc1.gridwidth=1;
		gbc1.gridheight=1;
		gbc1.weightx=1.0;
		gbc1.weighty=1.0;
		gbl.setConstraints(btn1, gbc1);
		add(btn1);
		GridBagConstraints gbc2=new GridBagConstraints();
		gbc2.fill=1;
		gbc2.gridx=1;
//		gbc2.gridy=0;
		gbc2.gridwidth=1;
		gbc2.gridheight=2;
		gbc2.weightx=1.0;
		gbc2.weighty=1.0;
		gbl.setConstraints(btn2, gbc2);
		add(btn2);
		GridBagConstraints gbc3=new GridBagConstraints();
		gbc3.fill=1;
		gbc3.gridx=2;
		gbc3.gridy=0;
		gbc3.gridwidth=1;
		gbc3.gridheight=1;
		gbc3.weightx=1.0;
		gbc3.weighty=1.0;
		gbl.setConstraints(btn3, gbc3);
		add(btn3);
		GridBagConstraints gbc4=new GridBagConstraints();
		gbc4.fill=1;
		gbc4.gridx=0;
		gbc4.gridy=1;
		gbc4.gridwidth=1;
		gbc4.gridheight=1;
		gbc4.weightx=1.0;
		gbc4.weighty=1.0;
		gbl.setConstraints(btn4, gbc4);
		add(btn4);
		GridBagConstraints gbc5=new GridBagConstraints();
		gbc5.fill=1;
		gbc5.gridx=2;
		gbc5.gridy=1;
		gbc5.gridwidth=1;
		gbc5.gridheight=1;
		gbc5.weightx=1.0;
		gbc5.weighty=1.0;
		gbl.setConstraints(btn5, gbc5);
		add(btn5);
		
		
		setLocation(100+1920,100);
		setSize(400,300);
		setVisible(true);
	}
	public static void main(String[] args) {
		new Ex05();
	}

}
