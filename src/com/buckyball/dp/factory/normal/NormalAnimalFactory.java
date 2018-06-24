package com.buckyball.dp.factory.normal;

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
