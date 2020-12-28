class Ex04{

  public static void main(String[] args){

	int su1=0;
	if(su1>1){
	  System.out.println("0보다큽니다");
	}
	if(su1<1&&su1>-1){
	  System.out.println("0입니다");
	}
	if(su1<0){
	  System.out.println("0보다작습니다");
	}
	System.out.println("----------------------------");
	// else if문
	// 1. if문과함께 단독사용불가
	// 2. if문 다음 else문 위
	// 3. 다중의 else if 수행가능
	// 4. 수행은 0~1개의 실행을 보장
	su1=-1;
	if(su1>1){
	  System.out.println("1보다큽니다");
	}else if(su1>0){
	  System.out.println("1입니다");
	}else if(su1>-1){
	  System.out.println("0입니다");
	}else{
	  System.out.println("음수입니다");
	}
  }

}






