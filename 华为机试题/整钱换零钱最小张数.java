package 华为机试题;

public class 整钱换零钱最小张数 {

	public static int minCoins1(int[] arr, int aim) {
		// 不合法检测
		if (arr == null || arr.length == 0 || aim < 0) {
			return -1;
		}

		// 定义数组长度和最大值
		int n = arr.length;
		int max = Integer.MAX_VALUE;

		// 为什么dp的列长度是aim+1列呢？
		// dp[i][j]的意思是：arr[0]到arr[i]这么多的零钱，j是整钱，找零张数最少
		// i的范围[0,n-1]
		// j的范围[1,aim],那么aim=0是做什么的？
		// 因为题目中说了j整钱可以是0
		int[][] dp = new int[n][aim + 1];

		// 这个循环目标是：填充dp[0][j]，第一行
		// 这个循环：只使用arr[0]的零钱，整钱为j，找零
		// 注意i的步长是增1，j增加的步长是arr[i];
		// 这个循环：i=0;j-arr[0]表示未使用arr[0]本次找零，即上次的整钱的状态
		// dp[0][j - arr[0]]表示只使用arr[0]的零钱，未使用arr[0]本次找零，这时找零张数的最小值
		for (int j = 1; j <= aim; j++) {
			dp[0][j] = max;
			if (j - arr[0] >= 0 && dp[0][j - arr[0]] != max) {
				dp[0][j] = dp[0][j - arr[0]] + 1;
			}
		}

		// 采用填表法填表，一行一行型遍历
		// left就是dp[][]的一个中间变量
		// 最终取本次状态和上次的状态的最小值，所以中间取最大值初始化
		// dp[i][j - arr[i]] + 1本次的零钱数，上次的整钱；本次零钱数比上次零钱数大1
		// dp[i - 1][j]上次的零钱数，本次的整钱
		int left = 0;
		for (int i = 1; i < n; i++) {
			for (int j = 1; j <= aim; j++) {
				left = max;
				if (j - arr[i] >= 0 && dp[i][j - arr[i]] != max) {
					left = dp[i][j - arr[i]] + 1;
				}

				dp[i][j] = Math.min(left, dp[i - 1][j]);
			}
		}

		return dp[n - 1][aim] != max ? dp[n - 1][aim] : -1;
	}

	public static int minCoins2(int[] arr, int aim) {
		// 不合法检测
		if (arr == null || arr.length == 0 || aim < 0) {
			return -1;
		}

		// 赋值
		int n = arr.length;
		int max = Integer.MAX_VALUE;

		// 状态：我们只关心整钱的变化，不关心零钱数的变化
		int[] dp = new int[aim + 1];

		// 本次循环的目的：全部使用arr[0]零钱去凑j,的状态dp[j]
		// 本次循环：i=0;j是本次的整钱，比上次整钱多了arr[0]
		for (int j = 1; j <= aim; j++) {
			dp[j] = max;
			if (j - arr[0] >= 0 && dp[j - arr[0]] != max) {
				dp[j] = dp[j - arr[0]] + 1;
			}
		}

		int left = 0;

		// 依次加入零钱arr[i],零钱编号i
		// 每次加入零钱，遍历1到aim的整钱
		// j - arr[i] >= 0表示加入本次零钱，还没有超过整钱数
		for (int i = 1; i < n; i++) {
			for (int j = 1; j <= aim; j++) {
				left = max;
				if (j - arr[i] >= 0 && dp[j - arr[i]] != max) {
					left = dp[j - arr[i]] + 1;
				}
				dp[j] = Math.min(left, dp[j]);
			}
		}

		return dp[aim] != max ? dp[aim] : -1;
	}

	public static void main(String[] args) {
		int[] arr1 = { 100, 20, 5, 10, 2, 50, 1 };
		int aim1 = 17019;
		System.out.println(minCoins1(arr1, aim1));
		System.out.println(minCoins2(arr1, aim1));
	}
}
