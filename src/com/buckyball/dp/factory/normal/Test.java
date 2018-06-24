package com.buckyball.dp.factory.normal;

public class Test {

	public static void main(String[] args) {
		NormalAnimalFactory factory = new NormalAnimalFactory();
		IAnimal dog = factory.createAniman("dog");
		IAnimal cat = factory.createAniman("cat");
		dog.makeSound();
		cat.makeSound();
	}

}
