package com.kh.stackMain;

import java.util.Stack;

public class stackMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> stack = new Stack<>();
		stack.push(1);
		stack.push(2);
		stack.push(3);
		
		stack.pop();
		stack.clear();
		stack.peek();
		stack.size();
		stack.empty();
		stack.contains(1);
		System.out.println(stack.pop());
		System.out.println(stack.pop());
	}

}
