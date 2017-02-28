package 字符串问题;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

/**
 * Created by Houskii on 17/2/23.
 * 链接：https://www.nowcoder.com/courses/1/3/8
 * 来源：牛客网
 * 对于一个给定的字符串数组，请找到一种拼接顺序，
 * 使所有小字符串拼接成的大字符串是所有可能的拼接中字典序最小的。
 * 给定一个字符串数组strs，同时给定它的大小，请返回拼接成的串。
 * 测试样例：
 * ["abc","de"],2
 * "abcde"
 */
public class 拼接最小字典序 {
    public String findSmallest(String[] strs, int n) {
        // write code here;
        if (strs==null||n==0){
            return "";
        }
        Arrays.sort(strs,new Comparator<String>(){
            @Override
            public int compare(String s1,String s2){
                return (s1+s2).compareTo(s2+s1);
            }
        });

        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < n; i++) {
            builder.append(strs[i]);
        }
        return builder.toString();

    }
}
