class Ex11{

  public static void main(String[] args){
	//제어문 (반복문)
	// 2. while문
	// while(조건){반복할 문장;}
	int su=0;
	while(su++<9){
	   System.out.println("7x"+su+"="+7*su);
	}
	System.out.println("----------------------");
	// for(초기화①;조건②;증감③){반복한 명령④;}
	// ① -> ② -> ④ -> ③ -> ② -> ④ -> ③ -> ② -> ④...
	su=1;
	while(su<10){
	    System.out.println("7x"+su+"="+7*su);
	    su++;
	}
  }

}














