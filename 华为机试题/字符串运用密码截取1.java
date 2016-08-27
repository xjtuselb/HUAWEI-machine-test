package 华为机试题;

import java.util.Scanner;

public class 字符串运用密码截取1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			System.out.println(getTheMaxSubstring(sc.nextLine()));
		}
		sc.close();
	}

	public static int getTheMaxSubstring(String s) {
		int max = 0;

		if (isDuicheng(s) == true) {
			max = s.length();
		} else {
			for (int i = 0; i < s.length(); i++) {
				for (int j = i; j < s.length(); j++) {
					String substr = s.substring(i, j + 1);
					if (isDuicheng(substr) == true && substr.length() > max) {
						max = substr.length();
					}
				}
			}
		}

		return max;
	}

	public static boolean isDuicheng(String s) {
		return s.equals(new StringBuffer(s).reverse().toString());
	}

}
