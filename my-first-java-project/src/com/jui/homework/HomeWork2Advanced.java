package com.jui.homework;

public class HomeWork2Advanced {

	public static void main(String[] args) {
		// Homework_02第二、三頁練習作業~

		// 1~49扣除有4的數字其餘顯示出來及總數
		System.out.println("可以選擇的數字有:");
		int a = 0;
		for (int b = 1; b <= 49; b++) {
			if (b % 10 == 4 || b / 10 == 4) {
				continue;
			}
			System.out.print(b + " ");
			a++;
		}
		System.out.println(" ");
		System.out.println("總共有" + a + "個");

		System.out.println(" ");
		// 輸出1~10數字遞減圖
		for (int j = 10; j > 0; j--) {
			for (int i = 1; i <= j; i++) {
				System.out.print(i + " ");
			}
			System.out.println();
		}
		System.out.println(" ");

		// 輸出A~F遞增圖
		for (char w = 'A'; w <= 'F'; w++) {
			for (int b = 64; b < w; b++) {
				System.out.print(w);
			}
			System.out.println();
		}

		System.out.println(" ");
		// for.while 99乘法表
		for (int c = 1; c <= 9; c++) {
			int d = 1;
			while (d <= 9) {
				System.out.print(d + "*" + c + "=" + (d * c) + "\t");
				d++;
			}
			System.out.println();
		}
		System.out.println(" ");

		// for.do while 99乘法表
		for (int e = 1; e <= 9; e++) {
			int f = 1;
			do {
				System.out.print(f + "*" + e + "=" + (f * e) + "\t");
				f++;
			} while (f <= 9);
			System.out.println(" ");
		}
		System.out.println();

		// while.do while 99乘法表
		int g = 1;
		while (g < 9) {
			g++;
			int h = 1;
			do {
				System.out.print(h + "*" + g + "=" + (h * g) + "\t");
				h++;
			} while (h <= 9);
			System.out.println(" ");
		}
	}
}
