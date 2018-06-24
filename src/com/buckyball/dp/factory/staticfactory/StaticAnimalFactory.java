package com.buckyball.dp.factory.staticfactory;

import com.buckyball.dp.factory.AnimalCat;
import com.buckyball.dp.factory.AnimalDog;
import com.buckyball.dp.factory.IAnimal;

public class StaticAnimalFactory {
	public static IAnimal createDog(){
		return new AnimalDog();
	}
	public static IAnimal createCat(){
		return new AnimalCat();
	}
}
