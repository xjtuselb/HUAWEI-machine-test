package 华为机试题;

import java.util.Scanner;

public class 兔子问题 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		while (sc.hasNextInt()) {
			System.out.println(f(sc.nextInt()));
		}
		sc.close();
	}

	public static long f(int n) {

		if (n == 1)
			return 1;
		if (n == 2)
			return 1;

		return f(n - 1) + f(n - 2);

	}

}
