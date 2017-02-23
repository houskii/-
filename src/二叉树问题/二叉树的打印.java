package 二叉树问题;

import bean.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by Houskii on 17/2/16.
 * 有一棵二叉树，请设计一个算法，按照层次打印这棵二叉树。
 * 给定二叉树的根结点root，请返回打印结果，结果按照每一层一个数组进行储存，
 * 所有数组的顺序按照层数从上往下，且每一层的数组内元素按照从左往右排列。
 * 保证结点数小于等于500。
 */
public class 二叉树的打印 {
    public int[][] printTree(TreeNode root) {
        // write code here
        LinkedList<TreeNode> queue = new LinkedList<>();
        if (root==null){
            return null;
        }
        TreeNode last;
        TreeNode nLast = root;
        queue.add(root);
        LinkedList<LinkedList<Integer>> list = new LinkedList<>();
        LinkedList<Integer> line = new LinkedList<>();
        while(!queue.isEmpty()){
            TreeNode node = queue.pollFirst();

            if (node.left!=null){
                queue.add(node.left);
            }

            if (node.right!=null){
                queue.add(node.right);
            }

            line.add(node.val);
            last = node;

            if (last.equals(nLast)){
                nLast = queue.isEmpty()?null:queue.getLast();
                list.add(line);
                line = new LinkedList<>();
            }
        }

        int[][] res = new int[list.size()][];
        for (int i = 0; i < list.size(); i++) {
            res[i] = translator(list.get(i));
        }
        return res;
    }

    int[] translator(LinkedList<Integer> list){
        int[] a = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            a[i] = list.get(i);
        }
        return a;
    }
}