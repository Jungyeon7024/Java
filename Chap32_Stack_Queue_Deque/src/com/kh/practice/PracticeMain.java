package com.kh.practice;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class PracticeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	

}
	public void PracticeQueue() {
		Queue<String> queue = new LinkedList<>();
		
		queue.offer("쌀밥");
		queue.offer("현미밥");
		queue.offer("보리밥");
		queue.offer("흑미밥");
		queue.offer("찹쌀밥");
		
		String removeElement = queue.poll();
		System.out.println(removeElement);
		removeElement = queue.poll();
		
		String frontElement = queue.peek();
		int size = queue.size();
		System.out.println("size : "+size);
		
	}
}
