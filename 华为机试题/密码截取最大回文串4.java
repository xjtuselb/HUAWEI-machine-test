package 华为机试题;

import java.util.Scanner;

public class 密码截取最大回文串4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			String s = sc.next();
			System.out.println(longestPalindromeString(s));
		}
		sc.close();
	}

	public static int longestPalindromeString(String s) {

		int n = s.length();
		int max = 0;

		// 奇数bab类型的搜索
		for (int i = 0; i < n; i++) {

			int start = i - 1;
			int end = i + 1;

			while (start >= 0 && end < n && s.charAt(end) == s.charAt(start)) {

				int sublen = end - start + 1;
				if (sublen > max) {
					max = sublen;
				}
				end++;
				start--;
			}
		}

		// 偶数abba类型的搜索
		for (int i = 0; i < n; i++) {
			int start = i;
			int end = i + 1;

			while (start >= 0 && end < n && s.charAt(start) == s.charAt(end)) {

				int sublen = end - start + 1;
				if (sublen > max) {
					max = sublen;
				}
				end++;
				start--;
			}
		}

		return max;
	}

}