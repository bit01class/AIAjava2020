package com.bit.day18;

import java.awt.Frame;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class Ex15 extends Frame {
	
	public Ex15() {
		
		addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.out.println("Å¬¸¯");
			}
		});
		
		
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				dispose();
			}
		});
		setBounds(100+1920,100,400,300);
		setVisible(true);
	}

	public static void main(String[] args) {
		Ex15 me= new Ex15();

	}

}
