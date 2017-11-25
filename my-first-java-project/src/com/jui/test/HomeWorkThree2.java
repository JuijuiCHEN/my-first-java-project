package com.jui.test;

import java.util.Scanner;

public class HomeWorkThree2 {

	/*
	 * 請設計一隻程式,會亂數產生一個0~9的數字, 
	 * 然後可以玩猜數字遊戲,猜錯會顯示錯誤訊息, 
	 * 猜對則顯示正確訊息
	 */

	private static Scanner sc1;

	public static void main(String[] args) {
		System.out.println("開始猜數字吧!");
		int i = (int) (Math.random() * 10);
		while (true) {
			int user = -1;
			sc1 = new Scanner(System.in);
			if (sc1.hasNextInt()) {
				user = sc1.nextInt();
			}
			if (i == user) {
				System.out.println("答對了!答案是" + i);
				break;
			} else {
				System.out.println("答錯了");
				continue;
			}
		}
	}
}
