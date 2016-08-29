package 华为机试题;

import java.util.HashSet;

public class HashSet测试 {

	// [a, b, t]
	public static void main(String[] args) {
		HashSet<String> hs = new HashSet<>();
		hs.add("a");
		hs.add("b");
		hs.add("a");
		hs.add("b");
		hs.add("t");
		hs.add("a");

		System.out.println(hs);
	}

}
