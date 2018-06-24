package com.buckyball.dp.factory.normal;

import com.buckyball.dp.factory.AnimalCat;
import com.buckyball.dp.factory.AnimalDog;
import com.buckyball.dp.factory.IAnimal;

public class NormalAnimalFactory {
	
	public IAnimal createAniman(String type){
		if("dog".equals(type)){
			return new AnimalDog();
		}else if("cat".equals(type)){
			return new AnimalCat();
		}else{
			System.out.println("你要创造的动物不存在！");
			return null;
		}
	}
}
