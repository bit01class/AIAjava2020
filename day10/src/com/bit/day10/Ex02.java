package com.bit.day10;

//�߻�Ŭ����
// �߻�޼��� 0�� �̻� ���� Ŭ����
// ����� ���� ����϶�
abstract class Test02{
	int su=1111;
	public Test02() {
	}
	public void func01() {}
	//�߻�޼��� - �޼��� ����(o), ����(x)
//	public abstract void func02();
//	public abstract void func03();
}

public class Ex02 extends Test02{
	
//	public void func02() {};
//	public void func03() {};

	public static void main(String[] args) {
//		Test02 test=new Test02();
		Ex02 me=new Ex02();
		me.func01();
	}

}
