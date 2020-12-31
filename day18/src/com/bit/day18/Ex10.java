package com.bit.day18;

import java.awt.Button;
import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Image;
import java.awt.Toolkit;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;

public class Ex10 extends Frame{
	
	public Ex10() {
		
		Toolkit tool = Toolkit.getDefaultToolkit();
		Image img=tool.createImage("imgs\\apple1.jpeg");
		Icon icon=new ImageIcon(img);
		JButton btn=new JButton();
		btn.setIcon(icon);
		
		add(btn);
		
		int locX=0,locY=0;
		Dimension dim=tool.getScreenSize();
		setSize(500,300);
		Dimension dim2=getSize();
		locX=dim.width/2-dim2.width/2;
		locY=dim.height/2-dim2.height/2;
		setLocation(locX,locY);
		setVisible(true);
	}

	public static void main(String[] args) {
		Ex10 me = new Ex10();

	}

}
