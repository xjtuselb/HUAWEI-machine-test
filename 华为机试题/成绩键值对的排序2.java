package 华为机试题;

import java.util.Scanner;

public class 成绩键值对的排序2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			int n = Integer.parseInt(sc.nextLine());
			int flag = Integer.parseInt(sc.nextLine());

			String[] k = new String[n];
			int[] v = new int[n];

			for (int i = 0; i < n; i++) {
				String str = sc.nextLine();
				String[] x = str.split(" ");
				k[i] = x[0];
				v[i] = Integer.parseInt(x[1]);
			}

			if (flag == 0)
				sort10(k, v);
			else {
				sort01(k, v);
			}

			printArr(k, v);
		}

		sc.close();
	}

	public static void sort10(String[] k, int[] v) {
		for (int i = 0; i < v.length - 1; i++) {
			for (int j = v.length - 1; j > i; j--) {
				if (v[j - 1] < v[j]) {
					swapInt(v, j - 1, j);
					swapStr(k, j - 1, j);
				}
			}
		}
	}

	public static void sort01(String[] k, int[] v) {
		for (int i = 0; i < v.length - 1; i++) {
			for (int j = v.length - 1; j > i; j--) {
				if (v[j - 1] > v[j]) {
					swapInt(v, j - 1, j);
					swapStr(k, j - 1, j);
				}
			}
		}
	}

	public static void swapStr(String[] k, int a, int b) {
		String x = "";
		x = k[a];
		k[a] = k[b];
		k[b] = x;
	}

	public static void swapInt(int[] v, int a, int b) {
		int x = 0;
		x = v[a];
		v[a] = v[b];
		v[b] = x;
	}

	public static void printArr(String[] k, int[] v) {
		for (int i = 0; i < v.length - 1; i++) {
			System.out.println(k[i] + " " + v[i]);
		}
		System.out.println(k[v.length - 1] + " " + v[v.length - 1]);
	}

}
