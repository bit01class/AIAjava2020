package com.bit.day19;

abstract class Lec05{
	// �߻�Ŭ���� - �߻�޼��带 0���̻� ���� Ŭ����
	// ���� : �ݵ�� ����� ���� ���
	public Lec05() {
	}
	
	abstract void func01();
	void func02() {
		System.out.println("�߻�Ŭ������ ������ �޼���");
	}
}
public class Ex05 {

	public static void main(String[] args) {
		Lec05 lec=new Lec05() {

			@Override
			void func01() {
				
			}};

	}

}






