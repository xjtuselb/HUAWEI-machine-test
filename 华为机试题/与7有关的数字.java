package 华为机试题;

import java.util.Scanner;

public class 与7有关的数字 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNextInt()) {
			int x = sc.nextInt();
			System.out.println(f1(x));
		}
		sc.close();
	}

	public static int f1(int n) {
		int s = 0;
		for (int i = 1; i <= n; i++) {
			if (i % 7 == 0 || (Integer.toString(i)).contains("7")) {
				s++;
			}
		}
		return s;
	}
}
