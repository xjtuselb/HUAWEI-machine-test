package 华为机试题;

import java.util.Scanner;

public class 字符串运用密码截取4 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while (in.hasNextLine()) {
			String s = in.nextLine();
			System.out.println(getLongestPalindromeLength(s));
		}
		in.close();
	}

	public static int getLongestPalindromeLength(String s) {
		String r = "";
		String s1 = new StringBuffer(s).reverse().toString();
		for (int i = 0; i < s.length(); i++) {
			for (int j = i; j < s.length(); j++) {
				String x = s.substring(i, j + 1);
				if (s1.contains(x) && x.length() > r.length()) {
					r = x;
				}
			}
		}
		return r.length();
	}
}
