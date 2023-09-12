package com.kh.abstractSampleAnimal;

abstract class Animal { 
	//필드 S name;
	private String name;
	//생성자
	public Animal(String name) {
		this.name = name;
	}
	//추상메서드 동물소리출력 void makeSound();
	public abstract String makeSound();
	//일반메서드 동물이름출력 void displayname();
	public void setName(String name) {
		this.name =name;
		}
	public String getName(String name) {
		return name;
	}

}

//public void displayName() {
// sysout { "동물이름 "