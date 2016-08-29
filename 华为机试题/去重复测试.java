package 华为机试题;

public class 去重复测试 {

	// yuz
	public static void main(String[] args) {
		System.out.println(removeDuplication("yuzyu"));
	}

	// 字符串去重
	public static String removeDuplication(String s) {
		String x = "";
		for (int i = 0; i < s.length(); i++)
			if (!x.contains(s.charAt(i) + ""))
				x += s.charAt(i);
		return x;
	}

}
