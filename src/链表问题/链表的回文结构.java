package 链表问题;

import bean.ListNode;
import java.util.*;
/**
 * Created by Houskii on 17/2/27.
 * 链接：https://www.nowcoder.com/courses/1/5/9
 来源：牛客网

 请编写一个函数，检查链表是否为回文。
 给定一个链表ListNode* pHead，请返回一个bool，代表链表是否为回文。
 测试样例：
 {1,2,3,2,1}
 返回：true
 {1,2,3,2,3}
 返回：false
 */
public class 链表的回文结构 {
    public boolean isPalindrome(ListNode head) {
        // write code here
        return fun2(head);

    }

    //方法1:空间复杂度O(n)
    boolean fun1(ListNode node){
        if (node==null){
            return false;
        }
        LinkedList<Integer> list = new LinkedList<>();
        ListNode tmp = node;
        list.push(tmp.val);
        while(tmp.next!=null){
            tmp = tmp.next;
            list.push(tmp.val);
        }

        tmp = node;
        while(tmp.next!=null){
            if (tmp.val != list.pop()){
                return false;
            }
            tmp = tmp.next;
        }
        return true;
    }


    //方法2:空间复杂度O(1) 最优解
    boolean fun2(ListNode node){
        if (node==null){
            return false;
        }
        ListNode tmp1 = node;
        ListNode tmp2 = node;
        int length = 1;
        while (tmp2.next!=null){
            length++;
            tmp2 = tmp2.next;
        }

        int steps = length/2;
        tmp2 = node;
        while (steps>0){
            tmp2 = tmp2.next;
            steps--;
        }

        ListNode reverse_head = reverse(tmp2,tmp2.next,length/2);
        tmp2 = reverse_head;

        while (!(tmp2==tmp1||tmp2.next == tmp1)){
            if (tmp2.val!=tmp1.val){
                return false;
            }
            tmp2 = tmp2.next;
            tmp1 = tmp1.next;
        }
        reverse(null,reverse_head,length/2);
        return true;
    }


    ListNode reverse(ListNode pre_node,ListNode cur_node,int length){
        ListNode aft_node = cur_node.next;
        for (int i = 0;i<length-1;i++){
            if (aft_node==null){
                break;
            }
            cur_node.next = pre_node;
            pre_node = cur_node;
            cur_node = aft_node;
            aft_node = aft_node.next;
        }


        if(aft_node!=null){
            if (aft_node.next!=null&&aft_node.next.next!=null){
                aft_node.next.next = aft_node.next;
            }
            aft_node.next = cur_node;
            cur_node.next = pre_node;
        }else {
            cur_node.next = pre_node;
            return cur_node;
        }
        return aft_node;
    }
}
