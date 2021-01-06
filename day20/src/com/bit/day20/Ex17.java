package com.bit.day20;

import java.awt.Frame;
import java.awt.Label;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Ex17 extends Thread {
	static Label la;
	@Override
	public void run() {
		while(true) {
			SimpleDateFormat sdf=null;
			sdf=new SimpleDateFormat("hh:mm:ss");
			String msg=sdf.format(new Date());
			la.setText(msg);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		Frame f=new Frame();
		la=new Label();
		f.add(la);
		f.setBounds(100+1920,100,200,150);
		f.setVisible(true);
		Ex17 me=new Ex17();
		me.start();
	}

}
