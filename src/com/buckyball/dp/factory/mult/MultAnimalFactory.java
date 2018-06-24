package com.buckyball.dp.factory.mult;

import com.buckyball.dp.factory.AnimalCat;
import com.buckyball.dp.factory.AnimalDog;
import com.buckyball.dp.factory.IAnimal;

public class MultAnimalFactory {
	
	public IAnimal createDog(){
		return new AnimalDog();
	}
	public IAnimal createCat(){
		return new AnimalCat();
	}
}
