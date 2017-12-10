/*******************************************************************************
 * Project Key : 
 * Create on 2017年12月10日 下午6:13:09
 * Copyright (c) 2017.瑞瑞版權所有. 
 * 注意：本內容請勿涉及商業目的
 ******************************************************************************/
package com.jui.homework;

/**
 * <P>TODO</P>
 * 
 * @version $Id$
 * @user 瑞瑞 2017年12月10日 下午6:13:09
 */
public class MyRectangleMain {

	/**
	 * <p>TODO</p>
	 * 
	 * @user 瑞瑞 2017年12月10日 下午6:13:09
	 */
	public static void main(String[] args) {
		// 使用public MyRectangle()建構子建立物件，設定width, depth為10, 20，透過getArea()印出結果
		MyRectangle r = new MyRectangle();
		r.setWidth(10);
		r.setDepth(20);
		System.out.println(r.getArea());

		// 使用public MyRectangle(double width, double depth)建構子建立物件，設定width, depth為10,
		// 20，透過getArea()印出結果
		MyRectangle r1 = new MyRectangle(10, 20);
		System.out.println(r1.getArea());
	}

}
