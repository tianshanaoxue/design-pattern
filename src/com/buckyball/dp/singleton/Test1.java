/**  
 * @Title   Test1.java   
 * @Package com.buckyball.dp.singleton   
 * @author  Roy
 * @email   574613441@qq.com
 * @weixin	qqqq123456
 * @date    2018年6月28日 下午8:09:06   
 * @Desc   
 */
package com.buckyball.dp.singleton;

/**  
 * @Title   Test1.java   
 * @Package com.buckyball.dp.singleton   
 * @author  Roy
 * @email   574613441@qq.com
 * @weixin	qqqq123456
 * @date    2018年6月28日 下午8:09:06   
 * @Desc   
 */
public class Test1 {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Thread thread1 = new Thread(new Runnable(){
			@Override
			public void run() {
				System.out.println("thread1 run");
				Singleton1 singleton = Singleton1.getInstance();
				System.out.println("thread1 singleton = "+singleton);
			}
		});
		thread1.setName("thread1");
		Thread thread2 = new Thread(new Runnable(){
			@Override
			public void run() {
				System.out.println("thread2 run");
				Singleton1 singleton = Singleton1.getInstance();
				System.out.println("thread2 singleton = "+singleton);
			}
		});
		thread2.setName("thread2");
		
		Thread thread3 = new Thread(new Runnable(){
			@Override
			public void run() {
				System.out.println("thread3 run");
				Singleton1 singleton = Singleton1.getInstance();
				System.out.println("thread3 singleton = "+singleton);
			}
		});
		thread3.setName("thread3");
		
		thread1.start();
		thread2.start();
		thread3.start();
	}

}
