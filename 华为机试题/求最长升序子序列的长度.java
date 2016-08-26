package 华为机试题;

import java.util.Scanner;

/**
 * 属于动态规划问题
 * 
 * @author hest0
 *
 */
public class 求最长升序子序列的长度 {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNext()) {
			/**
			 * 下面步骤：完成数据的输入
			 */
			int n = Integer.parseInt(scanner.nextLine());
			int array[] = new int[n];
			String temp[] = scanner.nextLine().split(" ");
			for (int i = 0; i < n; i++) {
				array[i] = Integer.parseInt(temp[i]);
			}

			/**
			 * 创建状态二位数组，记录任意升序子序列的长度，创建最大值变量
			 */
			int record[][] = new int[n][n], max = 0;

			/**
			 * 填表法：填任意升序子序列的长度，并记录最大长度，上三角遍历法
			 */
			// 外层循环按行遍历：变量是行标
			for (int i = 0; i < n; i++) {
				// 内层循环按列遍历：变量是列表
				for (int j = i; j < n; j++) {

					/**
					 * 状态record[i][j](i=j)-->record[i][index](i<=index<j)
					 * -->tem(符合要求已有状态中的最大值)-->record[i][j](最后一个未填写)
					 */

					// 第一步：对角元素=1
					if (i == j) {
						record[i][j] = 1;
					}

					// 第二步：找满足序列规律，找前面最大状态，填写当前状态(升序子序列的长度)
					if (array[i] < array[j]) {

						// i<=index<j,tem是状态的最大值
						int index = i, tem = 0;

						// i<=index<j范围内找满足条件的最大状态tem
						while (index < j) {
							// 满足的条件是:头<=遍历值<尾
							if (array[i] <= array[index] && array[index] < array[j]) {
								// 得到以后的状态中的最大值tem
								tem = Math.max(tem, record[i][index]);
							}
							index++;
						}

						// 终极目标：把这一行中前面累计的状态+1赋值当前空白
						record[i][j] = tem + 1;
						// 把当前的记录复制到最大值
						max = Math.max(max, record[i][j]);
					}

				}
			}

			/**
			 * 循环结束，打印最大子序列的长度
			 */
			System.out.println(max);
		}
		scanner.close();
	}
}