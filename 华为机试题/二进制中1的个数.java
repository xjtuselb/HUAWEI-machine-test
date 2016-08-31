package 华为机试题;

import java.util.Scanner;

public class 二进制中1的个数 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			int n = sc.nextInt();
			int sum = fun(decToBin(n));
			System.out.println(sum);
		}
		sc.close();
	}

	// 十进制转化成二进制
	public static String decToBin(int n) {
		String s = "";
		while ((n / 2) != 0) {
			s += n % 2;
			n = n / 2;
		}
		s += n % 2;
		return new StringBuffer(s).reverse().toString();
	}

	// 统计1的个数
	public static int fun(String s) {
		int sum = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == '1') {
				sum++;
			}
		}
		return sum;
	}

}
