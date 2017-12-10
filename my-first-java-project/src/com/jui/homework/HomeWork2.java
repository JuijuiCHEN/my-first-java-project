package com.jui.homework;

public class HomeWork2 {

	public static void main(String[] args) {
		// Homework_02第一頁練習作業~

		// 1~1000的偶數和
		int sumNumber = 0;
		for (int i = 2; i <= 1000; i += 2) {
			sumNumber = sumNumber + i;
		}
		System.out.println(sumNumber);

		// for迴圈1~10的連乘積
		int forProduct = 1;
		for (int j = 1; j <= 10; j++) {
			forProduct = forProduct * j;
		}
		System.out.println(forProduct);

		// while迴圈1~10的連乘積
		int whileProduct = 1;
		int a = 1;
		while (a <= 10) {
			whileProduct = whileProduct * a;
			a++;
		}
		System.out.println(whileProduct);

		// 輸出1 4 9 16 25 36 49 64 81 100
		int nub = 0;
		for (int b = 1; b < 21; b += 2) {
			System.out.print(nub + b + " ");
			nub = nub + b;
		}

	}
}
