package com.kh.example.practice4;

public class Student {
	/*
	- grade : int
	- classroom : int
	- name : String
	- height : double
	- gender : char
	+ Student()
	+ information() : void*/
	
	int grade;
	int classroom;
	String name;
	double height;
	char gender;
	
	public Student() {
	{			this.grade = 1;
				this.classroom =2;
				this.name="노네임";
				this.height=180;
				this.gender='남';
		}
	}
	
	public void information() {
		System.out.println("학년 : "+grade);
		System.out.println("반 : "+classroom);
		System.out.println("이름 : "+name);
		System.out.println("키 : "+ height);
		System.out.println("성별 : "+gender);
	}
	
	
}
