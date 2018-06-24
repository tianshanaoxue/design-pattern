package com.buckyball.dp.factory.mult;

import com.buckyball.dp.factory.AnimalCat;
import com.buckyball.dp.factory.AnimalDog;
import com.buckyball.dp.factory.IAnimal;
/**
 * @Title   MultAnimalFactory.java   
 * @Package com.buckyball.dp.factory.mult   
 * @author  Roy
 * @email   574613441@qq.com
 * @weixin	qqqq123456
 * @date    2018年6月25日 上午12:56:58   
 * @Desc	多工厂方法模式
 */
public class MultAnimalFactory {
	
	public IAnimal createDog(){
		return new AnimalDog();
	}
	public IAnimal createCat(){
		return new AnimalCat();
	}
}
