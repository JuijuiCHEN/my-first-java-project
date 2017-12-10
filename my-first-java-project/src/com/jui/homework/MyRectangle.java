/*******************************************************************************
 * Project Key : 
 * Create on 2017年12月10日 下午5:48:50
 * Copyright (c) 2017.瑞瑞版權所有. 
 * 注意：本內容請勿涉及商業目的
 ******************************************************************************/
package com.jui.homework;

/**
 * <P>TODO</P>
 * 
 * @version $Id$
 * @user 瑞瑞 2017年12月10日 下午5:48:50
 */
public class MyRectangle {
	// 有兩個double型態的屬性為width, depth
	private static double width;
	private static double depth;

	// 有三個方法:
	// 將收到的引數指派給width屬性
	void setWidth(double width) {
		MyRectangle.width = width;
	}

	// 將收到的引數指派給depth屬性
	void setDepth(double depth) {
		MyRectangle.depth = depth;
	}

	// 能計算該長方形的面積
	double getArea() {
		return MyRectangle.width * MyRectangle.depth;
	}

	// 有兩個建構子:
	// 不帶參數也無內容的建構子
	public MyRectangle() {
	}

	// 傳入的兩個引數會存到對應的屬性
	public MyRectangle(double width, double depth) {
		MyRectangle.width = width;
		MyRectangle.depth = depth;
	}

}
