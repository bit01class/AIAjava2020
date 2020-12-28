package com.bit.day15;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Ex15 {

	public static void main(String[] args) {
		File file=new File("test03.txt");
		java.io.Writer wt=null;
		java.io.BufferedWriter bw=null;
		java.io.PrintWriter pw=null;
		try {
			file.createNewFile();
			wt=new FileWriter(file);
			bw=new BufferedWriter(wt);
			pw=new PrintWriter(bw);
			
			pw.println("��Ʈ���� �׳� �ۼ��� �� �ֽ��ϴ�");
			pw.println("abcdefg");
			pw.println();
			pw.println("!@#$%");
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(bw!=null) {bw.close();}
				if(wt!=null) {wt.close();}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}
