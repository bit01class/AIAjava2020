package com.bit.day20;

import java.awt.Font;
import java.awt.Frame;
import java.awt.Label;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Ex16 extends Frame implements Runnable {
	static Label la;
	
	public Ex16() {
		Font font=new Font(Font.SANS_SERIF,Font.BOLD,30);
		la=new Label();
		la.setFont(font);
		la.setAlignment(Label.CENTER);
		add(la);
		setBounds(100+1920,100,200,200);
		setVisible(true);
	}

	public static void main(String[] args) {
		Ex16 me=new Ex16();
		Thread thr=new Thread(me);
		thr.start();
	}

	@Override
	public void run() {
		while(true) {
			Date date = new Date();
			SimpleDateFormat sdf=new SimpleDateFormat("HH:mm:ss");
			String msg=sdf.format(date);
			la.setText(msg);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}

}









