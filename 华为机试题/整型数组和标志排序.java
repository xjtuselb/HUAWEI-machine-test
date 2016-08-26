package 华为机试题;

import java.util.Arrays;
import java.util.Scanner;

public class 整型数组和标志排序 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {

			int n = Integer.parseInt(sc.nextLine());
			String[] str = sc.nextLine().split(" ");
			int flag = Integer.parseInt(sc.nextLine());

			int[] a = new int[n];
			for (int i = 0; i < n; i++)
				a[i] = Integer.parseInt(str[i]);

			sortIntegerArray(a, flag);

		}

		sc.close();
	}

	public static void sortIntegerArray(int[] a, int flag) {
		Arrays.sort(a);
		String s1 = "";
		String s2 = "";

		if (flag == 0) {
			for (int i = 0; i < a.length - 1; i++) {
				s1 += a[i];
				s1 += " ";
			}
			s1 += a[a.length - 1];
			System.out.println(s1);
		} else {
			for (int i = a.length - 1; i > 0; i--) {
				s2 += a[i];
				s2 += " ";
			}
			s2 += a[0];
			System.err.println(s2);
		}

	}

}
