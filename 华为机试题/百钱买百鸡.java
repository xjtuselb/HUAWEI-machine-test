package 华为机试题;

import java.util.Scanner;

public class 百钱买百鸡 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNextInt()) {
			sc.nextInt();
			BuyChicken();
		}
		sc.close();
	}

	public static void BuyChicken() {
		for (int i = 0; i <= 100; i++) {
			for (int j = 0; j <= 100; j++) {
				for (int k = 0; k <= 100; k++) {
					if (i + j + k == 100 && 15 * i + 9 * j + k == 3 * 100)
						System.out.println(i + " " + j + " " + k);
				}
			}
		}

	}

}
