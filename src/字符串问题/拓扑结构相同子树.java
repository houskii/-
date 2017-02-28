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
        StringBuilder builder1 = new StringBuilder();
        StringBuilder builder2 = new StringBuilder();
        traversalTree(A,builder1);
        traversalTree(B,builder2);

        // write code here
        return sunday(builder1.toString(),builder2.toString());
    }

    void traversalTree(TreeNode t,StringBuilder builder){
        if (t!=null){
            builder.append(t.val+"!");
            traversalTree(t.left,builder);
            traversalTree(t.right,builder);
        }else {
            builder.append("#!");
        }
    }

    boolean sunday(String string1,String string2){
        int tSize = string1.length();
        int pSize = string2.length();
        final int SIZE = 150;
        int[] move = new int[SIZE];
        for (int i = 0;i<SIZE-1;i++){
            move[i] = pSize;
        }

        for (int i = 0;i<pSize;i++){
            move[string2.charAt(i)] = pSize-i;
        }

        int s = 0;
        int j;
        while(s<=tSize-pSize){
            j = 0;
            while(string1.charAt(s+j)==string2.charAt(j)){
                j++;
                if (j>=pSize){
                    return true;
                }
            }
            if (s+pSize>=tSize){
                return false;
            }
            s+= move[string1.charAt(s+pSize)];
        }
        return false;
    }

}
