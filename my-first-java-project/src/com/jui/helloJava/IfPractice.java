package com.jui.helloJava;

public class IfPractice {

	public static void main(String[] args) {

		// if比較關係值
		if (true) {
			System.out.println(1);
		}

		// else接下去比較關係值
		int Score = 100;

		if (Score >= 90) {
			System.out.println("A");
		} else if (Score >= 80) {
			System.out.println("B");
		} else if (Score >= 70) {
			System.out.println("C");
		} else
			System.out.println("D");
		{

		}
		// =是給他一個值
		int A = 1;
		System.out.println(A);
		A = 2;
		System.out.println(A);
		// ==只會回答true or false
		System.out.println(A == 3);
		System.out.println(A == 2);
		
		
	}

}
