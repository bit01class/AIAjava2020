package com.bit.day17;

import java.awt.Frame;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

public class Ex05 extends Frame
	implements MouseMotionListener{
	
	public Ex05() {
		
		addMouseMotionListener(this);
		setLocation(100+1920,100);
		setSize(500,400);
		setVisible(true);
	}

	public static void main(String[] args) {
		Ex05 me = new Ex05();

	}
	public void mouseDragged(MouseEvent e) {
		System.out.println("드레그-"+e.getX()+":"+e.getY());
	}
	public void mouseMoved(MouseEvent e) {
//		System.out.println("무브");
	}

}
