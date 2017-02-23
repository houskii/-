package 面试真题;

import java.util.Scanner;

/**
 * Created by Houskii on 17/2/19.
 * 链接：https://www.nowcoder.com/question/next?pid=3701760&qid=58540&tid=6615368
 来源：牛客网

 给定一个十进制数M，以及需要转换的进制数N。将十进制数M转化为N进制数
 输入描述:
 输入为一行，M(32位整数)、N(2 ≤ N ≤ 16)，以空格隔开。


 输出描述:
 为每个测试实例输出转换后的数，每个输出占一行。如果N大于9，则对应的数字规则参考16进制（比如，10用A表示，等等）

 输入例子:
 7 2

 输出例子:
 111
 */
public class 进制转换 {
    static final char[] charge = {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};

    public static void main(String[] args){
        while(true){
            Scanner scanner = new Scanner(System.in);
            int num = scanner.nextInt();
            int type = scanner.nextInt();
            System.out.println(adapter(num,type));
        }
    }

    static String adapter(int num,int type){
        if (type>16 ||type<2){
            return "";
        }
        StringBuilder builder = new StringBuilder();
        boolean minus = false;
        if (num<0){
            minus = true;
            num = -num;
        }
        while (num!=0){
            builder.append(charge[num%type]);
            num/=type;
        }
        if (minus){
            builder.append('-');
        }
        builder.reverse();
        return builder.toString();
    }
}
