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
 * @Title Singleton.java
 * @Package com.buckyball.dp.singleton
 * @author Roy
 * @email 574613441@qq.com
 * @weixin qqqq123456
 * @date 2018年6月28日 下午8:05:57
 * @Desc
 */
public class Singleton2 {
	private Singleton2() {
	}

	private static Singleton2 singleton = null;
	/**
	 * @return
	 */
	public static Singleton2 getInstance() {
		 if (singleton == null) {  
	            synchronized (singleton) { // 错误的书写形式,肯定会报错,空指针异常 
	                if (singleton == null) {  
	                	singleton = new Singleton2();  
	                }  
	            }  
	        }  
		 return singleton;
	}
}
