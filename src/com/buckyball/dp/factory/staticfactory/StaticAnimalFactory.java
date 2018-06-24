package com.buckyball.dp.factory.staticfactory;

import com.buckyball.dp.factory.AnimalCat;
import com.buckyball.dp.factory.AnimalDog;
import com.buckyball.dp.factory.IAnimal;
/**
 * 
 * @Title   StaticAnimalFactory.java   
 * @Package com.buckyball.dp.factory.staticfactory   
 * @author  Roy
 * @email   574613441@qq.com
 * @weixin	qqqq123456
 * @date    2018年6月25日 上午12:56:26   
 * @Desc	静态工厂方法模式
 */
public class StaticAnimalFactory {
	public static IAnimal createDog(){
		return new AnimalDog();
	}
	public static IAnimal createCat(){
		return new AnimalCat();
	}
}
