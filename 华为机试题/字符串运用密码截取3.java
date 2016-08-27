package 华为机试题;

import java.util.*;

public class 字符串运用密码截取3 {
	// 线性复杂度 O(n),求最长回文子串
	public static int getLongestPalindromeLength(String str) {
		// 先处理字符串
		StringBuilder sb = new StringBuilder();
		sb.append("#");
		for (int i = 0; i < str.length(); i++) {
			sb.append(str.charAt(i));
			sb.append("#");
		}
		System.out.println(sb.toString());

		// 回文半径数组
		int maxlen = 0;
		for (int i = 0; i < sb.length(); i++) {
			int r = 1;
			// 尝试更大半径
			while (i - r >= 0 && i + r < sb.length() && sb.charAt(i - r) == sb.charAt(i + r)) {
				r++;
			}
			maxlen = r > maxlen ? r : maxlen;
		}
		return maxlen - 1;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while (in.hasNextLine()) {
			String str = in.nextLine();
			System.out.println(getLongestPalindromeLength(str));
		}
		in.close();
	}
}