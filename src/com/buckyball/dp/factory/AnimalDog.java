package com.buckyball.dp.factory;
/**
 * 
 * @Title   AnimalDog.java   
 * @Package com.buckyball.dp.factory   
 * @author  Roy
 * @email   574613441@qq.com
 * @weixin	qqqq123456
 * @date    2018年6月25日 下午2:55:54   
 * @Desc
 */
public class AnimalDog implements IAnimal{

	@Override
	public void makeSound() {
		System.out.println("小狗叫，汪汪汪...");
	}

}
