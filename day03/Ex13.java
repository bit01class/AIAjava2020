/*
Q1.1~10까지 홀수를 출력하시오
Q2.1~10까지 짝수들의 합을 구하시오
Q3.다음을 출력하시오
	1+3+5+7+9=0000
Q4.알파벳 A~Z까지를 출력하시오
Q5.알파벳을 다음의 형식으로 출력하시오
	A(a), B(b), C(c), D(d), .... Z(z)
Q6. 구구단을 다음의 형식으로 출력하시오
2x1=2	3x1=3	4x1=4	...	9x1=9
2x2=4	3x2=6	4x2=8	...	9x2=18
...
2x9=18	3x9=27	4x9=36	...	9x9=81
*/


class Ex13{

   public static void main(String[] args){

	System.out.println("Q1.1~10까지 홀수를 출력하시오");
	for(int i=1; i<10; i+=2){
	    System.out.println(i);
	}
	System.out.println("--------------------");
	for(int i=1; i<=10; i++){
	    if(i%2!=0){System.out.println(i);}
	}
	System.out.println("Q2.1~10까지 짝수들의 합을 구하시오");
	int hap=0;
	/*
	for(int i=0; i<=10; i++){
	    if(i%2==0){
		hap+=i;	// hap=hap+i;
	    }
	}
	for(int i=2; i<=10; i+=2){
	    hap+=i;
	}
	*/
	for(int i=2; i<=10; i++){
	    hap+=i++;
	}
	System.out.println("hap="+hap);
	System.out.println("Q3.1+3+5+7+9=0000");
	//1+3+5+7+9
	//123456789
	hap=0;
	for(int i=1; i<10; i++){
	    if(i%2!=0){
		System.out.print(i);
		hap+=i;
	    }else{
		System.out.print('+');
	    }
	}
	System.out.println("="+hap);
	System.out.println("--------------------");
	for(int i=1; i<10; i++){
	    if(i%2!=0){
		if(i!=1){System.out.print("+");}
		System.out.print(i);
	    }
	}
	System.out.println("="+hap);
	System.out.println("Q4~5.A(a), B(b), C(c), D(d), .... Z(z)");
	int gap='a'-'A';
	for(int i='A'; i<'Z'+1 ; i++){
	    if(i!='A'){
	       System.out.print(',');
	    }
	    System.out.print((char)i);
	    System.out.print("("+(char)(i+gap)+")");
	}
   }

}











