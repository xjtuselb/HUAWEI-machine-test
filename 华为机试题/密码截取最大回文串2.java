package 华为机试题;

import java.util.Scanner;

public class 密码截取最大回文串2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			String s = sc.nextLine();
			System.out.println(getMaxHuiWen(s));
		}
		sc.close();
	}

	public static int getMaxHuiWen(String a) {
		String b = new StringBuffer(a).reverse().toString();
		int[][] c = new int[a.length() + 1][b.length() + 1];
		int max = 0;

		for (int i = 1; i < a.length() + 1; i++) {
			for (int j = 1; j < a.length() + 1; j++) {
				if (a.charAt(i - 1) == b.charAt(j - 1)) {
					c[i][j] = c[i - 1][j - 1] + 1;
				} else {
					c[i][j] = 0;
				}

				if (max < c[i][j])
					max = c[i][j];
			}
		}

		return max;
	}

}
