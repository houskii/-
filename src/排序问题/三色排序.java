package 排序问题;

/**
 * Created by Houskii on 17/2/6.
 * 有一个只由0，1，2三种元素构成的整数数组，请使用交换、原地排序而不是使用计数进行排序.
 * 给定一个只含0，1，2的整数数组A及它的大小，请返回排序后的数组。保证数组大小小于等于500。
 * 测试样例：
 * [0,1,1,0,2,2],6
 * 返回：[0,0,1,1,2,2]
 */
public class 三色排序 {
    public int[] sortThreeColor(int[] A, int n) {
        final int LEFT = 0;
        final int MID = 1;
        final int RIGHT = 2;
        // write code here
        int left= -1;
        int right = n;
        int cur = 0;
        while (cur!=right){
            if (A[cur]==LEFT){
                swap(A,cur,++left);
                if (cur<=left){
                    cur=left+1;
                }
            }else if (A[cur]==RIGHT){
                swap(A,cur,--right);
                if (cur>=right){
                    cur=right-1;
                }
            }else if (A[cur]==MID){
                cur++;
            }
        }
        return A;
    }

    public void swap(int[]a,int from,int to){
        int tmp = a[from];
        a[from] = a[to];
        a[to] = tmp;
    }
}
