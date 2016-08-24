package 华为机试题;

import java.util.Scanner;

/**
 * 归纳了前面两种的算法中的特例，单独列举，作为循环结束条件，综合比较：方法一最精妙，方法三最好理解
 * 
 * @author hest0
 *
 */
public class 真分数分解为诶及分数的和3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			String str = sc.next();
			Egyptsocre(str);
		}
		sc.close();
	}

	public static void Egyptsocre(String str) {
		String[] parts = str.split("/");
		// 分子
		int a = Integer.parseInt(parts[0]);
		// 分母
		int b = Integer.parseInt(parts[1]);
		StringBuilder sb = new StringBuilder();
		int c;

		while (true) {

			// 特例一:11/570=1/57+1/570
			if (b % (a - 1) == 0) {
				sb.append("1/").append(b / (a - 1)).append('+').append("1/").append(b);
				break;
			}

			// 特例二:3/10=1/5+1/10
			if (a == 3 && b % 2 == 0) {
				sb.append("1/").append(b / 2).append("+").append("1/").append(b);
				break;
			}

			// 通用的分解方法
			c = b / a + 1;
			sb.append("1/").append(c).append("+");
			// 通分a/b-1/c
			a = a * c - b;
			b = b * c;

			// 特例三：4/12=1/3
			if (b % a == 0) {
				c = b / a;
				sb.append("1/").append(c);
				break;
			}
		}

		System.out.println(sb.toString());

	}

}
