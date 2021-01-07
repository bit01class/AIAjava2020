package com.bit.day22;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.MalformedURLException;
import java.net.URL;

public class Ex05 {

	public static void main(String[] args) {
		File file=new File("copy/7z.exe");
	
		java.net.URLConnection conn=null;
		
		String spec="https://www.7-zip.org/a/7z1900-x64.exe";
		InputStream is=null;
		OutputStream os=null;
		try {
			File parent=new File(file.getParent());
			parent.mkdir();
			file.createNewFile();
			os=new FileOutputStream(file);
			
			URL url=new URL(spec);
			conn=url.openConnection();
			is=conn.getInputStream();
			int su=-1;
			while((su=is.read())!=-1) {
				os.write(su);
			}
			System.out.println("크롤링 끝...");
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(os!=null) {os.close();}
				if(is!=null) {is.close();}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}







