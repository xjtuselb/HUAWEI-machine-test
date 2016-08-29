package 华为机试题;

import java.util.Map.Entry;
import java.util.Scanner;
import java.util.TreeMap;

public class 合并表记录2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			int n = Integer.parseInt(sc.nextLine());
			TreeMap<Integer, Integer> tm = new TreeMap<>();
			for (int i = 0; i < n; i++) {
				String[] as = sc.nextLine().split("\\s+");
				addPare(tm, Integer.parseInt(as[0]), Integer.parseInt(as[1]));
			}
			System.out.println(mapToString(tm));
		}
		sc.close();
	}

	public static String mapToString(TreeMap<Integer, Integer> tm) {

		StringBuilder sb = new StringBuilder();
		for (Entry<Integer, Integer> x : tm.entrySet()) {
			sb.append(x.getKey()).append(" ").append(x.getValue()).append("\r");
		}

		return sb.toString();
	}

	private static void addPare(TreeMap<Integer, Integer> tm, int k, int v) {
		if (tm.containsKey(k)) {
			tm.put(k, tm.get(k) + v);
		} else {
			tm.put(k, v);
		}
	}

}
