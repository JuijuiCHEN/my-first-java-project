/*******************************************************************************
 * Project Key : 
 * Create on 2017年12月10日 下午2:15:46
 * Copyright (c) 2017.瑞瑞版權所有. 
 * 注意：本內容請勿涉及商業目的
 ******************************************************************************/
package com.jui.homework;

import java.util.Scanner;

/**
 * <P>TODO</P>
 * 
 * @version $Id$
 * @user 瑞瑞 2017年12月10日 下午2:15:46
 */
public class HomeWorkFive1 {

	/**
	 * <p>TODO</p>
	 * 
	 * @user 瑞瑞 2017年12月10日 下午2:15:46
	 */

	private static void starSquare(int width, int height) {
		// 須從1開始,否則會多一位數, i <= height, height為實際輸入數字
		for (int i = 1; i <= height; i++) {
			System.out.print("*");
			// 一樣須從1開始, j < width, 顯示的第一個"*"是height的 , 故不須加等於 , 為實際輸入數字-1
			for (int j = 1; j < width; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	/*
	 * 請設計一個方法為starSquare(int width, int height)， 當使用者鍵盤輸入寬與高時，即會印出對應的*長方形。
	 */

	public static void main(String[] args) {
		int widthNum = 0, heightNum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("請輸入寬與高:");
		if (sc.hasNextInt()) {
			widthNum = sc.nextInt();
			heightNum = sc.nextInt();
		}
		HomeWorkFive1.starSquare(widthNum, heightNum);
		sc.close();
	}

}
