package 华为机试题;

import java.util.Scanner;

public class 质数因子排序 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext())
			System.out.println(getResult(sc.nextLong()));
		sc.close();
	}

	public static String getResult(long num) {
		int div = 2;
		String result = "";
		while (num != 1) {
			while (num % div == 0) {
				num = num / div;
				result = result + div + " ";
			}
			div++;
		}
		return result;
	}
}