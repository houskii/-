package 排序问题;

/**
 * Created by Houskii on 17/2/6.
 */
public class 三色问题 {
    public int[] sortThreeColor(int[] A, int n) {
        final int LEFT = 0;
        final int MID = 1;
        final int RIGHT = 2;
        // write code here
        int i= -1;
        int j = n;
        int k = 0;
        while (k!=j){
            if (A[k]==LEFT){
                swap(A,k,++i);
                if (k<=i){
                    k=i+1;
                }
            }else if (A[k]==RIGHT){
                swap(A,k,--j);
                if (k>=j){
                    k=j-1;
                }
            }else if (A[k]==MID){
                k++;
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
