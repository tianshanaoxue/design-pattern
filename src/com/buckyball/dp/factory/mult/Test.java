package com.buckyball.dp.factory.mult;

import com.buckyball.dp.factory.normal.IAnimal;

public class Test {
	public static void main(String[] args) {
		MultAnimalFactory factory = new MultAnimalFactory();
		IAnimal dog = factory.createDog();
		IAnimal cat = factory.createCat();
		dog.makeSound();
		cat.makeSound();
	}
}
