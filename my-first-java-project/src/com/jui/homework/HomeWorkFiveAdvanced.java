/*******************************************************************************
 * Project Key : 
 * Create on 2017年12月10日 下午6:29:24
 * Copyright (c) 2017.瑞瑞版權所有. 
 * 注意：本內容請勿涉及商業目的
 ******************************************************************************/
package com.jui.homework;

/**
 * <P>TODO</P>
 * 
 * @version $Id$
 * @user 瑞瑞 2017年12月10日 下午6:29:24
 */
public class HomeWorkFiveAdvanced {

	static void genAuthCode() {
		System.out.println("本次隨機產生驗證碼為: ");
		int a = 0;
		String aString = "";
		for (int i = 0; i < 8; i++) {
			// 亂數3個號碼分別為:
			int ch = (int) (Math.random() * 3);
			// 在亂數取得數字0~9 char碼48-57
			if (ch == 0) {
				a = (int) (Math.random() * 9) + 48;
				// 在亂數取得英文大寫A~Z char碼65-90
			} else if (ch == 1) {
				a = (int) (Math.random() * 25) + 65;
				// 在亂數取得英文小寫a~z char碼97-122
			} else if (ch == 2) {
				a = (int) (Math.random() * 25) + 97;
			}
			// 字串值 = 字串值 + 亂數取得的char碼轉換字元
			aString = aString + (char) a;
		}
		System.out.println(aString);
	}

	/**
	 * <p>TODO</p>
	 * 
	 * @user 瑞瑞 2017年12月10日 下午6:29:24
	 */

	/*
	 * 系統註冊新增驗證碼功能，請設計一個方法void genAuthCode()， 當呼叫此方法時，會回傳一個8位數的驗證碼，此驗證碼內容包含了英文大小寫與數字的亂數組合
	 */
	public static void main(String[] args) {
		HomeWorkFiveAdvanced.genAuthCode();
	}

}
