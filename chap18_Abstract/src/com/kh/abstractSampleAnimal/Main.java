package com.kh.abstractSampleAnimal;

public class Main {

	public static void main(String[] args) {
		Dog dog = new Dog("개");
		System.out.println (dog.makeSound());
		Cat cat = new Cat("고양이");
		System.out.println(cat.makeSound());
		
		
		Animal[] animal = new Animal[2];
		//Animal[] animal = { "개", "고양이"};
		animal[0] = new Dog("개");
		System.out.println("개"+animal[0]);
		animal[1] = new Cat("고양이");
		System.out.println("고양이"+animal[1]);
		
		
		
		
		
		
		
		
		

	}

}
