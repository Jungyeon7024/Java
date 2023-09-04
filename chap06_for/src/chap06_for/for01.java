package chap06_for;

public class for01 {

	public static void main(String[] args) {
		/*
		 for문은 프로그래밍에서 반복 작업을 수행하기 위해 사용되는 제어구조 
		 특정한 조건이 만족하는 동안 코드 블록을 반복 실행하는데 사용
		 대부분의 프로그래밍 언어에서 for문이 가진 구조
		 for(초기화; 조건; 증감) {
		  //조건 참일 경우 반복적으로 실행할 코드
		  }
		  초기화 : 반복문이 시작될 때 한 번만 실행되는 부분으로 반복 변수를 초기화 하는 역할을 한다.
		  조건  : 반복문이 실행될 조건을 검사하는 부븐으로 조건이 참일 경우에만 반복코드 블록 실행 후 실행
		  증감식: 반복 변수를 증가시키거나 감소시키는 부분으로 반복 코드 블록 실행 후 실행
		  
		 **/
		//     초기 i값; 조건 ; 증감식(증가와 감소를
		/*for (int i= 1; i<= 5; i++) {
			//조건 i<=5 참일 경우에 실행되는 공간
			System.out.println(i);
		}
		
		for (int i = 0; i <=5; i++) {
			System.out.println("i의 값 :" + i);
		}
		
		for (int i = 2; i <=7; i++) {
			System.out.println("i의 값 : " + i);
		}
		
		for (int i = 10; i >=5;	i--) {
			System.out.println("i의 값 :" + i ); 
		}
		
		
		int sum = 0;
		for(int i = 1; i<=10; i++) {
			
			sum += i;
			System.out.println("1부터 10까지의 합 :" + i);
		}
		*/
		// sum1의 합이 1~5 까지합 
		
		int sum1 = 0;
		for(int i = 1; i<=8; i++) {
			
			sum1 += i;
			System.out.println("1부터 8까지의 합 :" + sum1);
		}
		/*
		int sum2 = 10;
		for(int i = 1; i >=2; i--) {
			System.out.println("sum2 - :" + sum2);
			
		}
		
		int mul = 1;
		for (int i = 1; i <=9; i++ ) {
			mul = 2 * i;
		
			System.out.println("mul : " + mul);
		
			
		} 
		*/
	}

}
