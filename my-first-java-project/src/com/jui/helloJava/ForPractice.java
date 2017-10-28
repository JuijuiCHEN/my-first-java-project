package com.jui.helloJava;

public class ForPractice {

	public static void main(String[] args) {

		// 乘法表2×1=2 3×1=3 4×1=4 5×1=5
		for (int i = 2; i <= 5; i++) {
			int result = i * 1;
			System.out.print(i + " × 1 = " + result + "\t");
		}
		System.out.println(" ");
		System.out.println("---------------------------------------");
		
		// 乘法表2×1=2 3×1=3 4×1=4 5×1=5  × 9列
		for (int j = 1; j <= 9; j++) {
			for (int i = 2; i <= 5; i++) {
				int result = i * 1;
				System.out.print(i + " × 1 = " + result + "\t");
			}
			System.out.println(" ");
		}
		System.out.println("---------------------------------------");

		// 乘法表2.3.4.5乘到9
		for (int j = 1; j <= 9; j++) {
			for (int i = 2; i <= 5; i++) {
				int result = i * j;
				System.out.print(i + " × "+ j + " = " + result + "\t");
			}
			System.out.println(" ");
		}
		System.out.println("---------------------------------------");
		
		// 完整99乘法表
		for (int k = 0; k <= 1; k++)
		for (int j = 1; j <= 9; j++) {
			for (int i = 2; i <= 5; i++) {
				int newi = i + k*4;
				int result = newi * j;
				System.out.print(newi + " × "+ j + " = " + result + "\t");
			}
			System.out.println(" ");
		}
		System.out.println("---------------------------------------");
		
		// 完整99乘法表
		for (int j = 1; j <= 9; j++) {
			for (int i = 2; i <= 9; i++) {
				int result = i * j;
				System.out.print(i + " × "+ j + " = " + result + "\t");
			}
			System.out.println(" ");
		}
		System.out.println("---------------------------------------");
		
}
}