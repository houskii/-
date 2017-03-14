package 二叉树问题;

import bean.TreeNode;

import java.util.Stack;

/**
 * Created by Houskii on 17/3/13.
 *
 */
public class 二叉树的深度 {
    public int TreeDepth(TreeNode root) {
        Stack<TreeNode> stack = new Stack<>();
        int depth = getDepth(root,stack,0);
        return depth;
    }

    int getDepth(TreeNode root , Stack<TreeNode> stack,int depth){
        if(root==null){
            if(!stack.isEmpty()){
                stack.pop();
            }
            return depth;
        }
        depth++;
        stack.push(root);
        int leftD = getDepth(root.left,stack,depth);
        int rightD = getDepth(root.right,stack,depth);
        if(leftD > rightD){

        }
        return leftD > rightD ? leftD : rightD;
    }

}
