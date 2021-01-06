package com.bit.day20;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Serializable;

// 객체 직렬화- Serializable
// 대상 : 필드만
// 단 필드일지라도 transient는 직렬화에 제외
// 	  제외된 값은 각 타입의 디폴트값
class Node implements Serializable{
	transient int val1;
	private int val2;
	
	public void set2(int a) {
		val2=a;
	}
	public int get2() {
		return val2;
	}
}

public class Ex07 {

	public static void main(String[] args) {
		File file=new File("test03.bin");
		
		OutputStream os=null;
		ObjectOutputStream oos=null;
		
		try {
			os=new FileOutputStream(file);
			oos=new ObjectOutputStream(os);
			
			Node node=new Node();
			node.val1=1111;
			node.set2(2222);
			
			oos.writeObject(node);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(oos!=null) {oos.close();}
				if(os!=null) {os.close();}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}

}








