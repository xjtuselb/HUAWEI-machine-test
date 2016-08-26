package 华为机试题;

import java.util.Arrays;
import java.util.Scanner;

public class 整型数组和标志排序2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {

			int n = Integer.parseInt(sc.nextLine());
			String[] str = sc.nextLine().split(" ");
			int flag = Integer.parseInt(sc.nextLine());

			int[] a = new int[n];
			for (int i = 0; i < n; i++) {
				a[i] = Integer.parseInt(str[i]);
			}

			Arrays.sort(a);

			String s1 = "";

			if (flag == 0) {
				for (int i = 0; i < a.length - 1; i++) {
					s1 += a[i];
					s1 += " ";
				}
				s1 += a[a.length - 1];
			}

			if (flag == 1) {
				for (int i = a.length - 1; i > 0; i--) {
					s1 += a[i];
					s1 += " ";
				}
				s1 += a[0];
			}

			System.out.println(s1);
		}

		sc.close();
	}

}
