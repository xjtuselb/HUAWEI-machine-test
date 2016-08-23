package 华为机试题;

import java.math.BigDecimal;
import java.util.Scanner;

public class 超长整数相加 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNextLine()) {
			String s1 = sc.nextLine();
			String s2 = sc.nextLine();
			BigDecimal x = new BigDecimal(s1);
			BigDecimal y = new BigDecimal(s2);
			System.out.println(add(x, y));

		}

		sc.close();
	}

	public static BigDecimal add(BigDecimal x, BigDecimal y) {
		return x.add(y);
	}

}
