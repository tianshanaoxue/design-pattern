/**  
 * @Title   Singleton.java   
 * @Package com.buckyball.dp.singleton   
 * @author  Roy
 * @email   574613441@qq.com
 * @weixin	qqqq123456
 * @date    2018年6月28日 下午8:05:57   
 * @Desc   
 */
package com.buckyball.dp.singleton;

/**  
 * @Title   Singleton.java   
 * @Package com.buckyball.dp.singleton   
 * @author  Roy
 * @email   574613441@qq.com
 * @weixin	qqqq123456
 * @date    2018年6月28日 下午8:05:57   
 * @Desc   
 */
public class Singleton {
	private Singleton(){}
	private static Singleton singleton = null;
	public static Singleton getInstance(){
		if(singleton == null){
			singleton = new Singleton();
		}
		return singleton;
	}
}
