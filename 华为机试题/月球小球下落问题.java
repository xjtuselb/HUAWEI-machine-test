package 华为机试题;

import java.util.Scanner;

public class 月球小球下落问题 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		while (sc.hasNextInt()) {
			int h = sc.nextInt();
			System.out.println(getJourney(h, 5));
			System.out.println(getTenthHigh(h, 5));
		}
		sc.close();
	}

	/**
	 * 初始高度为high,第次落地时共经历了路程
	 * 
	 * @param high
	 * @param n
	 * @return
	 */
	public static double getJourney(int high, int n) {

		double s = 0;
		if (n == 1)
			s = high;
		if (n >= 2) {
			s += high;
			for (int i = 2; i <= n; i++) {
				s += high / (Math.pow(2, i - 2));
			}
		}

		return s;
	}

	/**
	 * high是初始的高度，n是第n次弹起的高度
	 * 
	 * @param high
	 * @param n
	 * @return
	 */
	public static double getTenthHigh(int high, int n) {

		double h = 0;

		h = high / (Math.pow(2, n));

		return h;
	}

}
