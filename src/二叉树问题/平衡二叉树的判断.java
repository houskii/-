package 二叉树问题;

import bean.TreeNode;

import java.util.Stack;

/**
 * Created by Houskii on 17/2/23.
 * 有一棵二叉树，请设计一个算法判断这棵二叉树是否为平衡二叉树。
 * 给定二叉树的根结点root，请返回一个bool值，代表这棵树是否为平衡二叉树。
 */
public class 平衡二叉树的判断 {
    boolean flag = true;
    public boolean IsBalanced_Solution(TreeNode root) {
        // write code here
        getDepth(root);
        return flag;
    }

    int getDepth(TreeNode root){
        if (root==null){
            return 0;
        }
        int left = getDepth(root.left);
        int right = getDepth(root.right);
        if (Math.abs(left-right)>1){
            flag = false;
        }
        return left>right?left+1:right+1;
    }

}
