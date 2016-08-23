package 华为机试题;

import java.util.Scanner;

public class 等差数列 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		while (sc.hasNextInt()) {
			int n = sc.nextInt();

			System.out.println(n * 2 + n * (n - 1) * 3 / 2);

		}
		sc.close();

	}

}
