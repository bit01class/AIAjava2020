package com.bit.day17;

import javax.swing.JFrame ;

public class Ex03 extends JFrame{
	
	public Ex03() {
		// 0 - DO_NOTHING_ON_CLOSE ()
		// 1 - HIDE_ON_CLOSE (setVisible(false);)
		// 2 - DISPOSE_ON_CLOSE (dispose();)
		// 3 - EXIT_ON_CLOSE (System.exit(0);)
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		
		setLocation(100+1920,100);
		setSize(400,300);
		setVisible(true);
	}

	public static void main(String[] args) {
		Ex03 me =new Ex03();
	}

}
