package 测试代码;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class 数组测试 {

	@SuppressWarnings("unused")
	public static void main(String[] args) {

		/**
		 * 定义一个Java数组
		 */
		String[] aArray = new String[5];
		String[] bArray = { "a", "b", "c", "d", "e" };
		String[] cArray = new String[] { "a", "b", "c", "d", "e" };

		/**
		 * 打印Java数组中的元素
		 */
		int[] intArray = { 1, 2, 3, 4, 5 };
		String intArrayString = Arrays.toString(intArray);

		// print directly will print reference value
		System.out.println(intArray);
		// [I@7150bd4d

		System.out.println(intArrayString);
		// [1, 2, 3, 4, 5]

		/**
		 * 从Array中创建ArrayList
		 */
		String[] stringArray = { "a", "b", "c", "d", "e" };
		ArrayList<String> arrayList = new ArrayList<String>(Arrays.asList(stringArray));
		System.out.println(arrayList);
		// [a, b, c, d, e]

		/**
		 * 检查数组中是否包含某一个值
		 */
		String[] stringArray1 = { "a", "b", "c", "d", "e" };
		boolean b = Arrays.asList(stringArray1).contains("a");
		System.out.println(b);
		// true

		/**
		 * 将Array转化成Set集合
		 */
		Set<String> set = new HashSet<String>(Arrays.asList(stringArray));
		System.out.println(set);
		// [d, e, b, c, a]
		
		/**
		 * 将ArrayList转化成Array
		 */
		List<String> list = new ArrayList<String>();
		list.add("a");
		list.add("b");
		list.add("c");
		String[] array = new String[list.size()];
		list.toArray(array);
		for (String s : array)
			System.out.println(s);

		/**
		 * 数组的拷贝
		 */
		int[] src = { 1, 3, 5, 6, 7, 8 };
		int[] dest = new int[6];
		System.arraycopy(src, 0, dest, 0, 6);

		/**
		 * 增强型for循环遍历数组
		 */
		for (String i : aArray) {
			System.out.println(i);
		}

	}

}
