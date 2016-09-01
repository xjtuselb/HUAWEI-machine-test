package 华为机试题;

import java.util.Scanner;

public class 字符串加解密 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			String s1 = sc.nextLine();
			String s2 = sc.nextLine();
			System.out.println(encrypt(s1));
			System.out.println(unEncrypt(s2));
		}
		sc.close();
	}

	public static String encrypt(String s) {
		String res = s;
		for (int i = 0; i < s.length(); i++) {
			char x = s.charAt(i);
			if (x >= 'A' && x <= 'Y')
				res = replace(res, i, (char) ((int) x + 33));
			if (x == 'Z')
				res = replace(res, i, (char) ((int) x + 7));
			if (x >= 'a' && x <= 'y')
				res = replace(res, i, (char) ((int) x - 31));
			if (x == 'z')
				res = replace(res, i, (char) ((int) x - 57));
			if (x >= '0' && x <= '9')
				res = replace(res, i, (char) ((int) x + 1));
			if (x == '9')
				res = replace(res, i, (char) ((int) x - 9));
		}
		return res;
	}

	public static String unEncrypt(String s) {
		String res = s;
		for (int i = 0; i < s.length(); i++) {
			char x = s.charAt(i);
			if (x >= 'B' && x <= 'Z')
				res = replace(res, i, (char) ((int) x + 31));
			if (x == 'A')
				res = replace(res, i, (char) ((int) x + 57));
			if (x >= 'b' && x <= 'z')
				res = replace(res, i, (char) ((int) x - 33));
			if (x == 'a')
				res = replace(res, i, (char) ((int) x - 7));
			if (x >= '1' && x <= '9')
				res = replace(res, i, (char) ((int) x - 1));
			if (x == '0')
				res = replace(res, i, (char) ((int) x + 9));
		}
		return res;
	}

	public static String replace(String s, int i, char x) {
		char[] c = s.toCharArray();
		c[i] = x;
		return new String(c);
	}

}
