/*******************************************************************************
 * Project Key : 
 * Create on 2017年12月9日 下午9:23:39
 * Copyright (c) 2017.瑞瑞版權所有. 
 * 注意：本內容請勿涉及商業目的
 ******************************************************************************/
package com.jui.homework;

import java.util.ArrayList;
import java.util.Scanner;

public class HomeWorkFour1 {

	public static void main(String[] args) {

		/*
		 * 請建立一個字串,經過程式執行後,輸入結果是反過來的 例如String s = “Hello World”,執行結果即為dlroW olleH
		 */

		HomeWorkFourMethod1.hArray("HelloWorld");

		System.out.println();
		System.out.println("===============================");

		/*
		 * 有個字串陣列如下 (八大行星): {"mercury", "venus", "earth", "mars", "jupiter", "saturn", "uranus",
		 * "neptune" } 請用程式計算出這陣列裡面共有多少個母音(a, e, i, o, u)
		 */

		String[] bigStar = { "mercury", "venus", "earth", "mars", "jupiter", "saturn", "uranus", "neptune" };
		String[] vowel = { "a", "e", "i", "o", "u" };
		HomeWorkFourMethod1.eightStar(bigStar, vowel);

		System.out.println("===============================");

		/*
		 * 請設計一個程式,可以讓小華輸入欲借的金額後,便會顯示哪些員工編號的同事 有錢可借他;並且統計有錢可借的總人數:例如輸入 1000 就顯示「有錢可借的 員工編號: 25 19 27
		 * 共 3 人!」
		 */

		int s = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("請輸入要借的金額數字: ");
		if (sc.hasNextInt()) {
			s = sc.nextInt();
		}

		ArrayList<String[]> list = new ArrayList<>();
		list.add(new String[] { "25", "2500" });
		list.add(new String[] { "32", "800" });
		list.add(new String[] { "8", "500" });
		list.add(new String[] { "19", "1000" });
		list.add(new String[] { "27", "1200" });
		HomeWorkFourMethod1.borrowMoney(list, s);
		sc.close();
	}
}
