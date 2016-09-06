package 华为机试题;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * 这个程序有死循环现象存在，就是题目中的循环记录的意思
 * 
 * @author hest0
 *
 */
public class 错误记录功能模块 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Map<String, Integer> lhs = new LinkedHashMap<String, Integer>();

		while (sc.hasNext()) {
			String road = sc.next();
			String line = sc.next();

			String[] arr = road.split("\\\\");
			String s = arr[arr.length - 1];

			if (s.length() > 16)
				s = s.substring(s.length() - 16);

			String key = s + " " + line;
			int value = 1;

			if (lhs.containsKey(key))
				lhs.put(key, lhs.get(key) + 1);
			else
				lhs.put(key, value);
		}

		int count = 0;
		for (String k : lhs.keySet()) {
			count++;
			if (count > lhs.keySet().size() - 8) {
				System.out.println(k + " " + lhs.get(k));
			}

		}

		sc.close();

	}

}
