package 华为机试题;

import java.util.Scanner;

public class 真分数分解为诶及分数的和2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			String str = sc.next();
			Egyptsocre(str);
		}
		sc.close();
	}

	// 81/95
	// 1/2+1/3+1/52+1/14820
	public static void Egyptsocre(String str) {
		String[] parts = str.split("/");
		// 分子
		int a = Integer.parseInt(parts[0]);
		// 分母
		int b = Integer.parseInt(parts[1]);
		StringBuilder sb = new StringBuilder();
		int c;

		while (true) {

			// 一般性算法得到埃及分数的分子
			if (b % a == 0) {
				c = b / a;
				a = 1;
			} else {
				c = b / a + 1;
			}

			// 循环结束判断
			if (a == 1) {
				sb.append("1/").append(c);
				break;
			} else if (a == 3 && b % 2 == 0) {
				sb.append("1/").append(b / 2).append("+").append("1/").append(b);
				break;
			} else {
				sb.append("1/").append(c).append("+");
			}

			// 通分a/b-1/c
			a = a * c - b;
			b = b * c;

		}

		System.out.println(sb.toString());
	}

}
