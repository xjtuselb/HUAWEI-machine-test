package 华为机试题;

import java.util.Scanner;

public class 真分数分解为诶及分数的和 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			String str = sc.next();
			Egyptsocre(str);
		}
		sc.close();

	}

	// 81/95
	// 1/2+1/3+1/57+1/570
	public static void Egyptsocre(String str) {
		String[] parts = str.split("/");
		// 分子
		int a = Integer.parseInt(parts[0]);
		// 分母
		int b = Integer.parseInt(parts[1]);
		StringBuilder sb = new StringBuilder();
		int c;

		while (a != 1) {
			// 特例8/35=1/5+1/35类型的一步到位，循环结束
			if (b % (a - 1) == 0) {
				sb.append("1/").append(b / (a - 1)).append('+');
				a = 1;
			} else {
				// 通用情况得到埃及分数的分子
				c = b / a + 1;
				sb.append("1/").append(c).append('+');

				// 通分得到差
				a = a * c - b;
				b = c * b;

				// 整除则循环结束
				if (b % a == 0) {
					b = b / a;
					a = 1;
				}
			}
		}

		sb.append("1/").append(b);
		System.out.println(sb.toString());
	}

}
