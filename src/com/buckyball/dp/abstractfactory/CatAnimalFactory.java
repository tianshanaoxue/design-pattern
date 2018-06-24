/**  
 * @Title   CatAnimalFactory.java   
 * @Package com.buckyball.dp.abstractfactory   
 * @author  Roy
 * @email   574613441@qq.com
 * @weixin	qqqq123456
 * @date    2018年6月25日 上午1:05:30   
 * @Desc   
 */
package com.buckyball.dp.abstractfactory;

/**  
 * @Title   CatAnimalFactory.java   
 * @Package com.buckyball.dp.abstractfactory   
 * @author  Roy
 * @email   574613441@qq.com
 * @weixin	qqqq123456
 * @date    2018年6月25日 上午1:05:30   
 * @Desc   
 */
public class CatAnimalFactory extends AbsAnimalFactory {

	@Override
	public IAnimal craeteAnimal() {
		return new AnimalCat();
	}

}
