package 华为机试题;

import java.util.ArrayList;
import java.util.Arrays;

public class 常见的工具箱 {

	public static void main(String[] args) {

	}

	/**
	 * 把输入" "字符串转化成整型数组
	 * 
	 * @param s
	 * @return
	 */
	public static int[] stringToArray(String s) {
		String[] x = s.split(" ");
		int[] a = new int[x.length];
		for (int i = 0; i < x.length; i++) {
			a[i] = Integer.parseInt(x[i]);
		}
		return a;
	}

	/**
	 * 数组排序
	 * 
	 * @param array
	 */
	public static void sortArray(int[] array) {
		Arrays.sort(array);
	}

	/**
	 * 把整型对象数组装化成整型数组
	 * 
	 * @param integerArray
	 * @return
	 */
	public static int[] integerArrayToIntArray(Integer[] integerArray) {
		int[] intArray = new int[integerArray.length];
		for (int i = 0; i < integerArray.length; i++) {
			intArray[i] = integerArray[i].intValue();
		}
		return intArray;
	}

	/**
	 * 数组去掉重复的值，或者是用hashSet
	 * 
	 * @param array
	 * @return
	 */
	public static int[] deleteDuplicateValues(int[] array) {
		ArrayList<Integer> al = new ArrayList<>();
		for (int i = 0; i < array.length; i++) {
			if (!al.contains(array[i]))
				al.add(array[i]);
		}

		int[] ret = new int[al.size()];
		for (int i = 0; i < al.size(); i++) {
			ret[i] = al.get(i).intValue();
		}

		return ret;
	}

	/**
	 * 得到数组当前序号右边的子数组
	 * 
	 * @param array
	 * @param index
	 * @return
	 */
	public static int[] getRightSubArray(int[] array, int index) {
		int[] x = new int[array.length - index];
		System.arraycopy(array, index, x, 0, array.length - index);
		return x;
	}

	/**
	 * 找到数组的最大值
	 * 
	 * @param array
	 * @return
	 */
	public static int getMaxOfArray(int[] array) {
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < array.length; i++) {
			if (array[i] >= max)
				max = array[i];
		}
		return max;
	}

	/**
	 * 打印二维数组
	 * 
	 * @param a
	 */
	public static void print2DArray(int[][] a) {
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length - 1; j++) {
				System.out.print(a[i][j] + "\t");
			}
			System.out.print(a[i][a[i].length - 1]);
			System.out.println();
		}
	}

	/**
	 * 判断是不是素数
	 * 
	 * @param n
	 * @return
	 */
	public static boolean isPrime(int n) {
		if (n <= 3)
			return true;
		else {
			for (int i = 2; i <= Math.sqrt(n); i++) {
				if (n % i == 0)
					return false;
			}
		}
		return true;
	}

}
