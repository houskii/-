package 面试真题;

import java.util.Scanner;

/**
 * Created by Houskii on 17/2/19.
 * 链接：https://www.nowcoder.com/question/next?pid=3701760&qid=58539&tid=6615368
 来源：牛客网

 输入一个正整数n,求n!(即阶乘)末尾有多少个0？ 比如: n = 10; n! = 3628800,所以答案为2
 输入描述:
 输入为一行，n(1 ≤ n ≤ 1000)


 输出描述:
 输出一个整数,即题目所求

 输入例子:
 10

 输出例子:
 2
 */
public class 末尾0的个数 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        int count_5 = 0;
        int count_2 = 0;

        for (int j = 0;j<=i;j++){
            int tmp = j;
            while (tmp%5==0&&tmp!=0){
                tmp/=5;
                count_5++;
            }
            tmp = j;
            while (tmp%2==0&&tmp!=0){
                tmp/=2;
                count_2++;
            }
        }
        System.out.println(count_5>count_2?count_2:count_5);
    }
}
