package com.bit.day18;

interface Inter{
	void func02();
}

public class Ex05 {
	
//	public static Inter func01() {
//		return new Inter(){
//			public void func02() {
//				System.out.println("����Ŭ�������");
//			}
//		};
//	}

	public static void main(String[] args) {
		Inter inn=new Inter(){

			@Override
			public void func02() {
				System.out.println("����Ŭ�������");
			}
		};
		inn.func02();
	}

}
