package 排序问题;


/**
 * Created by Houskii on 17/2/4.
 */
public class 堆排序 {
    public int[] heapSort(int []a){
        for (int i = a.length/2;i>=0;i--){
            headAdjustMax(a,i,a.length);
        }
        for (int i= a.length-1;i>0;i--){
            swap(a,0,i);
            headAdjustMax(a,0,i);
            for (int c:a){
                System.out.print(c+" ");
            }
        }
        return a;
    }


    //大顶堆,最大值在上
    void headAdjustMax(int[] a,int root,int l){
        int child = 0;
        int father = 0;
        int size = l;
        int max = size-1;

        if (size<1||root>size-1){
            return;
        }

        for (father = a[root];getLeftChild(root)<size;root = child){ //重要!
            child = getLeftChild(root);
            //child指向左右子树中更大的值
            if (child < max && a[child]<a[child+1]){ //child <max !!
                child +=1;
            }

            if (father < a[child]){
                a[root] = a[child];
            }else {
                break;
            }
        }
        a[root] = father;
    }



    //小顶堆,最小值在上
    void headAdjustMin(int[] a,int root,int l ){
        int size =l;
        int max = size-1;
        int child = 0;
        int father = 0;
        if (max<0||root>=size){
            return;
        }
        for (father = a[root];getLeftChild(root)<size;root = child){
            child = getLeftChild(root);
            //child指向左右子树最小的
            if (child <max && a[child] > a[child+1]){
                child ++;
            }
            if (father>a[child]){
                a[root] = a[child];
            }else {
                break;
            }
        }
        a[root] = father;
    }

    void swap(int[]a,int index1,int index2){
        int tmp = a[index1];
        a[index1] = a[index2];
        a[index2] = tmp;
    }


    int getLeftChild(int root){
        return root*2+1;
    }

    int getRightChild(int root){
        return root*2+2;
    }
}
