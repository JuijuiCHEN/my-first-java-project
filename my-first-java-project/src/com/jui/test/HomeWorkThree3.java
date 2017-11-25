package com.jui.test;

import java.util.Scanner;

public class HomeWorkThree3 {

	/*
	 * 阿文很喜歡簽大樂透(1~49),想要依心情決定討厭哪個數字,
	 * 輸入他不想要的數字,畫面會顯示他可以選擇的號碼與總數
	 */

	public static void main(String[] args) {
		int i = 0;
		Scanner sc2 = new Scanner(System.in);
		System.out.println("請輸入討厭的哪個數字?");
		if (sc2.hasNextInt()) {
			i = sc2.nextInt();
		}
		int a = 0, b = 0;
		for (int num = 1; num <= 49; num++) {
			if (num / 10 == i || num % 10 == i) {
				continue;
			} else if (num == i) {
				continue;
			}
			a++;
			b++;
			System.out.print(num + "\t");
			if (a == 7) {
				System.out.println();
				a = 0;
			}
		}
		sc2.close();
		System.out.println("總共有" + b + "個數字可選");
	}
}
