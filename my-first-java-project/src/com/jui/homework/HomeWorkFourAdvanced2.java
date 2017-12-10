/*******************************************************************************
 * Project Key : 
 * Create on 2017年12月9日 下午10:10:40
 * Copyright (c) 2017.瑞瑞版權所有. 
 * 注意：本內容請勿涉及商業目的
 ******************************************************************************/
package com.jui.homework;

import java.util.Scanner;

/**
 * <P>TODO</P>
 * 
 * @version $Id$
 * @user 瑞瑞 2017年12月9日 下午10:10:40
 */
public class HomeWorkFourAdvanced2 {

	/**
	 * <p>TODO</p>
	 * 
	 * @user 瑞瑞 2017年12月9日 下午10:10:40
	 */

	/*
	 * 請設計一隻程式由鍵盤輸入三個整數,分別代表西元yyyy年,mm月,dd日,它會顯示是該年的第幾天。 例:輸入 1984 9 8 三個號碼後,程式會顯示「西元1984年,第250天」
	 */

	public static void main(String[] args) {
		Scanner scYear = new Scanner(System.in);
		System.out.println("請輸入西元年");
		int year = scYear.nextInt();

		Scanner scMon = new Scanner(System.in);
		System.out.println("請輸入月");
		int month = scMon.nextInt();

		Scanner scDay = new Scanner(System.in);
		System.out.println("請輸入日");
		int day = scDay.nextInt();
		int sum = 0;
		if (year > 0 && month > 0 && month < 13 && day > 0 && day < 32) {
			// i為0,先算日,再算月
			for (int i = 0; i < month; i++) {
				switch (i) {
					case 1:
					case 3:
					case 5:
					case 7:
					case 8:
					case 10:
					case 12:
						day = 31;
						break;
					case 4:
					case 6:
					case 9:
					case 11:
						day = 30;
						break;
					case 2:
						if ((day % 400 == 0) || (day % 4 == 0 && day % 100 != 0)) {
							day = 29;
						} else {
							day = 28;
						}
						break;
				}
				sum = sum + day;
			}
		}
		System.out.println("西元" + year + "年, " + "第:" + sum + "天");
		scYear.close();
		scMon.close();
		scDay.close();
	}
}
