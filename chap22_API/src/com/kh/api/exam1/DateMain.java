package com.kh.api.exam1;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class DateMain {
	/*
	 Date : 날짜와 시간 정보를 나타내는데 사용
	 	    java1.1 이후에 권장되지 않음
	 	    	java.time 패키지 LocalDate LocalTime LocalDateTime
	 * */

	public static void main(String[] args) {
		//import.java.time.LocalDate;
		LocalDate currentDate = LocalDate.now();
		System.out.println("현재 날짜 : "+ currentDate);
	
		LocalTime currentTime = LocalTime.now();
		System.out.println("현재 시간 : "+ currentTime);
		
		LocalDateTime currentDateTime = LocalDateTime.now();
		System.out.println("현재 날짜 & 시간 : "+ currentDateTime);
		
		
		LocalDate today = LocalDate.now();
		LocalDate futureDate = today.plusDays(7);
		System.out.println("7일 후 날짜 : "+ futureDate);
		
		
		//minus plus 2개이용
		
		LocalDate yesterday = LocalDate.now();
		LocalDate past = today.minusDays(1);
		System.out.println("5일 전 날짜 : "+ past);
		
		LocalDate tommorrow = LocalDate.now();
		LocalDate future = today.plusDays(2);
		System.out.println("2일 후 날짜 : "+ future);
		
		LocalDate thedayaftertommorrow = LocalDate.now();
		LocalDate future2 = today.plusDays(3);
		System.out.println("3일 후 날짜 : "+ future2);
		
		LocalDate date1 = LocalDate.of(2023, 9, 13);
		LocalDate date2 = LocalDate.of(2023, 9, 13);
		
		if(date1.isBefore(date2)) {
		
		}else if(""){
			
			
		}else {
			
		}
	
		
		
		
	}
	

}
