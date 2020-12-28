package com.bit.day07;

class Ex101{
  int su=1111;
  void func01(){
	System.out.println("func01()..."+su);
  }	
}

class Ex01{

  public static void main(String[] args){
	// 접근제한자(4)
	// public > protected >= default > private
	// public - 아무나 접근허용
	// protected - default동일, 상속에한 open
	// default - 동일패키지에서 접근허용
	// private - 자기자신 클래스 
	//	내부에서만 허용
	// class - public ,default
	// 필드,메서드- public,default,private

	Ex101 ex1=new Ex101();
	System.out.println(ex1.su);
	ex1.func01();
  }

}





