package 华为机试题;

import java.util.Scanner;

public class 合并表记录1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			int n = Integer.parseInt(sc.nextLine());
			int[] k = new int[n];
			int[] v = new int[n];
			for (int i = 0; i < n; i++) {
				String[] temp = sc.nextLine().split(" ");
				k[i] = Integer.parseInt(temp[0]);
				v[i] = Integer.parseInt(temp[1]);
			}
			mergeTable(k, v);
		}
		sc.close();
	}

	public static void mergeTable(int[] k, int[] v) {

		for (int i = 0; i < k.length; i++) {
			for (int j = i + 1; j < v.length; j++) {
				if (k[i] == k[j] && k[i] != Integer.MIN_VALUE) {
					// 废除后面的索引
					k[j] = Integer.MIN_VALUE;
					// 合并后面的值
					v[i] = v[i] + v[j];
					// 废除后面的值
					v[j] = Integer.MIN_VALUE;
				}
			}
		}

		int tem1 = 0;
		int tem2 = 0;
		for (int i = 0; i < k.length - 1; i++) {
			for (int j = i + 1; j < k.length; j++) {
				if ((k[i] > k[j]) && (k[i] != Integer.MIN_VALUE) && (k[j] != Integer.MIN_VALUE)) {
					// 交换键
					tem1 = k[i];
					k[i] = k[j];
					k[j] = tem1;
					// 交换值
					tem2 = v[i];
					v[i] = v[j];
					v[j] = tem2;
				}
			}
		}

		for (int i = 0; i < k.length; i++) {
			if (k[i] != Integer.MIN_VALUE)
				System.out.println(k[i] + " " + v[i]);
		}

	}

}
