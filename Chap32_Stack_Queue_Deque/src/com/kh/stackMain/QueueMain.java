package com.kh.stackMain;


import java.util.Queue;
import java.util.LinkedList;
public class QueueMain {

	public static void main(String[] args) {
		// 큐 Queue 생성
		Queue<String> queue = new LinkedList<>();
		/*
		    front               Rear(tail)
		 	  |                     |
		 	  v                     v
		 	+---+      +---+      +---+
		 	| 1 |  <-  | 2 |  <-  | 3 |
		 	+---+      +---+      +---+

		 */
		queue.offer("Apple");
		queue.offer("Banana");
		queue.offer("Cherry");
		
		//큐에서 요소 추출 및 출력
		String removeElement = queue.poll();// queue에서 Apple 제거하고 반환
		System.out.println(removeElement);
		
		removeElement = queue.poll(); //Banana 제거하고 반환
		
		//큐와 Front요소 확인
		String frontElement = queue.peek();// queue에서 front Cherry 반환
		
		//큐의 크기확인
		int size = queue.size(); //1이 될것임
		System.out.println("size : "+size);
		
		/*
		while(!queue.isEmpty()) {
			String element = queue.poll();
			System.out.println(element);
		}
		*/

	}

}
