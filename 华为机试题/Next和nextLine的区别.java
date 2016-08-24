package 华为机试题;

import java.util.Scanner;

public class Next和nextLine的区别 {

	public static void main(String[] args) {
		f3();
	}

	// a
	// b
	// b a
	public static void f1() {
		Scanner sc = new Scanner(System.in);
		String b = sc.nextLine();
		String a = sc.next();
		System.out.println(a + " " + b);
		sc.close();
	}

	// a
	// a
	public static void f2() {
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		String b = sc.nextLine();
		System.out.println(a + " " + b);
		sc.close();
	}
	
	// a
	// b
	// a b
	public static void f3() {
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		sc.nextLine();
		String b = sc.nextLine();
		System.out.println(a + " " + b);
		sc.close();
	}

}
