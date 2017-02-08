package 排序问题;

/**
 * Created by Houskii on 17/2/4.
 */
public class 快速排序 {
    public int[] quickSort(int a[]){
        partition(a,0,a.length-1);
        return a;
    }

    void partition(int a[],int start,int end){
        int length = end -start+1;
        if (length<1||start<0){ //范围判断
            return;
        }
        int guardian = a[start];
        int i = start,j = end;
        while (i!=j){
            while (i<j && a[j]>=guardian){
                j--;
            }
            a[i] = a[j];
            while (i<j && a[i]<= guardian){ //注意是i<j不是<=
                i++;
            }
            a[j] = a[i];
        }
        a[i] = guardian;
        partition(a,start,i-1); //注意这里是i-1
        partition(a,i+1,end);   //注意这里是i+1
    }
}
