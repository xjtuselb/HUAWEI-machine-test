package 华为机试题;

import java.util.Scanner;
import java.util.TreeSet;

public class 数组合并排序 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			int n1 = sc.nextInt();
			int[] a = new int[n1];
			for (int i = 0; i < n1; i++) {
				a[i] = sc.nextInt();
			}
			int n2 = sc.nextInt();
			int[] b = new int[n2];
			for (int i = 0; i < n2; i++) {
				b[i] = sc.nextInt();
			}

			System.out.println(mergeArray(a, b));
		}
		sc.close();
	}

	public static String mergeArray(int[] a, int[] b) {
		String s = "";

		TreeSet<Integer> ts = new TreeSet<>();
		for (int i = 0; i < a.length; i++) {
			ts.add(a[i]);
		}
		for (int j = 0; j < b.length; j++) {
			ts.add(b[j]);
		}
		
		Integer[] intArray = ts.toArray(new Integer[ts.size()]);
		
		for (int i = 0; i < intArray.length; i++) {
			s += intArray[i].intValue();
		}
		return s;
	}

}
