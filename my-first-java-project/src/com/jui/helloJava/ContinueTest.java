package com.jui.helloJava;

public class ContinueTest {

	public static void main(String[] args) {
		// for(int i = 0 ; i<10 ; i++) {
		// if(i%2 == 0 ) {
		// //跳出這次迴圈，進入下一個迴圈
		// //1/2 = 0 .. 剩餘2
		// //2/2 = 1 .. 剩餘0
		// //3/2 = 1 .. 剩餘1
		// //5/2 = 2 .. 於1
		// //5%2 = 1
		//
		// continue;
		// }
		// System.out.println(5 % 2);
		// System.out.println(4 % 2);
		// }

		for (int i = 0; i < 3; i++) {
			System.out.println(i);
			System.out.println("我好帥");
			i = 0;
			System.out.println(i);
		}
	}

}
