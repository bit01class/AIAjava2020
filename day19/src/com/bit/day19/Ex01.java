package com.bit.day19;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Random;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;

public class Ex01 extends Frame
	implements ActionListener{
	Label la2;
	
	public Ex01() {
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				dispose();
			}
		});
		
		String header="가위 바위 보 게임 (ver 0.5.0)";
		Font font=new Font(Font.SANS_SERIF,Font.BOLD,30);
		BorderLayout border=new BorderLayout();
		setLayout(border);
		Panel ptop=new Panel();
		Panel pcen=new Panel();
		Panel pdwn=new Panel();
		
		Label la1=new Label(header);
		la1.setFont(font);
		ptop.add(la1);
		String result="결과";
		la2=new Label(result);
		pdwn.add(la2);
		
		GridLayout grid=new GridLayout(1,4);
		pcen.setLayout(grid);
		Icon icon1=new ImageIcon("game2.png");
		Icon icon2=new ImageIcon("game1.png");
		Icon icon3=new ImageIcon("game3.png");
		
		JButton btn1=new JButton(icon1);
		btn1.setLabel("0");
		JButton btn2=new JButton("1",icon2);
		JButton btn3=new JButton("2",icon3);
		JButton btn4=new JButton("종료");
		
		btn1.setForeground(Color.WHITE);
		btn2.setForeground(Color.WHITE);
		btn3.setForeground(Color.WHITE);
		btn1.setBackground(Color.WHITE);
		btn2.setBackground(Color.WHITE);
		btn3.setBackground(Color.WHITE);
		
		btn1.addActionListener(this);
		btn2.addActionListener(this);
		btn3.addActionListener(this);
		btn4.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		
		pcen.add(btn1);
		pcen.add(btn2);
		pcen.add(btn3);
		pcen.add(btn4);
		
		add(ptop,BorderLayout.NORTH);
		add(pcen,BorderLayout.CENTER);
		add(pdwn,BorderLayout.SOUTH);
		
		setBounds(100+1920,100,500,300);
		setVisible(true);
		this.pack();
	}

	public static void main(String[] args) {
		Ex01 me = new Ex01();

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Random ran=new Random();
		int con=ran.nextInt(3);
		int me;
		JButton btn=((JButton)e.getSource());
		String la=btn.getLabel();
		me=Integer.parseInt(la);
		if(con==me) {
			System.out.println("비김");
		}else if(con==0&&me==1
				||con==1&&me==2||con==2&&me==0) {
			System.out.println("이김");
		}else {
			System.out.println("졌음");
		}
		String result="컴퓨터:";
		if(con==0) {
			result+="가위";
		}else if(con==1) {
			result+="바위";
		}else {
			result+="보";
		}
		result+=",당신:";
		if(me==0) {
			result+="가위";
		}else if(me==1) {
			result+="바위";
		}else {
			result+="보";
		}
		la2.setText(result);
		//갱신
//		repaint();
//		validate();
//		revalidate();
		// 사이즈재조정
		this.pack();
	}

}










