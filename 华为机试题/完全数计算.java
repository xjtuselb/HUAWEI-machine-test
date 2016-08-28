package 华为机试题;

import java.util.Scanner;

public class 完全数计算 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			int n = sc.nextInt();
			System.out.println(getWanQuanShuGeShu(n));
		}
		sc.close();
	}

	private static int getWanQuanShuGeShu(int n) {
		int num = 0;
		for (int i = 1; i <= n; i++) {
			num += (isWanQuanShu(i) == true ? 1 : 0);
		}

		return num;
	}

	public static boolean isWanQuanShu(int n) {
		int sum = 0;
		for (int i = 1; i < n; i++) {
			sum += (n % i == 0 ? i : 0);
		}
		if (sum == n)
			return true;
		return false;
	}
}
