/*
비트편의점
-------------

--------------------------------------------------
제품명	|단가	|수량	|계
--------------------------------------------------
생수	900	1	900
쌀과자	2300	2	00000
껌	500	3	1500
커피	1200	1	1200
--------------------------------------------------
		합계:000000원
--------------------------------------------------
*/
class Ex08{

  public static void main(String[] args){
	int ea1=1;
	int ea2=20;
	int ea3=3;
	int ea4=4;
	String table="---------------------------------";
	System.out.println("비트편의점\n-------------\n");
	System.out.println( table);
	System.out.println("제품명	|단가	|수량	|계");
	System.out.println( table);
	System.out.println("생수	900	"+ea1+"\t"+(900*ea1));
	System.out.println("쌀과자	2300	"+ea2+"\t"+(2300*ea2));
	System.out.println("껌	500	"+ea3+"\t"+(500*ea3));
	System.out.println("커피	1200	"+ea4+"\t"+(1200*ea4));
	System.out.println( table);
	System.out.println("\t\t합계:"+(900*ea1+2300*ea2+500*ea3+1200*ea4)+"원");
	System.out.println( table);

  }

}












