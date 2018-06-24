package com.buckyball.dp.factory.normal;

import com.buckyball.dp.factory.IAnimal;

public class Test {

	public static void main(String[] args) {
		NormalAnimalFactory factory = new NormalAnimalFactory();
		IAnimal dog = factory.createAniman("dog");
		IAnimal cat = factory.createAniman("cat");
		dog.makeSound();
		cat.makeSound();
	}

}
