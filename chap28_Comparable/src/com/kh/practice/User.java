package com.kh.practice;



public class User implements Comparable<User> {
	private String name;
	private int age;
	
	public User(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	@Override
	public int compareTo(User otherUser) {
		return this.age -otherUser.age;
	}
	
	@Override
	public String toString() {
		return "User name= " + name+" ,age" + age;
	}
	
	
}
