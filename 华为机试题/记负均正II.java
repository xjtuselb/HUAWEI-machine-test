package 华为机试题;

import java.util.Scanner;

public class 记负均正II {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			String[] a = sc.nextLine().split(" ");
			f(a);
		}
		sc.close();
	}

	public static void f(String[] a) {
		int fushugeshu = 0;
		int zhengshuhe = 0;

		for (int i = 0; i < a.length; i++) {
			int x = Integer.parseInt(a[i]);
			if (x >= 0)
				zhengshuhe += x;
			else
				fushugeshu++;
		}

		double average = zhengshuhe / (double) (a.length - fushugeshu);

		System.out.println(fushugeshu);
		System.out.printf("%.1f", average);
	}

}
