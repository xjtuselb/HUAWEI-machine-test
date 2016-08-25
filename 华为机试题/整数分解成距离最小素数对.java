package 华为机试题;

import java.util.Scanner;

public class 整数分解成距离最小素数对 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			int n = sc.nextInt();
			if (n % 2 != 0 && n < 2)
				continue;
			System.out.println(minPrime(n) + "\n" + (n - minPrime(n)));
		}
		sc.close();

	}

	public static int minPrime(int n) {
		int x = 0;
		int min = Integer.MAX_VALUE;

		for (int i = 2; i <= n / 2; i++) {
			if (isPrime(i) == false || isPrime(n - i) == false)
				continue;

			if (min > Math.abs(2 * i - n)) {
				min = Math.abs(2 * i - n);
				x = i;
			}
		}

		return x;
	}

	public static boolean isPrime(int n) {
		if (n <= 3)
			return true;
		else {
			for (int i = 2; i <= Math.sqrt(n); i++) {
				if (n % i == 0)
					return false;
			}
		}
		return true;
	}

}
