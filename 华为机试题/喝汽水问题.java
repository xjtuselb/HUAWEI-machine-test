package 华为机试题;

import java.util.Scanner;

public class 喝汽水问题 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int i = 0;
		while (sc.hasNextInt() && i < 10) {
			i++;
			int x = sc.nextInt();
			if (x == 0)
				break;
			System.out.println(drinkJuice_3(x));
		}
		sc.close();

	}

	// 方案一：循环
	public static int drinkJuice_1(int n) {
		int shang = 1, yu = 0, fn = 0;

		while (shang != 0) {
			shang = n / 3;
			yu = n % 3;
			n = shang + yu;
			fn += shang;
		}

		return yu == 2 ? fn + 1 : fn;
	}

	// 方案二：数理分析
	public static int drinkJuice_2(int n) {
		return n / 2;
	}

	// 方案三：递归
	public static int drinkJuice_3(int n) {

		if (n == 1)
			return 0;
		else if (n == 2)
			return 1;

		return drinkJuice_3(n - 2) + 1;

	}

}
