package com.buckyball.dp.factory.normal;

import com.buckyball.dp.factory.AnimalCat;
import com.buckyball.dp.factory.AnimalDog;
import com.buckyball.dp.factory.IAnimal;
/**
 * 
 * @Title   NormalAnimalFactory.java   
 * @Package com.buckyball.dp.factory.normal   
 * @author  Roy
 * @email   574613441@qq.com
 * @weixin	qqqq123456
 * @date    2018年6月25日 上午12:56:42   
 * @Desc	普通工厂方法模式
 */
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
