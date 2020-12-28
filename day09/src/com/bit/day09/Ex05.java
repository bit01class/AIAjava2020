package com.bit.day09;

class MyErr extends Exception{
	MyErr(){
		super("0À¸·Î ³ª´²¼­");
	}
}

public class Ex05 {

	public static void main(String[] args) {
		int su=0;
		try {
			func01(su);
		} catch (MyErr e) {
			e.printStackTrace();
		}
		System.out.println(su);
	}
	
	public static void func01(int a) throws MyErr {
		int b=0;
		MyErr obj=new MyErr();
		if(a==0) {throw obj;}
		b=10/a;
		System.out.println(10+"/"+a+"="+b);
	}

}
