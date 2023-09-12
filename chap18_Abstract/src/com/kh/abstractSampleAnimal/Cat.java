package com.kh.abstractSampleAnimal;

public class Cat extends Animal	{
	private String sound;
	private String name;
	public Cat(String name) {
		super(name);
		this.name =name;
	}
	@Override
	public String makeSound() {
		System.out.println(" 야옹"  );
		return name;
	}
}



