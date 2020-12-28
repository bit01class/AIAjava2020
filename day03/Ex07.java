/*
학생성적관리프로그램(ver 0.1.0)
----------------------------------------
kor=85;
eng=77;
math=93;
1.학생의 총점과 평균(소수점2자리)을 구하시오
2.학점을 구하시오
	A학점(90이상)
	B학점(~80이상)
	C학점(~70이상)
	D학점(~60이상)
	F학점(~60미만)
*/

class Ex07{

  public static void main(String[] args){
	int kor=86;
	int eng=77;
	int math=93;
	System.out.println("학생성적관리프로그램(ver 0.1.0)\n----------------------------------------");
	System.out.println("국어:"+kor);
	System.out.println("영어:"+eng);
	System.out.println("수학:"+math);
	System.out.println("총점:"+(kor+eng+math));
	double avg=(kor+eng+math)*100/3/100.0;
	System.out.println("평균:"+avg);
	char ch='F';
	if(avg>=90){
		ch='A';
	}else if(avg>=80){
		ch='B';
	}else if(avg>=70){
		ch='C';
	}else if(avg>=60){
		ch='D';
	}
	System.out.println(ch+"학점");
  }

}







