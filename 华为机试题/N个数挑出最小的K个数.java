package 华为机试题;

import java.util.Arrays;
import java.util.Scanner;

public class N个数挑出最小的K个数 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		while (sc.hasNextInt()) {
			int la = sc.nextInt();
			int lb = sc.nextInt();
			if (la < lb)
				continue;

			int[] a = new int[la];
			// 输入
			for (int i = 0; i < a.length; i++) {
				a[i] = sc.nextInt();
			}
			// 排序
			Arrays.sort(a);
			// 取前面lb个
			String s = "";
			for (int i = 0; i < lb - 1; i++) {
				s += a[i];
				s += " ";
			}
			s += a[lb - 1];

			System.out.println(s);

		}
		sc.close();

	}

}
