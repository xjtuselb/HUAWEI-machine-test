package 华为机试题;

import java.util.Scanner;

public class 等差数列2 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		while (sc.hasNextInt()) {
			int n = sc.nextInt();
			int s = 0;
			while (n != 0) {
				s += an(n);
				n--;
			}
			System.out.println(s);
		}
		sc.close();
	}

	public static int an(int n) {
		return 2 + (n - 1) * 3;
	}
}
