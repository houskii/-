package 排序问题;

/**
 * Created by Houskii on 17/2/5.
 *
 *
 * 请设计一个高效算法，判断数组中是否有重复值。必须保证额外空间复杂度为O(1)。
 * 给定一个int数组A及它的大小n，请返回它是否有重复值。
 * 测试样例：
 * [1,2,3,4,5,5,6],7
 * 返回：true
 */
public class 重复值判断 {
    public boolean checkDuplicate(int []a) {
        int n = a.length;
        for(int i = n/2;i>=0;i--){
            headSortMax(a,i,n-1);
        }
        for(int i=n-1;i>=0;i--){
            swap(a,0,i);
            headSortMax(a,0,i);
        }
        int index = a[0];
        for(int i=1;i<n;i++){
            if(a[i]==index){
                return true;
            }
            index = a[i];
        }
        return false;
        // write code here
    }

    public void headSortMax(int []a,int root,int length){
        int child= 0,father = 0;
        int max = length-1;
        for(father = a[root] ;getLeftChild(root) < length ; root = child){
            child = getLeftChild(root);
            if(child < max && a[child] < a[child+1]){
                child++;
            }
            if(father < a[child]){
                a[root] = a[child];
            }else{
                break;
            }
        }
        a[root] = father;
    }


    public void swap(int[]a,int index1,int index2){
        int tmp = a[index1];
        a[index1] = a[index2];
        a[index2] = tmp;
    }

    public int getLeftChild(int root){
        return root*2+1;
    }
}
