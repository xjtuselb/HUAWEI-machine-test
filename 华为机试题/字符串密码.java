package 华为机试题;

import java.util.Scanner;

public class 字符串密码 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		while (sc.hasNextLine()) {
			char[] a = sc.nextLine().toCharArray();
			StringBuilder sb = new StringBuilder();

			for (int i = 0; i < a.length; i++) {
				sb.append(encrypt(a[i]));
			}

			System.out.println(sb.toString());
		}
		sc.close();

	}

	public static char encrypt(char x) {
		char t = ' ';

		if ((x < 'A' || x > 'Z') && (x < 'a' || x > 'z'))
			t = x;

		if (x >= 'A' && x <= 'Z') {
			if (x >= 'A' && x <= 'Y')
				t = (char) ((int) x + 33);
			if (x == 'Z')
				t = (char) (97);
		}

		if (x >= 'a' && x <= 'z') {
			switch (x) {
			case 'a':
			case 'b':
			case 'c':
				t = (char) (50);
				break;
			case 'd':
			case 'e':
			case 'f':
				t = (char) 51;
				break;
			case 'g':
			case 'h':
			case 'i':
				t = (char) 52;
				break;
			case 'j':
			case 'k':
			case 'l':
				t = (char) 53;
				break;
			case 'm':
			case 'n':
			case 'o':
				t = (char) 54;
				break;
			case 'p':
			case 'q':
			case 'r':
			case 's':
				t = (char) 55;
				break;
			case 't':
			case 'u':
			case 'v':
				t = (char) 56;
				break;
			case 'w':
			case 'x':
			case 'y':
			case 'z':
				t = (char) 57;
				break;
			}
		}
		return t;
	}

}
