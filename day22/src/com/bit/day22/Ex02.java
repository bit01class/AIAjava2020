package com.bit.day22;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

public class Ex02 extends JFrame 
		implements ActionListener,Runnable{
	Thread thr;
	Panel[] ps=new Panel[4];
	Icon[] icon=new Icon[4];
	JButton[] jbtn;
	Button btn1,btn2;
	Label la1, la2;
	int score,cnt;
	
	Ex02(){
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setLayout(new BorderLayout());
		for(int i=0; i<ps.length; i++) {
			ps[i]=new Panel();
		}
		btn1=new Button("시작");
		btn2=new Button("종료");
		la1=new Label("60초");
		la2=new Label("점수:");
		jbtn=new JButton[16];
		icon[0]=new ImageIcon("ball01.jpg");
		icon[1]=new ImageIcon("ball02.jpg");
		icon[2]=new ImageIcon("ball03.jpg");
		icon[3]=new ImageIcon("ball04.jpg");
		for(int i=0; i<jbtn.length; i++) {
			jbtn[i]=new JButton(icon[i/4]);
			jbtn[i].addActionListener(this);
		}
		btn1.addActionListener(this);
		btn2.addActionListener(this);
		
		ps[0].setLayout(new GridLayout(1,2));
		ps[1].setLayout(new FlowLayout());
		ps[2].setLayout(new GridLayout(2,1));
		ps[3].setLayout(new GridLayout(4,4));
		
		ps[0].add(new Label("두더지게임(ver 0.2.0)"));
		ps[0].add(la1);
		ps[1].add(la2);
		ps[2].add(btn1);
		ps[2].add(btn2);
		for(int i=0; i<jbtn.length; i++) {
			ps[3].add(jbtn[i]);
		}
		add(ps[0],BorderLayout.NORTH);
		add(ps[1],BorderLayout.SOUTH);
		add(ps[2],BorderLayout.EAST);
		add(ps[3],BorderLayout.CENTER);
		setBounds(0+1920,0,700,700);
		setVisible(true);
		thr=new Thread(this);
		jbtnOnOff(false);
	}
	
	public void jbtnOnOff(boolean boo) {
		btn1.setEnabled(!boo);
		for(int i=0; i<jbtn.length; i++) {
			jbtn[i].setEnabled(boo);
		}
	}
	
	public void mix2() {
		Random ran=new Random();
		for(int i=0; i<100; i++) {
			int random=ran.nextInt(16);
			JButton temp=jbtn[0];
			jbtn[0]=jbtn[random];
			jbtn[random]=temp;
		}
		for(int i=0; i<jbtn.length; i++) {
			ps[3].add(jbtn[i]);
		}
	}
	
	public void mix() {
		Random ran=new Random();
		for(int i=0; i<100; i++) {
			int random = ran.nextInt(16);
			Icon con1=jbtn[0].getIcon();
			Icon con2=jbtn[random].getIcon();
			jbtn[random].setIcon(con1);
			jbtn[0].setIcon(con2);
		}
	}

	public static void main(String[] args) {
		Ex02 me=new Ex02();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==btn2) {
			dispose();
		}
		if(e.getSource()==btn1) {
			if(thr.getState()==Thread.State.TERMINATED) {
				thr=new Thread(this);
				cnt=60;
				thr.start();
			}else if(thr.getState()==Thread.State.NEW) {
				cnt=60;
				thr.start();
			}
		}
		for(int i=0; i<jbtn.length; i++) {
			if(e.getSource()==jbtn[i]) {
				Icon con=jbtn[i].getIcon();
				if(con==icon[2]) {
					score++;
				}else {
					score-=2;
				}
				la2.setText("점수:"+score);
			}
		}
	}

	@Override
	public void run() {
		jbtnOnOff(true);
		while(cnt-->0) {
			la1.setText(cnt+"초");
			mix();
			try {
				Thread.sleep(1000/2);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			mix();
			try {
				Thread.sleep(1000/2);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		jbtnOnOff(false);
	}

}









