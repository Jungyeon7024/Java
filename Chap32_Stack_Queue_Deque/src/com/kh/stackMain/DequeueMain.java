package com.kh.stackMain;

import java.util.Deque;
import java.util. ArrayDeque;
public class DequeueMain {

	public static void main(String[] args) {
		
	/*
	 	 시작                        끝     
	 	  |                         |
	   	  v                         v
	 	[First] <-> [Second] <-> [Third]
	 */
		
// [    ]                                [   ]		
		
		
		// ArrayDequeue 사용하여 Dequeue 생성
		Deque<String> deque = new ArrayDeque<>();
		
		//요소 추가
		deque.addFirst("fisrt");
		deque.addLast("last");
		
		// 맨 앞과 맨 뒤 요소 확인
		System.out.println(deque.getFirst());
		System.out.println(deque.getLast());
		
		// 맨 앞과 맨 뒤 요소 제거
		deque.removeFirst();
		deque.removeLast();
		System.out.println(deque);
		
		//비어있는지 확인
		System.out.println(deque.isEmpty());
	}

}
