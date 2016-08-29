package 华为机试题;

import java.util.Scanner;

public class 杨辉三角第n行第一个偶数出现的位置2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			int n = sc.nextInt();
			System.out.println(getTheFirstEvenNumber(n));
		}
		sc.close();

	}

	public static int getTheFirstEvenNumber(int n) {
		int num = 0;
		if (n == 1 || n == 2)
			num = -1;
		else if (n % 2 == 1)
			num = 2;
		else if (n % 4 == 0)
			num = 3;
		else
			num = 4;
		return num;
	}

}
