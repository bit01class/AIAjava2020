class Ex03{

  public static void main(String[] args){

	// 양수와 음수를 구분하시오
	int su1=1;
	if(su1>0){
	  System.out.println("양수입니다");
	}
	if(su1<0){
	  System.out.println("음수입니다");
	}
	System.out.println("-----------------");
	// else문
	// 1.if문과 함께, 단독사용불가
	// 2.반드시 실행을 보장합니다
	if(su1>0){
	  System.out.println("0보다크다");
	}else{
	  System.out.println("0보다크지않다");
	}
	System.out.println("-----------------");
	int su2;
	if(su1>0){
	  su2=1;
	}else{
	  su2=2;
	}
	System.out.println(su2);
  }

}





