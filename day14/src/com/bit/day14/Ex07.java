package com.bit.day14;

import java.io.File;
import java.io.IOException;

public class Ex07 {

	public static void main(String[] args) {
		String prefix="target03";
		String suffix=".txt";
//C:\Users\∞Ë¡§\AppData\Local\Temp		
		try {
			File file=File.createTempFile(prefix, suffix);
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			file.delete();
		} catch (IOException e) {
			e.printStackTrace();
		}
		

	}

}
