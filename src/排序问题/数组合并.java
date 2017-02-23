package 排序问题;

/**
 * Created by Houskii on 17/2/5.
 * 有两个从小到大排序以后的数组A和B，其中A的末端有足够的缓冲空容纳B。请编写一个方法，将B合并入A并排序。
 * 给定两个有序int数组A和B，A中的缓冲空用0填充，同时给定A和B的真实大小int n和int m，请返回合并后的数组。
 */
public class 数组合并 {
    public int[] mergeAB(int[] A, int[] B, int n, int m) {
        // write code here
        int ap = n-1;
        int bp = m-1;
        int cp = A.length-1;
        int an ;
        int bn ;
        while(cp>0){
            an = ap>=0?A[ap]:Integer.MIN_VALUE;
            bn = bp>=0?B[bp]:Integer.MIN_VALUE;
            if (ap>=0&&an >=bn){
                A[cp] = an;
                ap--;
            }else if (bp>=0 &&bn>=an){
                A[cp] = bn;
                bp--;
            }
            cp--;
        }
        A[cp] = ap==0? A[ap]:B[bp];
        return A;
    }
}
