package 华为机试题;

import java.util.Scanner;

public class 今天是一年中的第几天 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			int year = sc.nextInt();
			int month = sc.nextInt();
			int day = sc.nextInt();
			int sumday = getDay(year, month, day);
			System.out.println(sumday);
		}
		sc.close();

	}

	public static int getDay(int year, int month, int day) {

		int[] notleapYear = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0)
			notleapYear[1] = 29;

		if (year < 0 || month <= 0 || month > 12 || day <= 0 || day > 31)
			return -1;

		int sum = 0;
		for (int i = 0; i < month - 1; i++) {
			sum += notleapYear[i];
		}
		sum += day;
		return sum;
	}

}
