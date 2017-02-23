package 面试真题;

import java.util.Scanner;

/**
 * Created by Houskii on 17/2/19.
 * 链接：https://www.nowcoder.com/test/question/5a304c109a544aef9b583dce23f5f5db?pid=3701760&tid=6615368
 来源：牛客网

 一个数组有 N 个元素，求连续子数组的最大和。 例如：[-1,2,1]，和最大的连续子数组为[2,1]，其和为 3
 输入描述:
 输入为两行。
 第一行一个整数n(1 <= n <= 100000)，表示一共有n个元素
 第二行为n个数，即每个元素,每个整数都在32位int范围内。以空格分隔。


 输出描述:
 所有连续子数组中和最大的值。

 输入例子:
 3
 -1 2 1

 输出例子:
 3
 */
public class 连续最大和 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int[] input = new int[size];
        for(int i = 0;i<size;i++){
            input[i] = scan.nextInt();
        }

        int currentMax = Integer.MIN_VALUE;//这里要使用最小值,避免全负的数组
        int currentSum = 0;
        for (int i = 0; i < input.length; i++) {
            currentSum+=input[i];
            if (currentMax<currentSum){
                currentMax = currentSum;
            }
            if (currentSum<0){
                currentSum = 0;
            }
        }
        System.out.println(currentMax);
    }
}
