package 华为机试题;

import java.util.Arrays;

public class 整数逆序输出 {

	public static void main(String[] args) {
		System.out.println(reverse(100));
	}

	public static String reverse(int x) {
		int len = 0;
		while (x != 0) {
			x = x / 10;
			len++;
		}

		int[] a = new int[len];

		if (x == 0)
			a[0] = 0;

		int i = 0;
		while (x != 0) {
			a[i++] = x % 10;
			x /= 10;
		}

		return Arrays.toString(a);
	}

}
