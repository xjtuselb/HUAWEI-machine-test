package 华为机试题;

import java.util.Scanner;

public class 字符串运用密码截取2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNext()) {
			String str = scanner.next();
			System.out.println(getResult(str));
		}
		scanner.close();
	}

	private static int getResult(String str) {
		int len = str.length();
		int maxLen = 0;
		// 奇数
		for (int i = 0; i < len; i++) {
			int j = i - 1, k = i + 1;
			while (j >= 0 && k < len && str.charAt(j) == str.charAt(k)) {
				int validlen = k - j + 1;
				if (validlen > maxLen) {
					maxLen = validlen;
				}
				j--;
				k++;
			}
		}
		// 偶数
		for (int i = 0; i < len; i++) {
			int j = i, k = i + 1;
			while (j >= 0 && k < len && str.charAt(j) == str.charAt(k)) {
				int validlen = k - j + 1;
				if (validlen > maxLen) {
					maxLen = validlen;
				}
				j--;
				k++;
			}
		}
		return maxLen;
	}

}