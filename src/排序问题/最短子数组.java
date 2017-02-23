package 排序问题;

/**
 * Created by Houskii on 17/2/6.
 * 对于一个数组，请设计一个高效算法计算需要排序的最短子数组的长度。
 * 给定一个int数组A和数组的大小n，请返回一个二元组，代表所求序列的长度。(原序列位置从0开始标号,若原序列有序，返回0)。保证A中元素均为正整数。
 * 测试样例：
 * [1,4,6,5,9,10],6
 * 返回：2
 */
public class 最短子数组 {
    public int shortestSubsequence(int[] A, int n) {
        // write code here
        int p = 0,q = A.length-1;
        int tmp = Integer.MIN_VALUE;
        for (int i=0;i<A.length;i++){
            if (tmp>A[i]){
                p = i;
            }else {
                tmp = A[i];
            }
        }

        tmp = Integer.MAX_VALUE;

        for (int i= A.length-1;i>=0;i--){
            if (tmp<A[i]){
                q = i;
            }else {
                tmp = A[i];
            }
        }
        return p-q>0?p-q+1:0;
    }
}
