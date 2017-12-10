package com.jui.homework;

import java.util.Scanner;

public class HomeWorkThree1 {
	
	/* 請設計一隻程式,使用者輸入三個數字後,
	 * 輸出結果會為正三角形、等腰三角形、
	 * 直角三角形、其它三角形或不是三角形
	 */
	
	public static void main(String[] args) {

		int a = 0, b = 0, c = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("請輸入三個整數: ");
		if (sc.hasNextInt()) {
			a = sc.nextInt();
			b = sc.nextInt();
			c = sc.nextInt();
		}
		if (a == b && b == c && a == c) {
			System.out.println("正三角形");
		} else if (a == b || b == c || a == c) {
			System.out.println("等腰三角形");
		} else if (a == 0 || b == 0 || c == 0) {
			System.out.println("不是三角形");
		} else if ((a * a) + (b * b) == (c * c) || (b * b) + (c * c) == (a * a) || (c * c) + (a * a) == (b * b)) {
			System.out.println("直角三角形");
		} else {
			System.out.println("其他三角形");
		}
		sc.close();
	}
}
