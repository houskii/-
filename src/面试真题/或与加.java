//package 面试真题;
//
//import java.math.BigInteger;
//import java.util.Scanner;
//
///**
// * Created by Houskii on 17/2/28.
// * 链接：https://www.nowcoder.com/question/next?pid=1649301&qid=44701&tid=6757862
// * 来源：牛客网
// 给定 x, k ，求满足 x + y = x | y 的第 k 小的正整数 y 。
// | 是二进制的或(or)运算，例如 3 | 5 =7。
// 比如当 x=5，k=1时返回 2，因为5+1=6 不等于 5|1=5，而 5+2=7 等于 5 | 2 = 7。
//
// 输入描述:
// 每组测试用例仅包含一组数据，每组数据为两个正整数 x , k。 满足 0 < x , k ≤ 2,000,000,000。
//
//
// 输出描述:
// 输出一个数y。
//
// 输入例子:
// 5 1
//
// 输出例子:
// 2
// */
//public class 或与加 {
//    public static void main(String[] args){
//        Scanner scanner = new Scanner(System.in);
//        int x = scanner.nextInt();
//        int y = scanner.nextInt();
//        int a = ~x;
//        int b = y;
//        int c = x^y;
//
////        while(true){
////            if (0==(x&b)){
////                break;
////            }
////        }
//        System.out.println(a);
//        System.out.println(c);
//        System.out.println(b);
//    }
//}
