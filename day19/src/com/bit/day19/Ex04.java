package com.bit.day19;

class Lec04{
	
	public Lec04(int a) {
	}
	
}
public class Ex04 extends Lec04{
	int su=1234;
	
	public Ex04() {//持失x
//		System.out.println("su="+this.su);
		this(1234,1111);
	}
	
	public Ex04(int a) {
		//梓端持失
		super(1111);
//		Object obj=super;
		System.out.println(super.toString());
	}
	public Ex04(int b,int a) {
		//梓端持失
		super(2222);
		System.out.println("su="+a);
	}
	
	void func01() {
		int su=1111;
		System.out.println("func01():"+this.su);
	}

	public static void main(String[] args) {
		// super & this - none static
		
		Ex04 me=new Ex04();
		System.out.println("main():"+me.su);
		me.func01();
		
	}

}
