package 二叉树问题;

import bean.TreeNode;

import java.util.LinkedList;

/**
 * Created by Houskii on 17/2/16.
 * 请用递归方式实现二叉树的先序、中序和后序的遍历打印。
 * 给定一个二叉树的根结点root，请依次返回二叉树的先序，中序和后续遍历(二维数组的形式)。
 */
public class 递归二叉树的序列打印 {
    public int[][] convert(TreeNode root) {
        // write code here
        LinkedList<TreeNode> preList = new LinkedList<>();
        preOrder(root,preList);

        LinkedList<TreeNode> midList = new LinkedList<>();
        midOrder(root,midList);

        LinkedList<TreeNode> tailList = new LinkedList<>();
        tailOrder(root,tailList);

        int[][] res = {translator(preList),translator(midList),translator(tailList)};
        return res;
    }


    void preOrder(TreeNode root, LinkedList<TreeNode> list){
        if (root!=null){
            list.add(root);
            preOrder(root.left,list);
            preOrder(root.right,list);
        }
    }


    void midOrder(TreeNode root, LinkedList<TreeNode> list){
        if (root!=null){
            midOrder(root.left,list);
            list.add(root);
            midOrder(root.right,list);
        }
    }

    void tailOrder(TreeNode root, LinkedList<TreeNode> list){
        if (root!=null){
            tailOrder(root.left,list);
            tailOrder(root.right,list);
            list.add(root);
        }
    }

    int[] translator(LinkedList<TreeNode> list){
        int[] a = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            a[i] = list.get(i).val;
        }
        return a;
    }

}
