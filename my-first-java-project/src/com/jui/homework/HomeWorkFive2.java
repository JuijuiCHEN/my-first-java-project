/*******************************************************************************
 * Project Key : 
 * Create on 2017年12月10日 下午4:22:15
 * Copyright (c) 2017.瑞瑞版權所有. 
 * 注意：本內容請勿涉及商業目的
 ******************************************************************************/
package com.jui.homework;

/**
 * <P>TODO</P>
 * 
 * @version $Id$
 * @user 瑞瑞 2017年12月10日 下午4:22:15
 */
public class HomeWorkFive2 {

	/**
	 * <p>TODO</p>
	 * 
	 * @user 瑞瑞 2017年12月10日 下午4:22:15
	 */

	private static void randAvg() {
		int r;
		float sum = 0;
		System.out.println("本次亂數結果: ");
		for (int i = 0; i < 10; i++) {
			r = (int) (Math.random() * 100) + 1;
			System.out.print(r + " ");
			// 加總亂數放入sum
			sum = sum + r;
		}
		System.out.println();
		System.out.println("平均值為: " + sum / 10);
	}

	/*
	 * 請設計一個方法為randAvg()，從10個 0～100(含100)的整數亂數中取平均值 並印出這10個亂數與平均值
	 */

	public static void main(String[] args) {
		HomeWorkFive2.randAvg();

	}

}
