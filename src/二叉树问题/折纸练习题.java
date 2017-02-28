package 二叉树问题;

import bean.TreeNode;
import java.util.*;
/**
 * Created by Houskii on 17/2/23.
 * 链接：https://www.nowcoder.com/courses/1/7/11
 * 来源：牛客网
 *
 * 请把纸条竖着放在桌⼦上，然后从纸条的下边向上⽅对折，压出折痕后再展 开。
 * 此时有1条折痕，突起的⽅向指向纸条的背⾯，这条折痕叫做“下”折痕 ；
 * 突起的⽅向指向纸条正⾯的折痕叫做“上”折痕。如果每次都从下边向上⽅ 对折，
 * 对折N次。请从上到下计算出所有折痕的⽅向。
 * 给定折的次数n,请返回从上到下的折痕的数组，
 * 若为下折痕则对应元素为"down",若为上折痕则为"up".
 * 测试样例：
 * 1
 * 返回：["down"]
 */
public class 折纸练习题 {
    static final int LEFT = 1;
    static final int RIGHT = 2;

    public String[] foldPaper(int n) {
        // write code here
        int sum = 1;
        for (int i = 0;i<n;i++){
            sum*=2;
        }
        sum-=1;
        TreeNode node = buildTree(sum,1,LEFT);
        LinkedList<TreeNode> list = new LinkedList<>();
        midOrder(node,list);
        String[] res = new String[sum];
        for (int i = 0;i<sum;i++){
            if (list.get(i).val==LEFT){
                res[i] = "down";
            }
            if (list.get(i).val == RIGHT){
                res[i] = "up";
            }
        }
        return res;
    }

    TreeNode buildTree(int total,int current,int res){
        if (current>total){
            return null;
        }
        TreeNode node = new TreeNode(res);
        node.left = buildTree(total,current*2,LEFT);
        node.right = buildTree(total,current*2+1,RIGHT);
        return node;
    }

    void midOrder(TreeNode node,LinkedList<TreeNode> list){
        if (list==null){
            return;
        }
        if (node.left!=null){
            midOrder(node.left,list);
        }
        list.add(node);
        if (node.right!=null){
            midOrder(node.right,list);
        }
    }

}
