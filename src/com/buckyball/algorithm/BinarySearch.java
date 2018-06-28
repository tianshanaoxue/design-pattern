/**  
 * @Title   BinarySearch.java   
 * @Package com.buckyball.algorithm   
 * @author  Roy
 * @email   574613441@qq.com
 * @weixin	qqqq123456
 * @date    2018年6月28日 下午4:15:34   
 * @Desc   
 */
package com.buckyball.algorithm;

/**  
 * @Title   BinarySearch.java   
 * @Package com.buckyball.algorithm   
 * @author  Roy
 * @email   574613441@qq.com
 * @weixin	qqqq123456
 * @date    2018年6月28日 下午4:15:34   
 * @Desc   
 */
public class BinarySearch {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int [] arr = {1,2,9,18,36,57};
		System.out.println(binarySearch(arr,1));
		System.out.println(binarySearch(arr,2));
		System.out.println(binarySearch(arr,3));
		System.out.println(binarySearch(arr,9));
		System.out.println(binarySearch(arr,18));
		System.out.println(binarySearch(arr,36));
		System.out.println(binarySearch(arr,57));
	}
	
	public static int binarySearch(int[] array,int key){
		int start = 0;
		int end = array.length-1;
		while(start<=end){
			int cur = (start+end)/2;
			if(array[cur] == key){
				return cur;
			}else if(array[cur]>key){
				end = cur-1;
			}else{
				start = cur+1;
			}
		}
		return -1;
	}

}
