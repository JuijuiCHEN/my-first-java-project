package com.jui.homework;

public class HomeWork {
	public static String seconds2DHMS(int s) {
		// 第二題的方法
		// 天 :60秒*60分鐘*24小時
		int day = s / (60 * 60 * 24);

		// 小時 : 60秒*60分鐘*24小時 / 60秒*60分鐘
		int hour = (s % (60 * 60 * 24)) / (60 * 60);

		// 分 : 60秒*60分鐘 / 60秒
		int minute = (s % (60 * 60)) / (60);

		// 秒 : 60秒
		int second = (s % (60));
		return day + " 天 " + hour + " 時 " + minute + " 分 " + second + " 秒 ";
	}

	public static void main(String[] args) {

		// 1.計算12、6的和與積
		int twelve = 12, six = 6;
		int sum = twelve + six;
		int product = twelve * six;
		System.out.println("第一題: 和 " + sum + " 積 " + product);

		// 2.計算200顆蛋共是幾打幾顆
		int egg = 200;
		int egg12 = egg / 12;
		double remaining = egg % 12;
		System.out.println("第二題 : " + egg12 + "打," + "剩餘" + remaining + "顆");

		// 3.算出256559秒為多少天、多少小時、分、秒
		System.out.println("第三題 : " + HomeWork.seconds2DHMS(256559));

		// 4.定義常數3.1415(圓周率)並算出半徑為5的圓面積與圓周長
		final float PI = 3.1415f;
		float length = (5.0f * 2.0f) * PI;
		float area = (5.0f * 5.0f) * PI;
		System.out.println("第四題: 圓周長 " + length + " 圓面積 " + area);

		// 5.銀行存入150萬,利率為2%,每年利息都繼續存入,10年後本金+利息有多少錢
		long money = 1_500_000;
		float pa = 0.02f;
		System.out.println("第五題: 本金+利息共" + (money + (money * pa * 10)) + "元");

		// 6.註解運算結果產生原因:
		// 為整數型態,會運算出5+5=10
		int sum1 = 5 + 5;
		System.out.println("第六題: " + sum1);

		// 單引號用法為字元定數,轉型整數'5'對照uniclde編號為53,加上5產生58
		char sum2 = 5 + '5';
		System.out.println((int) sum2);

		// String為字串,5為值,即會產生5"5"
		String sum3 = 5 + "\"5\"";
		System.out.println(sum3);

	}

}
