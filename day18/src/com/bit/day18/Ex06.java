package com.bit.day18;

public class Ex06 {
	// ���ѹ��� ��ü�� ���� ����� ��������
	
	static Inter inn3=new Inter(){
		public void func02() {
			System.out.println("����ƽŬ�������");
		}
	};
	
	Inter inn2=new Inter(){
		public void func02() {
			System.out.println("�ν��Ͻ�Ŭ�������");
		}
	};

	public static void main(String[] args) {
		Inter inn1=new Inter(){
			public void func02() {
				System.out.println("����Ŭ�������");
			}
			
		};

	}

}
