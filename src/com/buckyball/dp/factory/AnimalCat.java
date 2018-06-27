package com.buckyball.dp.factory;
/**
 * @Title   AnimalCat.java   
 * @Package com.buckyball.dp.factory   
 * @author  Roy
 * @email   574613441@qq.com
 * @weixin	qqqq123456
 * @date    2018年6月25日 下午2:56:01   
 * @Desc
 */
public class AnimalCat implements IAnimal{

	@Override
	public void makeSound() {
		System.out.println("小猫叫，喵喵喵..");
	}

}
