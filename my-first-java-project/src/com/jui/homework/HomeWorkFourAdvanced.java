/*******************************************************************************
 * Project Key : 
 * Create on 2017年12月9日 下午9:23:39
 * Copyright (c) 2017.瑞瑞版權所有. 
 * 注意：本內容請勿涉及商業目的
 ******************************************************************************/
package com.jui.homework;

import java.util.Arrays;

/**
 * @author 瑞瑞
 *
 */
public class HomeWorkFourAdvanced {

	/**
	 * @param args
	 */

	/*
	 * 班上有8位同學,他們進行了6次考試 請算出每位同學考最高分的次數
	 */
	private static int[] ansArr = { 0, 0, 0, 0, 0, 0, 0, 0 };

	public static void ansss(int index) {
		ansArr[index] = ansArr[index] + 1;
	}

	public static void compare(int[][] numArray) {
		// 外層迴圈
		for (int i = 0; i < numArray.length; i++) {
			int c = 0;
			int index = 0;
			// 內層迴圈
			for (int a = 0; a < numArray[i].length; a++) {
				if (numArray[i][a] > c) {
					c = numArray[i][a];
					index = a;
				}
			}
			HomeWorkFourAdvanced.ansss(index);
		}
	}

	public static void main(String[] args) {
		int[][] countArray = new int[6][7];
		int[] numArray1 = { 10, 35, 40, 100, 90, 85, 75, 70 };
		int[] numArray2 = { 37, 75, 77, 89, 64, 75, 70, 95 };
		int[] numArray3 = { 100, 70, 79, 90, 75, 70, 79, 90 };
		int[] numArray4 = { 77, 95, 70, 89, 60, 75, 85, 89 };
		int[] numArray5 = { 98, 70, 89, 90, 75, 90, 89, 90 };
		int[] numArray6 = { 90, 80, 100, 75, 50, 20, 99, 75 };
		countArray[0] = numArray1;
		countArray[1] = numArray2;
		countArray[2] = numArray3;
		countArray[3] = numArray4;
		countArray[4] = numArray5;
		countArray[5] = numArray6;
		int[] studentNum = { 1, 2, 3, 4, 5, 6, 7, 8 };
		HomeWorkFourAdvanced.compare(countArray);
		System.out.println("同學座號為:   " + Arrays.toString(studentNum));
		System.out.println("最高分次數為: " + Arrays.toString(ansArr));
	}
}
