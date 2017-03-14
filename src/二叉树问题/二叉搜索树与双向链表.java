package 二叉树问题;

import bean.TreeNode;

import java.util.Stack;

/**
 * Created by Houskii on 17/3/12.
 * 输入一棵二叉搜索树，将该二叉搜索树转换成一个排序的双向链表。
 * 要求不能创建任何新的结点，只能调整树中结点指针的指向。
 */
public class 二叉搜索树与双向链表 {
    public TreeNode Convert(TreeNode pRootOfTree) {
        if(pRootOfTree==null){
            return pRootOfTree;
        }
        Stack<TreeNode> stack = new Stack<>();
        stack = pushToStack(stack,pRootOfTree);
        TreeNode node1,node2;
        TreeNode node = new TreeNode(0);
        while(!stack.isEmpty()){
            node1 = stack.pop();
            if (stack.isEmpty()){
                node = node1;
                break;
            }
            node2 = stack.peek();
            node1.left = node2;
            node2.right = node1;
        }
        return node;
    }


    Stack<TreeNode> pushToStack(Stack<TreeNode> stack,TreeNode root){
        if(root!=null){
            if(root.left!=null){
                pushToStack(stack,root.left);
            }
            stack.push(root);
            if(root.right!=null){
                pushToStack(stack,root.right);
            }
        }
        return stack;
    }

}
