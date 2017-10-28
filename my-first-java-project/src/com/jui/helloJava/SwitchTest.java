package com.jui.helloJava;

public class SwitchTest {

	public static void main(String[] args) {

//		 做出月份有幾天
		int Month = (int)(Math.random() * 12 + 1);  //讓月份在1-12月
		System.out.println(Month+"月");
		switch (Month) {
		case 1: case 3: case 5: case 7: case 8: case 10: case 12:  //同天數的月份可以打在一起
			System.out.println("31天");
			break;
		case 2:
			System.out.println("28天");
			break;
		case 4: case 6: case 9: case 11:
			System.out.println("30天");
			break;
		default:
			System.out.println("No，月份參數錯誤");
			
		}
	}

}
