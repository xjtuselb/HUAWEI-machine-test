package 华为机试题;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

/*
思路：
输入砝码种类n;
 输入砝码质量w[i];
 输入砝码个数c[i]；
 输出  可以拼凑的质量个数
 w1  w2  w3  w4  ......  wn
 c1  c2  c3  c4  ......  cn
对于前i个砝码：
（不同质量为Q[i])则 Q[i]=Q[i-1]+k*w[i]; -->0<=k<=c[i];   
    Q[i]在Q[i-1]的基础上，对Q[i-1]个不同的重量，分别添加k个砝码i;
    在添加的过程中去除重复情况
    c[i]表示N个不同砝码相应的数量  c[1~~n];
 则（结果）:Q[i]=(Q[i-1]+k*w[i])--(减去)添加过程中重复的个数
*/

public class 砝码组合1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			int n = sc.nextInt();// 砝码种类
			int[] weights = new int[n];
			int[] numbers = new int[n];
			for (int i = 0; i < n; i++)
				weights[i] = sc.nextInt();
			for (int i = 0; i < n; i++)
				numbers[i] = sc.nextInt();
			int result = function(n, weights, numbers);
			System.out.println(result);
		}
		sc.close();
	}

	public static int function(int n, int[] weights, int[] numbers) {
		Set<Integer> set = new HashSet<Integer>();

		// 第一种砝码是0到最大个数遍历，记录第一种砝码组合的重量
		for (int i = 0; i <= numbers[0]; i++)
			set.add(i * weights[0]);

		// 从第二个砝码开始，第i种砝码
		for (int i = 1; i < n; i++) {
			// 每次遍历一种砝码，就把set转化成list
			List<Integer> list = new ArrayList<Integer>(set);
			// 遍历第i种砝码的个数j，第i种砝码使用1个到使用总个数numbers[i]
			for (int j = 1; j <= numbers[i]; j++)
				// 遍历前面i-1种砝码产生的所有合法的重量
				for (int k = 0; k < list.size(); k++)
					// 直到前一种砝码产生的合法全部重量+第i种砝码的所有可能的重量
					set.add(list.get(k) + j * weights[i]);
		}

		return set.size();
	}
}