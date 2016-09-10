package 华为机试题;

import java.util.Scanner;

public class 计算字符串的距离 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			String s1 = sc.nextLine();
			String s2 = sc.nextLine();
			System.out.println(calculateStringDistance(s1, s2));
		}
		sc.close();
	}

	public static int calculateStringDistance(String s1, String s2) {
		int len1 = s1.length();
		int len2 = s2.length();

		// 构造dp矩阵，可能存在0，所有len1+1
		int[][] dp = new int[len1 + 1][len2 + 1];

		// 第一列，每一行=i
		for (int i = 0; i <= len1; i++)
			dp[i][0] = i;

		// 第一行，每一列=0...len2-1
		for (int j = 0; j <= len2; j++)
			dp[0][j] = j;

		int a, b, c;
		a = b = c = 0;

		for (int i = 1; i <= len1; i++) {
			for (int j = 1; j <= len2; j++) {
				// 上一列+1
				// 上一行+1
				a = dp[i][j - 1] + 1;
				b = dp[i - 1][j] + 1;
				c = s1.charAt(i - 1) == s2.charAt(j - 1) ? dp[i - 1][j - 1] : dp[i - 1][j - 1] + 1;
				dp[i][j] = Math.min(Math.min(a, b), c);
			}
		}

		return dp[len1][len2];
	}

}
