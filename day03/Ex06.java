class Ex06{

  public static void main(String[] args){
	//제어문-조건문
	//2. switch문
	/*조건값,값-반드시 값, 자료형이 일치

	     switch(조건값){
		case 값:
		실행문;
		break;
		case 값:
		실행문;
		break;
		...
		default:
		실행문;
	     }
	*/
	char ch='A';
	//int ch=65;
	switch(ch){
	    case '!':
		System.out.println("느낌표");
		break;
	    case '@':
		System.out.println("골뱅이");
		break;
	    case '#':
		System.out.println("샵");
		break;
	    case '$':
		System.out.println("달러");
		break;
	    default:
		System.out.println("몰라");
	}
  }

}








