package com.buckyball.dp.factory.mult;

import com.buckyball.dp.factory.normal.AnimalCat;
import com.buckyball.dp.factory.normal.AnimalDog;
import com.buckyball.dp.factory.normal.IAnimal;

public class MultAnimalFactory {
	
	public IAnimal createDog(){
		return new AnimalDog();
	}
	public IAnimal createCat(){
		return new AnimalCat();
	}
}
