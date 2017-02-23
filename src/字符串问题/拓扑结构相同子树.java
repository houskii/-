package 字符串问题;

import bean.TreeNode;
import javafx.beans.binding.StringBinding;

import java.util.LinkedList;

/**
 * Created by Houskii on 17/2/8.
 * 对于两棵彼此独立的二叉树A和B，请编写一个高效算法，检查A中是否存在一棵子树与B树的拓扑结构完全相同。
 * 给定两棵二叉树的头结点A和B，请返回一个bool值，代表A中是否存在一棵同构于B的子树。
 */
public class 拓扑结构相同子树 {
    public boolean chkIdentical(TreeNode A, TreeNode B) {
        LinkedList<Integer> list1=  new LinkedList<>();
        LinkedList<Integer> list2 = new LinkedList<>();
        traversalTree(A,list1);
        traversalTree(B,list2);
        StringBuilder builder1 = new StringBuilder();
        for (int i:list1){
            builder1.append(i);
        }
        String str1 = builder1.toString();


        StringBuilder builder2 = new StringBuilder();
        for (int i:list1){
            builder2.append(i);
        }
        String str2 = builder2.toString();

        // write code here
        return sunday(list1,list2);
    }

    void traversalTree(TreeNode t,LinkedList<Integer> list){
        if (t!=null){
            list.add(t.val);
            traversalTree(t.left,list);
            traversalTree(t.right,list);
        }
    }

    boolean sunday(LinkedList<Integer> list1,LinkedList<Integer> list2){
        int tSize = list1.size();
        int pSize = list2.size();
        final int SIZE = 10;
        int[] move = new int[SIZE];
        for (int i = 0;i<SIZE-1;i++){
            move[i] = pSize;
        }

        for (int i = 0;i<pSize;i++){
            move[list2.get(i)] = pSize-i;
        }

        int s = 0;
        int j;
        while(s<=tSize-pSize){
            j = 0;
            while(list1.get(s+j)==list2.get(j)){
                j++;
                if (j>=pSize){
                    return true;
                }
            }
            s+= move[list1.get(s+pSize)];
        }
        return false;
    }

}
