package com.bit.day05;

class Ex08{

  public static void main(String[] args){
    System.out.println("Q1.");
    for(int i=0; i<3; i++){
       for(int j=0; j<3; j++){
          System.out.print("★");
       }
       System.out.println();
    }
    System.out.println("------------------");
    for(int i=1; i<10; i++){
       System.out.print('★');
       if(i%3==0){System.out.println();}
    }
    System.out.println("------------------");
    System.out.println("Q2.");
    char ch=97;
    for(int i=0; i<3; i++){
        for(int j=0; j<3; j++){
            System.out.print(ch++);
        }
        System.out.println();
    }
    System.out.println("------------------");
    for(int j=0;j<=6;j+=3){
        for(int i=1; i<4; i++){
        System.out.print((char)(i+j+96));
        }
        System.out.println();
    }
    System.out.println("------------------");
    System.out.println("Q3.");
    System.out.println("123");
    System.out.println("456");
    System.out.println("789");
    System.out.println("------------------");
    for(int i=1; i<10; i++){
       System.out.print(i);
       if(i%3==0){System.out.println();}
    }
    System.out.println("------------------");
    int su=1;
    for(int i=0; i<3; i++){
        for(int j=0; j<3; j++){
            System.out.print(su++);
        }
        System.out.println();
    }
    System.out.println("------------------");
    // 1 2 3 -> 1+0,2+0,3+0
    // 4 5 6 -> 1+3,2+3,3+3
    // 7 8 9 -> 1+3+3,2+3+3,3+3+3
    for(int j=0;j<=6;j+=3){
        for(int i=1; i<4; i++){
        System.out.print(i+j);
        }
        System.out.println();
    }
    System.out.println("------------------");
    // 1 2 3 -> 1+3*0,2+3*0,3+3*0
    // 4 5 6 -> 1+3*1,2+3*1,3+3*1
    // 7 8 9 -> 1+3*2,2+3*2,3+3*2
    for(int j=0;j<=2;j++){
        for(int i=1; i<4; i++){
        System.out.print(i+3*j);
        }
        System.out.println();
    }
    System.out.println("------------------");
    System.out.println("Q4.");
    System.out.println("123");//
    System.out.println("234");
    System.out.println("345");
    System.out.println("------------------");
    for(int i=0; i<3; i++){
        for(int j=1; j<4; j++){
        System.out.print(j+i);
        }
        System.out.println();
    }
    System.out.println("------------------");
    int temp=3;
    for(int i=1; i<6; i++){
        System.out.print(i);
        if(i!=5&&temp==i){
            System.out.println();
            i-=2;
            temp++;
        }
    }
    System.out.println("\n------------------");
    char mark='★';
    //★
    //★★
    //★★★
    for(int j=1; j<4; j++){
        for(int i=0; i<j; i++){
        System.out.print(mark);
        }
        System.out.println();
    }
    System.out.println("------------------");
    // 1 2  3 4 5  6 7 8 9 10
    //★★★★★★★★★★
    // @   @        @           @

    int x=1;
    int y=2;
    for(int i=1; i<11; i++){
        System.out.print(mark);
        if(i==x){
        System.out.println();
        x=i+y++;
        }
    }
    // 0 1 2 3 4 5 6 7 8 9 10 1 2 3
    //★@★★@★★★@★★★★@
    // 1(1+0) 4(1+3) 8(1+3+4) 13(1+3+4+5)
    int a=1;
    int b=3;
    for(int i=0; i<14; i++){
        if(i==a){
        System.out.println();
        a+=b++;
        }else{
        System.out.print(mark);
        }
    }
  }

}



















