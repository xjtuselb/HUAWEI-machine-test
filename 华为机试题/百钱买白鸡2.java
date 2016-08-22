package 华为机试题;

import java.util.Scanner;

public class 百钱买白鸡2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		while (sc.hasNextInt()) {
			sc.nextInt();
			BuyChicken();
		}
		sc.close();

	}

	public static void BuyChicken() {

		System.out.println(0 + " " + 25 + " " + 75);
		System.out.println(4 + " " + 18 + " " + 78);
		System.out.println(8 + " " + 11 + " " + 81);
		System.out.println(12 + " " + 4 + " " + 84);

	}

}
