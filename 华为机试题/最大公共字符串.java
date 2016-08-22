package 华为机试题;

import java.util.Scanner;

public class 最大公共字符串 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		while (sc.hasNextLine()) {
			System.out.println(getCommonStrLength(sc.nextLine(), sc.nextLine()));
		}
		sc.close();

	}

	public static int getCommonStrLength(String s1, String s2) {
		String subs1 = "";
		int comlen = 0;

		for (int i = 0; i < s1.length(); i++) {
			for (int j = i; j < s1.length(); j++) {
				subs1 = s1.substring(i, j + 1);
				if (s2.contains(subs1) && subs1.length() >= comlen)
					comlen = subs1.length();
			}
		}

		return comlen;
	}

}
