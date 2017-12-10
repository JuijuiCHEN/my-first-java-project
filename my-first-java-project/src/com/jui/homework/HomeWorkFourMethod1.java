/*******************************************************************************
 * Project Key : 
 * Create on 2017年12月9日 下午9:23:39
 * Copyright (c) 2017.瑞瑞版權所有. 
 * 注意：本內容請勿涉及商業目的
 ******************************************************************************/
package com.jui.homework;

import java.util.ArrayList;
import java.util.Arrays;

public class HomeWorkFourMethod1 {

	public static void hArray(String a) {

		// split 逗號分割字串 = [H,e,l,l,o,W,o,r,l,d]
		String[] aArray = a.split("");
		for (int x = aArray.length; x > 0; x--) {

			// aArray[i - 1] 取得字串相對位置
			System.out.print(aArray[x - 1]);
		}
	}

	public static void eightStar(String[] strArr, String[] vowel) {
		for (int size = 0; size < vowel.length; size++) {
			int count = 0;
			String str = Arrays.toString(strArr);
			for (int j = 0; j <= str.length(); j++) {

				// indexOf 返回索引這個字符串(str)中指定的子字符串(vowel)
				if (str.indexOf(vowel[size], j) > -1) {

					// 複寫 j = 返回vowel[size]索引位置下一個值,繼續索引
					j = str.indexOf(vowel[size], j);
					count = count + 1;
				}
			}
			System.out.println(vowel[size] + ":有:" + count + " 個");
		}

	}

	public static void borrowMoney(ArrayList<String[]> alist, int money) {
		System.out.print("有錢可借的員工編號:");

		int count = 0;
		for (int i = 0; i < alist.size(); i++) {
			// 轉換成int,比對(i)的第[1]個元素 需 > 輸入金額
			if (Integer.valueOf(alist.get(i)[1]) >= money) {
				System.out.print(" " + alist.get(i)[0] + " ");
				count++;
			}
		}
		System.out.print("，共 " + count + " 人");
	}

}
