package 华为机试题;

import java.util.Scanner;

public class 统计英文数字空格其他字符的个数 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNextLine()) {
			String s = sc.nextLine();
			System.out.println(getEnglishCharCount(s));
			System.out.println(getBlankCharCount(s));
			System.out.println(getNumberCharCount(s));
			System.out.println(getOtherCharCount(s));
		}
		sc.close();
	}

	public static int getEnglishCharCount(String str) {

		int num = 0;
		for (int i = 0; i < str.length(); i++) {
			if ((str.charAt(i) >= 'a' && str.charAt(i) <= 'z') || (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z')) {
				num++;
			}
		}
		return num;
	}

	public static int getBlankCharCount(String str) {
		int num = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == ' ') {
				num++;
			}
		}
		return num;
	}

	public static int getNumberCharCount(String str) {
		int num = 0;
		for (int i = 0; i < str.length(); i++) {
			if ((str.charAt(i) >= '0' && str.charAt(i) <= '9')) {
				num++;
			}
		}
		return num;
	}

	public static int getOtherCharCount(String str) {
		return str.length() - getEnglishCharCount(str) - getBlankCharCount(str) - getNumberCharCount(str);
	}

}
