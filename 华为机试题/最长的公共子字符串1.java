package 华为机试题;

import java.util.Scanner;

public class 最长的公共子字符串1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			String s1 = sc.nextLine();
			String s2 = sc.nextLine();

			String min = s1.length() > s2.length() ? s2 : s1;
			String max = s1.length() > s2.length() ? s1 : s2;

			int len = 0;
			String res = "";
			for (int i = 0; i < min.length(); i++) {
				for (int j = i + len; j < min.length(); j++) {
					if (max.contains(min.substring(i, j + 1))) {
						len = j + 1 - i;
						res = min.substring(i, j + 1);
					} else
						break;
				}
			}

			System.out.println(res);
		}
		sc.close();
	}

}
