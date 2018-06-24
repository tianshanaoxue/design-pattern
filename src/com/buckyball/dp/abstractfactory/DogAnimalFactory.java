/**  
 * @Title   DogAnimalFactory.java   
 * @Package com.buckyball.dp.abstractfactory   
 * @author  Roy
 * @email   574613441@qq.com
 * @weixin	qqqq123456
 * @date    2018年6月25日 上午1:04:21   
 * @Desc   
 */
package com.buckyball.dp.abstractfactory;

/**  
 * @Title   DogAnimalFactory.java   
 * @Package com.buckyball.dp.abstractfactory   
 * @author  Roy
 * @email   574613441@qq.com
 * @weixin	qqqq123456
 * @date    2018年6月25日 上午1:04:21   
 * @Desc   
 */
public class DogAnimalFactory extends AbsAnimalFactory {

	/* (non-Javadoc)
	 * @see com.buckyball.dp.abstractfactory.AbsAnimalFactory#craeteAnimal()
	 */
	@Override
	public IAnimal craeteAnimal() {
		return new AnimalDog();
	}

}
