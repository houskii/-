package 面试真题;

import java.util.Scanner;

/**
 * Created by Houskii on 17/2/28.
 * 链接：https://www.nowcoder.com/question/next?pid=1649301&qid=44699&tid=6757862
 来源：牛客网
 你作为一名出道的歌手终于要出自己的第一份专辑了，你计划收录 n 首歌而且每首歌的长度都是 s 秒，
 每首歌必须完整地收录于一张 CD当中。每张 CD 的容量长度都是 L 秒，
 而且你至少得保证同一张 CD 内相邻两首歌中间至少要隔 1 秒。
 为了辟邪，你决定任意一张 CD内的歌数不能被 13 这个数字整除，
 那么请问你出这张专辑至少需要多少张 CD ？

 输入描述:
 每组测试用例仅包含一组数据，每组数据第一行为三个正整数 n, s, L。
 保证 n ≤ 100 , s ≤ L ≤ 10000


 输出描述:
 输出一个整数代表你至少需要的 CD 数量。

 输入例子:
 7 2 6

 输出例子:
 4

 */
public class 出专辑 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int s = scanner.nextInt();
        int L = scanner.nextInt();
        int x = (L+1)/(s+1);
//        x = n<x? n:x;
        if(x%13==0){
            x-=1;
        }

        int c =0;

        while(n!=0){
            c++;
            if (n>x){
                n-=x;
            }else {
                if(n%13==0 && (c==1||x-n<2) ){
                    n-=(n-1);
                }else {
                    n-=n;
                }
            }
        }
        System.out.println(c);
    }
}
