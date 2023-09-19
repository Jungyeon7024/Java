package com.kh.sync;
/*
 * 
 * synchronized
  다중 스레드 환경에서 동시 접근으로부터 데이터의 일관성을 보호하기 위해 사용되는 키워드
  하나의 스레드가 특정 블록 또는 메서드를 실행하는 동안
  다른 스레드가 동일한 블록 또는 메서드에 동시에 접근하지 못하도록함
  스레드 간 경쟁 조건과 데이터 불일치 문제를 방치하는데 도움
  
  메서드 동기화 : 메서드 동기화 하는 경우 해당 메서드의 실행중에는 다른 스레드가 해당 메서드에
  			  접근할수 없음
  	ex) public synchronized void syncMethod(){
  						//동기화된 메서드 내용
  		}
  블록 동기화  : 특정 블록을 동기화하는 경우 블록 내부의 코드만 가능
  	ex) public void someMethod() {
  	     //비동기 코드
  	       
  	    synchronized() { 
  	    //동기화된 블록 내용
  	    }
  	    //비동기코드
  	     *   
    			  			  
 */
public class syncMethod {
	private int count = 0;
	private Object lockObj = new Object(); //동기화를 위한 객체
	
	//메서드 레벨 동기화를 사용해서 count 변수를 증가시킴
	//한번에 하나의 스레드만 접근할 수있도록 정함
	public synchronized void increment() {
		count++;
	}
	
	/*
	 pTask : 동기화된 블록과 함께 사용
	 synchronized(lockObj) " 코드 블록 내에서  count 변수를 증가시키기 전에
	 						lockOBj를 사용하여 동기화를 수정
	 lockObj : 다른 메서드에서 동기화에 사용할 수 있고, 다른 겍체에 대한 동기화와 분리되어 충돌을 방치할 수 있음
	 * 
	 */
	public void pTask() {
		//다른 비동기 코드 
		
	synchronized(lockObj) {
		count++;
	}
		//다른 비동기 코드
		
		
	}
	
	//syncMethod 클래스의 인스턴스를 생성
	public static void main(String[] args) {
		syncMethod sync = new syncMethod();

		
		//Runnable 인터페이스 구현을 사용해서 두 개의 스레드 생성
		//스레드 생성
		Runnable task1 = new Runnable() {
			@Override
			public void run() {
				for(int i = 0; i <1000; i++) {
					sync.increment();
				}
			}
		};
		
		Runnable task2 = new Runnable() {
			@Override
			public void run() {
				for(int i= 0; i<1000; i++) {
					sync.increment();
				}
			}
		};
		
		// 스레드 생성 및 시작
		Thread thread1 = new Thread(task1);
		Thread thread2 = new Thread(task2);
		
		thread1.start();
		thread2.start();
		
		try {
			thread1.join();
			thread2.join();
		} catch ( InterruptedException e){
			e.printStackTrace();
		}
		System.out.println("최종 카운트 :" + sync.count);
	}

}


//synchronized count 변수에 대한 동시 접근을 동기화

//스레드간 경쟁 조건이 발생하지 않고 count 변수가 안전하게 증가
//데이터의 일관성을 보존
