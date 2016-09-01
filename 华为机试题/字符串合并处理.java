package 华为机试题;

import java.util.Scanner;

public class 字符串合并处理 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			String s1 = sc.next();
			String s2 = sc.next();

			String mergeAndSort = mergeAndSort(s1, s2);
			String res = charToChar(mergeAndSort);
			System.out.println(res);

		}
		sc.close();
	}

	public static String mergeAndSort(String s1, String s2) {
		String s = s1 + s2;
		char[] c = s.toCharArray();

		for (int i = 0; i < c.length; i += 2) {
			for (int j = i + 2; j < c.length; j += 2) {
				if (c[i] >= c[j]) {
					char x = c[i];
					c[i] = c[j];
					c[j] = x;
				}
			}
		}

		for (int i = 1; i < c.length; i += 2) {
			for (int j = i + 2; j < c.length; j += 2) {
				if (c[i] >= c[j]) {
					char x = c[i];
					c[i] = c[j];
					c[j] = x;
				}
			}
		}

		String ss = new String(c);

		return ss;
	}

	public static String charToChar(String s) {
		String set0 = "0123456789ABCDEFabcdef";
		String set1 = "0123456789ABCDEF";
		String set2 = "084C2A6E195D3B7F";
		char[] c = s.toCharArray();

		for (int i = 0; i < c.length; i++) {
			// 遍历原来串中符合要求字符串
			char x = c[i];
			// 不合法检测
			if (!set0.contains(x + ""))
				continue;
			// 符合要求的小写转大写
			if (x >= 'a' && x <= 'f') {
				x = (char) ((int) c[i] - 32);
			}

			// 替换
			for (int j = 0; j < 16; j++) {
				if (set1.charAt(j) == x) {
					c[i] = set2.charAt(j);
					break;
				}
			}
		}
		return new String(c);

	}

}
