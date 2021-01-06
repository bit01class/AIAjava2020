package com.bit.day19;

interface Inter01{
	// 오직 추상메서드만 갖는
	public abstract void func01();
	void func02();
}

public class Ex07 implements Inter01 {

	public static void main(String[] args) {
		Inter01 inter=new Ex07();
	}

	@Override
	public void func01() {
		
	}

	@Override
	public void func02() {
		
	}

}
