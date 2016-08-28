package 华为机试题;

import java.util.Scanner;

public class 放苹果 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			int m = Integer.parseInt(sc.nextLine());
			int n = Integer.parseInt(sc.nextLine());
			System.out.println(fangpinguo(m, n));
		}
		sc.close();
	}

	public static int fangpinguo(int m, int n) {
		if (m == 0 || n == 1)
			return 1;
		else if (m < n)
			return fangpinguo(m, m);
		else
			return fangpinguo(m, n - 1) + fangpinguo(m - n, n);
	}
}
