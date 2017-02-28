//package 二叉树问题;
//
//import bean.TreeNode;
//
//import java.util.LinkedList;
//import java.util.Stack;
//
///**
// * Created by Houskii on 17/2/16.
// * 请用非递归方式实现二叉树的先序、中序和后序的遍历打印。
// * 给定一个二叉树的根结点root，请依次返回二叉树的先序，中序和后续遍历(二维数组的形式)。
// */
//public class 非递归二叉树的序列打印 {
//    public int[][] convert(TreeNode root) {
//        // write code here
//        if (root==null){
//            return null;
//        }
//        LinkedList<TreeNode> preList = new LinkedList<>();
//        LinkedList<TreeNode> midList = new LinkedList<>();
//        LinkedList<TreeNode> tailList = new LinkedList<>();
//        preOrder(root,preList);
//        midOrder(root,midList);
//        tailOrder(root,tailList);
//        int[] pre = translator(preList);
//        int[] mid = translator(midList);
//        int[] tail = translator(tailList);
//        int[][] res = {pre,mid,tail};
//        return res;
//    }
//
//    void preOrder(TreeNode root,LinkedList<TreeNode> list){
//        list.add(root);
//        if (root.left!=null){
//            preOrder(root.left,list);
//        }
//        if (root.right!=null){
//            preOrder(root.right, list);
//        }
//    }
//
//    void tailOrder(TreeNode root,LinkedList<TreeNode> list){
//        if (root.left!=null){
//            tailOrder(root.left,list);
//        }
//        if (root.right!=null){
//            tailOrder(root.right,list);
//        }
//        list.add(root);
//    }
//
//    void midOrder(TreeNode root,LinkedList<TreeNode> list){
//        if (root.left!=null){
//            midOrder(root.left,list);
//        }
//        list.add(root);
//        if (root.right!=null){
//            midOrder(root.right,list);
//        }
//    }
//
//
//
//
//    int[] translator(LinkedList<TreeNode> list){
//        int[] a = new int[list.size()];
//        for (int i = 0; i < list.size(); i++) {
//            a[i] = list.get(i).val;
//        }
//        return a;
//    }
//
//}
