package com.buckyball.dp.abstractfactory;

public class AnimalDog implements IAnimal{

	@Override
	public void makeSound() {
		System.out.println("小狗叫，汪汪汪...");
	}

}
