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
public class Singleton1 {
	private Singleton1(){}
	private static Singleton1 singleton = null;
	public static synchronized Singleton1 getInstance(){
		if(singleton == null){
			singleton = new Singleton1();
		}
		return singleton;
	}
}
