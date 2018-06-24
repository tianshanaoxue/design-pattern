package com.buckyball.dp.factory.staticfactory;

import com.buckyball.dp.factory.IAnimal;

public class Test {
	public static void main(String[] args) {
		IAnimal dog = StaticAnimalFactory.createDog();
		IAnimal cat = StaticAnimalFactory.createCat();
		dog.makeSound();
		cat.makeSound();
	}
}
