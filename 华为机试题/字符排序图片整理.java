package 华为机试题;

import java.util.Scanner;

public class 字符排序图片整理 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			String s = sc.nextLine();
			System.out.println(sortChar(s));
		}
		sc.close();
	}

	public static String sortChar(String s) {
		char[] c = s.toCharArray();

		for (int i = 0; i < c.length - 1; i++) {
			for (int j = i + 1; j < c.length; j++) {
				if ((int) c[i] >= (int) c[j]) {
					char x = c[i];
					c[i] = c[j];
					c[j] = x;
				}
			}
		}

		return new String(c);
	}

}
