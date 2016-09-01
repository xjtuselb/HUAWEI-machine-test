package 华为机试题;

import java.util.Scanner;

public class 密码安全等级判断 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			String s = sc.nextLine();
			System.out.println(valuePassword(s));
		}
		sc.close();
	}

	// 长度
	public static int lengthToScore(String s) {
		int n = s.length();
		int score = 0;
		if (n <= 4)
			score = 5;
		if (n >= 5 && n <= 7)
			score = 10;
		if (n >= 8)
			score = 25;
		return score;
	}

	// 字母
	public static int letterToScore(String s) {
		int n = s.length();
		int score = 0;

		int lowercase = 0;
		int highcase = 0;

		for (int i = 0; i < n; i++) {
			char c = s.charAt(i);
			if (c >= 'a' && c <= 'z')
				lowercase++;
			if (c >= 'A' && c <= 'Z')
				highcase++;
		}

		if (lowercase + highcase == 0)
			score = 0;
		if (lowercase == n || highcase == n)
			score = 10;
		if (lowercase > 0 && highcase > 0)
			score = 20;

		return score;
	}

	// 数字
	public static int numberToScore(String s) {
		int n = s.length();
		int score = 0;

		int num = 0;

		for (int i = 0; i < n; i++) {
			char c = s.charAt(i);
			if (c >= '0' && c <= '9')
				num++;
		}

		if (num == 0)
			score = 0;
		if (num == 1)
			score = 10;
		if (num > 1)
			score = 20;

		return score;
	}

	// 符号
	public static int charToScore(String s) {
		int n = s.length();
		int score = 0;

		int charnum = 0;

		for (int i = 0; i < n; i++) {
			char c = s.charAt(i);
			if (!(c >= '0' && c <= '9') && !(c >= 'A' && c <= 'Z') && !(c >= 'A' && c <= 'Z'))
				charnum++;
		}

		if (charnum == 0)
			score = 0;
		if (charnum == 1)
			score = 10;
		if (charnum > 1)
			score = 25;

		return score;
	}

	// 奖励
	public static int reward(String s) {
		int score = 0;

		int letterToScore = letterToScore(s);
		int numberToScore = numberToScore(s);
		int charToScore = charToScore(s);

		if (letterToScore > 0 && numberToScore > 0 && charToScore == 0)
			score = 2;
		if (letterToScore == 10 && numberToScore > 0 && charToScore > 0)
			score = 3;
		if (letterToScore == 20 && numberToScore > 0 && charToScore > 0)
			score = 5;
		return score;
	}

	public static String valuePassword(String s) {
		int score = 0;
		String res = "";

		score = lengthToScore(s) + letterToScore(s) + numberToScore(s) + charToScore(s) + reward(s);

		if (score >= 90)
			res = "VERY_SECURE";
		if (score < 90 && score >= 80)
			res = "SECURE";
		if (score < 80 && score >= 70)
			res = "VERY_STRONG";
		if (score < 70 && score >= 60)
			res = "STRONG";
		if (score < 60 && score >= 50)
			res = "AVERAGE";
		if (score < 50 && score >= 25)
			res = "WEAK";
		if (score < 25 && score >= 0)
			res = "VERY_WEAK";
		return res;
	}

}
