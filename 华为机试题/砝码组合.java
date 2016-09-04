package 华为机试题;

import java.util.Arrays;
import java.util.Scanner;

public class 砝码组合 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			int n = sc.nextInt();
			int[] weight = new int[n];
			int[] nums = new int[n];
			for (int i = 0; i < n; i++)
				weight[i] = sc.nextInt();
			for (int i = 0; i < n; i++)
				nums[i] = sc.nextInt();
			System.out.println(function(n, weight, nums));
		}
		sc.close();
	}

	public static int function(int n, int[] weight, int[] nums) {
		// 不合法检测
		if (n <= 0 || weight == null || weight.length <= 0 || nums == null || nums.length <= 0)
			return 0;
		// 总重量
		int totalWeight = 0;
		// 计算最大重量
		for (int i = 0; i < n; i++) {
			totalWeight += nums[i] * weight[i];
		}
		// 最大重量个数的状态标识，boolean数组的初始化都是false，状态标识的下表是重量
		boolean[] flag = new boolean[totalWeight + 1];
		flag[totalWeight] = true;
		flag[0] = true;
		// i是种类
		// nums[i]该种类下的个数,每次增加一个
		// weight[i]该种类下的重量
		// k表示当前种类i下，一个到总重量的范围
		// k-weight[i]是当前总重-当前加入的种类的重量，考察前面是不是有增加之前的总重量
		for (int i = 0; i < n; i++)
			for (int j = 1; j <= nums[i]; j++)
				for (int k = totalWeight; k >= weight[i]; k--)
					if (flag[k - weight[i]])
						flag[k] = true;
		System.out.println(Arrays.toString(flag));
		System.out.println(flag.length);
		// 计算出状态数组里面true的个数
		int count = 0;
		for (int i = 0; i <= totalWeight; i++) {
			if (flag[i])
				count++;
		}
		// 返回可以放入数值的个数
		return count;
	}
}
