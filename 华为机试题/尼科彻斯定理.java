package 华为机试题;

import java.util.Scanner;

public class 尼科彻斯定理 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		while (sc.hasNextInt()) {
			System.out.println(f(sc.nextInt()));
		}
		sc.close();

	}

	public static String f(int n) {
		String s = "";

		for (int i = n * n - n + 1; i <= n * n + n - 1 - 2; i += 2) {
			s += i + "+";
		}
		s += (n * n + n - 1);

		return s;
	}

}
