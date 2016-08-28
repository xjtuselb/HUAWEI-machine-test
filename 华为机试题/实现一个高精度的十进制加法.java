package 华为机试题;

import java.math.BigDecimal;
import java.util.Scanner;

public class 实现一个高精度的十进制加法 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			String s = sc.next();
			String s1 = sc.next();
			BigDecimal x = new BigDecimal(s);
			BigDecimal y = new BigDecimal(s1);

			System.out.println(getAdd(x, y));
		}
		sc.close();
	}

	public static BigDecimal getAdd(BigDecimal x, BigDecimal y) {
		return x.add(y);
	}

}
