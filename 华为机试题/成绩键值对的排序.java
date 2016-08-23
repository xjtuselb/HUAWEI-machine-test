package 华为机试题;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.TreeMap;

public class 成绩键值对的排序 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			int n = Integer.parseInt(sc.nextLine());
			int flag = Integer.parseInt(sc.nextLine());

			HashMap<Object, Object> hm = new HashMap<>();
			TreeMap<Object, Object> tm;

			for (int i = 0; i < n; i++) {
				String str = sc.nextLine();
				String[] x = str.split(" ");
				hm.put(x[0], x[1]);
			}

			if (flag == 0) {
				tm = hashMapToReverseTreeMap(hm);
			} else {
				tm = hashMapToTreeMap(hm);
			}

			printMap(tm);
		}

		sc.close();

	}

	public static TreeMap<Object, Object> hashMapToTreeMap(HashMap<Object, Object> hm) {
		TreeMap<Object, Object> tm = new TreeMap<>();

		Iterator<Entry<Object, Object>> it = hm.entrySet().iterator();
		while (it.hasNext()) {
			Entry<Object, Object> e = it.next();
			tm.put(e.getValue(), e.getKey());
		}

		return tm;
	}

	public static TreeMap<Object, Object> hashMapToReverseTreeMap(HashMap<Object, Object> hm) {
		TreeMap<Object, Object> tm = new TreeMap<>(Collections.reverseOrder());

		Iterator<Entry<Object, Object>> it = hm.entrySet().iterator();
		while (it.hasNext()) {
			Entry<Object, Object> e = it.next();
			tm.put(e.getValue(), e.getKey());
		}

		return tm;
	}

	public static void printMap(TreeMap<Object, Object> tm) {
		Iterator<Entry<Object, Object>> it = tm.entrySet().iterator();
		while (it.hasNext()) {
			Entry<Object, Object> e = it.next();
			System.out.println(e.getValue() + " " + e.getKey());
		}
	}

}
