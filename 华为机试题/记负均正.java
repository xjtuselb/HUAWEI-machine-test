package 华为机试题;

import java.util.Scanner;

public class 记负均正 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			int n = Integer.parseInt(sc.nextLine());
			int[] a = new int[n];
			String[] x = sc.nextLine().split(" ");
			for (int i = 0; i < n; i++) {
				a[i] = Integer.parseInt(x[i]);
			}
			f(a);
		}
		sc.close();
	}

	public static void f(int[] a) {
		int countP = 0;
		int countN = 0;
		float ave = 0.0f;

		for (int i = 0; i < a.length; i++) {
			if (a[i] < 0)
				countN++;
			if (a[i] > 0) {
				countP++;
				ave += a[i];
			}
		}

		ave = ave / countP;
		java.text.DecimalFormat df = new java.text.DecimalFormat(".#");

		System.out.print(countN + " ");
		System.out.println(df.format(ave));
	}

}
