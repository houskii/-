package 二叉树问题;

import bean.TreeNode;

/**
 * Created by Houskii on 17/3/2.
 */
public class 树的子结构 {
    public boolean HasSubtree(TreeNode root1, TreeNode root2) {
        boolean res = false;
        if(root1!=null&&root2!=null){
            if (root1.val ==root2.val){
                res = checkTree(root1,root2);
            }
            if (!res){
                res = checkTree(root1.left,root2);
            }
            if(!res){
                res = checkTree(root1.right,root2);
            }
        }
        return res;
    }


    boolean checkTree(TreeNode root1,TreeNode root2){
        if(root2==null){
            return true;
        }
        if(root1==null){
            return false;
        }
        if(root1.val==root2.val){
            return checkTree(root1.left,root2.left) && checkTree(root1.right,root2.right);
        }else {
            return false;
        }
    }
}
