package com.bit.day20;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

public class Ex01 {

	public static void main(String[] args) {
		OutputStream os=null;
		OutputStreamWriter osw=null;
		BufferedWriter bw=null;
		PrintWriter pw=null;
		try {
			os=new FileOutputStream("test01.txt");
			osw=new OutputStreamWriter(os);
			bw=new BufferedWriter(osw);
			pw=new PrintWriter(bw);
			
//			pw.println("���ڿ���Ʈ������ ��ȯ");
//			pw.println("���ο� ���� �ۼ�");
			pw.println("�����ۼ��� ����");
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(bw!=null) {bw.close();}
				if(osw!=null) {osw.close();}
				if(os!=null) {os.close();}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
