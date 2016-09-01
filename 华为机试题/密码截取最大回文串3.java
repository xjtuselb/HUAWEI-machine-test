package 测试二;

import java.util.Scanner;

public class 密码截取最大回文串3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			String s = sc.nextLine();
			findhuiwen(s);
		}
		sc.close();
	}

	public static void findhuiwen(String str) {
		char[] array = str.toCharArray();
		int n = array.length;
		int i, j, max = 0;
		for (i = 0; i < n; i++) {
			for (j = 0; j <= i && j < n - i; j++) {
				if (array[i - j] != array[i + j]) {
					break;
				}
			}
			max = max > 2 * j - 1 ? max : 2 * j - 1;

			for (j = 0; j <= i && j < n - i - 1; j++) {
				if (array[i - j] != array[i + j + 1]) {
					break;
				}
			}
			max = max > 2 * j ? max : 2 * j;
		}

		System.out.println(max);
	}
}