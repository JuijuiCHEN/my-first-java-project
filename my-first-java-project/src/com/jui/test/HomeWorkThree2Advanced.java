package com.jui.test;

import java.util.Scanner;

public class HomeWorkThree2Advanced {
	
	/* 會亂數產生一個0~100的數字,然後可以玩猜數字遊戲,
	 * 每次猜就會提示你是大於還是小於正確答案直到猜中答案
	 */

	private static Scanner sc3;

	public static void main(String[] args) {

		System.out.println("開始猜數字吧!");

		int i = (int) (Math.random() * 100);
		while (true) {
			int user = -1;
			sc3 = new Scanner(System.in);
			if (sc3.hasNextInt()) {
				user = sc3.nextInt();
			}
			if (user > i) {
				System.out.println("提示:在低一點!!");
				continue;
			} else if (user < i) {
				System.out.println("提示!在高一點!!");
				continue;
			} else {
				System.out.println("答對囉!!答案是" + i);
				break;
			}
		}
	}
}
