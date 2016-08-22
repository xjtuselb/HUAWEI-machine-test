package 华为机试题;

import java.util.Scanner;

public class 自守数 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		while (sc.hasNextInt()) {
			System.out.println(CalcAutomorphicNumbers(sc.nextInt()));
		}
		sc.close();

	}

	public static int CalcAutomorphicNumbers(int n) {
		int num = 0;

		for (int i = 0; i <= n; i++)
			if (isZSS(i) == true)
				num++;

		return num;
	}

	public static boolean isZSS(int n) {
		boolean flag = false;

		if (n == (n * n) % (Math.pow(10, (n + "").length())))
			flag = true;

		return flag;
	}

}
