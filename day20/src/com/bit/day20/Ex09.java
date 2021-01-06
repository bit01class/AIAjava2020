package com.bit.day20;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.image.ImageObserver;

import javax.swing.ImageIcon;


// º¤ÅÍ¿Í ºñÆ®¸Ê

public class Ex09 extends Frame{
	
	class MyCanvas extends Canvas{
		@Override
		public void paint(Graphics g) {
			g.setColor(Color.RED);
			g.drawString("Hello", 100, 100);
			g.drawLine(0, 0, 100, 100);
			g.drawRect(100, 200, 100, 50);
			g.drawOval(100, 300, 100, 50);
			g.drawArc(100, 400, 100, 100, 0, 180);
			

			g.setColor(Color.BLUE);
			g.fillRect(200, 200, 100, 50);
			g.fillOval(200, 300, 100, 50);
			g.fillArc(200, 400, 100, 100, 0, 180);
			
			g.setColor(Color.GREEN);
			g.draw3DRect(300, 200, 100, 50,true);
			
			Image img=Toolkit.getDefaultToolkit()
							.getImage("game1.png");
			g.drawImage(img, 200, 100, this);
		}
	}
	
	public Ex09() {
		Canvas can=new MyCanvas();
		add(can);
		setBounds(100+1920,100,500,600);
		setVisible(true);
	}

	public static void main(String[] args) {
		Ex09 me = new Ex09();

	}

}
