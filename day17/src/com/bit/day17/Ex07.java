package com.bit.day17;

import java.awt.Button;
import java.awt.Dialog;
import java.awt.FileDialog;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;

public class Ex07 extends Frame 
	implements WindowListener,ActionListener,MouseListener{

	TextArea ta=new TextArea();
	MenuItem mi11,mi14,mi21,mi12,mi13;
	Dialog dia;
	String name="제목없음";

	public Ex07() {
		setTitle(name);
		mi11=new MenuItem();
		mi11.setLabel("새파일");
		mi12=new MenuItem("열기");
		mi13=new MenuItem("저장");
		mi14=new MenuItem("종료");
		mi21=new MenuItem("정보");
		
		mi11.addActionListener(this);
		mi12.addActionListener(this);
		mi13.addActionListener(this);
		mi14.addActionListener(this);
		mi21.addActionListener(this);
		
		Menu mn01=new Menu("파일");
		mn01.add(mi11);
		mn01.addSeparator();
		mn01.add(mi12);
		mn01.add(mi13);
		mn01.addSeparator();
		mn01.add(mi14);
		Menu mn02=new Menu("도움말");
		mn02.add(mi21);
		MenuBar mb=new MenuBar();
		mb.add(mn01);
		mb.add(mn02);
		setMenuBar(mb);
		add(ta);
		setLocation(100+1920,100);
		setSize(500,400);
		setVisible(true);
		addWindowListener(this);
	}
	
	public static void main(String[] args) {
		Ex07 me=new Ex07();

	}

	public void windowClosing(WindowEvent e) {
		dispose();
	}

	public void windowOpened(WindowEvent e) {}
	public void windowClosed(WindowEvent e) {}
	public void windowIconified(WindowEvent e) {}
	public void windowDeiconified(WindowEvent e) {}
	public void windowActivated(WindowEvent e) {}
	public void windowDeactivated(WindowEvent e) {}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(mi14==e.getSource()) {
			dispose();
		}else if(mi11==e.getSource()) {
			ta.setText(" ");
			name="제목없음";
		}else if(mi21==e.getSource()) {
			dia=new Dialog(this,"정보");
			dia.setLayout(new FlowLayout());
			Button btn=new Button("확인");
			btn.addMouseListener(this);
			dia.add(btn);
			dia.setSize(200,100);
			dia.setLocation(this.getX()+getWidth()/2-100
						,this.getY()+getHeight()/2-50);
			dia.setVisible(true);
			setEnabled(false);
		}else if(mi13==e.getSource()) {
			FileDialog dia=new FileDialog(this,"저장",FileDialog.SAVE);
			dia.setVisible(true);
			String dir=dia.getDirectory();
			name=dia.getFile();
			System.out.println(dir);
			System.out.println(name);
			File file=new File(dir+name);
			OutputStream os=null;
			PrintStream ps=null;
			try {
				os=new FileOutputStream(file);
				ps=new PrintStream(os);
				ps.print(ta.getText());
			} catch (FileNotFoundException e1) {
				e1.printStackTrace();
			} finally {
				try {
					if(ps!=null) {ps.close();}
					if(os!=null) {os.close();}
				} catch (IOException e1) {
					e1.printStackTrace();
				}
			}
			
		}else if(mi12==e.getSource()) {
			FileDialog dia=new FileDialog(this,"열기",FileDialog.LOAD);
			dia.setVisible(true);
			String dir=dia.getDirectory();
			name=dia.getFile();
			File file=new File(dir+name);
			InputStream is=null;
			ByteArrayOutputStream baos=null;
			try {
				is=new FileInputStream(file);
				baos=new ByteArrayOutputStream();
				while(true) {
					int su=is.read();
					if(su==-1) {break;}
					baos.write(su);
				}
				baos.close();
			} catch (FileNotFoundException e1) {
				e1.printStackTrace();
			} catch (IOException e1) {
				e1.printStackTrace();
			} finally {
				try {
					if(is!=null) {is.close();}
				} catch (IOException e1) {
					e1.printStackTrace();
				}
			}
			byte[] arr=baos.toByteArray();
			String msg=new String(arr);
			ta.setText(msg);
		}
		setTitle(name);
	}
	public void mouseClicked(MouseEvent e) {
		setEnabled(true);
		dia.setVisible(false);
	}
	public void mousePressed(MouseEvent e) {}
	public void mouseReleased(MouseEvent e) {}
	public void mouseEntered(MouseEvent e) {}
	public void mouseExited(MouseEvent e) {}

}











