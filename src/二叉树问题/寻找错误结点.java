package 二叉树问题;

import bean.TreeNode;

import java.util.LinkedList;

/**
 * Created by Houskii on 17/2/24.
 * 链接：https://www.nowcoder.com/courses/1/7/12
 * 来源：牛客网
 *
 * 一棵二叉树原本是搜索二叉树，但是其中有两个节点调换了位置，使得这棵二叉树不再是搜索二叉树，
 * 请找到这两个错误节点并返回他们的值。保证二叉树中结点的值各不相同。
 * 给定一棵树的根结点，请返回两个调换了位置的值，其中小的值在前。
 */
public class 寻找错误结点 {
    public int[] findError(TreeNode root) {
        // write code here
        LinkedList<TreeNode> list = new LinkedList<>();
        midOrder(root,list);
        int theBig = 0;
        int theSmall = 0;
        int tmp = Integer.MIN_VALUE ;
        //升序列找错误的
        for(int i =0;i<list.size();i++){
            int k = list.get(i).val;
            if(tmp>k){
                theBig = tmp;
                break;
            }
            tmp = k;
        }
        //降序中找错误的
        tmp = Integer.MAX_VALUE;
        for (int i = list.size()-1; i >=0; i--) {
            int k = list.get(i).val;
            if(tmp<k){
                theSmall = tmp;
                break;
            }
            tmp = k;
        }

        int[] res = {theSmall,theBig};
        return res;
    }


    void midOrder(TreeNode node,LinkedList<TreeNode> list){
        if(list==null){
            return;
        }
        if(node.left!=null){
            midOrder(node.left,list);
        }
        list.add(node);
        if(node.right!=null){
            midOrder(node.right,list);
        }
    }


}
