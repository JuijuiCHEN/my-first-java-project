/*******************************************************************************
 * Project Key : 
 * Create on 2017年12月10日 下午5:00:55
 * Copyright (c) 2017.瑞瑞版權所有. 
 * 注意：本內容請勿涉及商業目的
 ******************************************************************************/
package com.jui.homework;

/**
 * <P>TODO</P>
 * 
 * @version $Id$
 * @user 瑞瑞 2017年12月10日 下午5:00:55
 */
public class HomeWorkFive3 {

	/**
	 * <p>TODO</p>
	 * 
	 * @user 瑞瑞 2017年12月10日 下午5:00:55
	 */

	private int maxElement(int[][] a) {
		int max = 0;
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				// 用max篩選出最大值
				if (max < a[i][j]) {
					max = a[i][j];
				}
			}
		}
		return max;
	}

	private double maxElement(double[][] b) {
		double max = 0;
		for (int i = 0; i < b.length; i++) {
			for (int j = 0; j < b[i].length; j++) {
				if (max < b[i][j]) {
					max = b[i][j];
				}
			}
		}
		return max;
	}

	/*
	 * 利用Overloading，設計兩個方法double maxElement(int x[][])與doublemaxElement(double
	 * x[][])，可以找出二維陣列的最大值並回傳
	 */
	public static void main(String[] args) {
		int[][] intArray = { { 1, 6, 3 }, { 9, 5, 2 } };
		double[][] doubleArray = { { 1.2, 3.5, 2.2 }, { 7.4, 2.1, 8.2 } };
		HomeWorkFive3 w = new HomeWorkFive3();
		System.out.println(w.maxElement(intArray));
		System.out.println(w.maxElement(doubleArray));

	}

}
