package 排序问题;

import java.util.ArrayList;

/**
 * Created by Houskii on 17/3/12.
 * 输入n个整数，找出其中最小的K个数。
 * 例如输入4,5,1,6,2,7,3,8这8个数字，则最小的4个数字是1,2,3,4,。
 */
public class 最小的K个数 {
    public ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {
        if(input==null||k<=0||input.length<k){
            return new ArrayList<Integer>();
        }
        return heapSort(input,k);

    }

    ArrayList<Integer> heapSort(int[] array, int k){
        int[] res = new int[k];
        for(int i = 0;i<k;i++){
            res[i] = array[i];
        }

        for(int i = 0;i<k/2;i++){
            heapAdjust(res,i,k);
        }

        for(int i = k;i<array.length;i++){
            if(array[i]<res[0]){
                res[0] = array[i];
                heapAdjust(res,0,k);
            }
        }
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0;i<k;i++){
            list.add(res[i]);
        }
        return list;
    }

    void heapAdjust(int[] array,int root,int tail){
        int father = 0;
        int child = 0;
        int size = tail;
        if(size<=1){
            return;
        }
        for(father = array[root];getLeftChild(root)< size; root = child){
            child = getLeftChild(child);
            if(child+1<size &&array[child]<array[child+1]){
                child++;
            }
            if(father<array[child]){
                array[root] = array[child];
            }else{
                break;
            }
        }
        array[root] = father;
    }


    int getLeftChild(int root){
        return root*2+1;
    }
}
