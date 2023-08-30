package com.kh.operator;

public class IncrementDecrement {

	public static void main(String[] args) {
		/* 3. 증감연산자(Increment & Decrement) : 증감연산자는 변수의 값을 1씩 증가시키거나 감소시킬 때 사용 
		      전위 증감 연산자 (++x, --x), 후위 증감 연산자(x++, x--)
		     1-1) 전위 증감 연산자
		         ++ 항의 값에 1을 더한다.
		         val = ++num;//num의 값이 1 증가한 후 val 변수에 대입
		         val = --num;//num의 값이 1 감소한 후 val 변수에 대입
		  
		   **/
		int val;
		int num1 = 10;
	    val = ++num1;//val 변수에 1+10을 해서 11이 대입됨
	    System.out.println(val);
	    
	    val = --num1;
	    //num 의 값이 1 감소한 후에 대입
	    System.out.println(val);
	    
	    
		// 1-2 후위 증감 연산자 : ++ 항의 값에 1을 더한다.
	    int val3;// val3 변수에 깁존  num3 값을 대입한 후 num3 값이 1증가 
	    int num2 = 10;
	    val3 = num2++;
	    //val3 = num2 값을 추가하자 
	    //num2 ++ 1추가하자 = num2 =11 
	    System.out.println(val3);
	    
	    int val4;
	    val4 = num2--;
	    System.out.println(val4);
	    

	}

}
