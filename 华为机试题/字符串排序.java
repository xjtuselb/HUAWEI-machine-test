package 华为机试题;

import java.util.Scanner;

public class 字符串排序 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			String s = sc.nextLine();
			System.out.println(sortArr(s));
		}
		sc.close();
	}

	public static String sortArr(String s) {
		String r = "";
		for (int i = 0; i < 26; i++) {
			for (int j = 0; j < s.length(); j++) {
				if (s.charAt(j) == (char) (i + 65) || s.charAt(j) == (char) (i + 97))
					r += s.charAt(j);
			}
		}

		char[] c = s.toCharArray();
		int index = 0;
		for (int i = 0; i < s.length(); i++) {
			if ((c[i] >= 'a' && c[i] <= 'z') || (c[i] >= 'A' && c[i] <= 'Z')) {
				c[i] = r.charAt(index);
				index++;
			}
		}

		return new String(c);
	}

}
