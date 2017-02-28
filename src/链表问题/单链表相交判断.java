package 链表问题;

import bean.ListNode;

import java.util.List;

/**
 * Created by Houskii on 17/2/27.
 * 链接：https://www.nowcoder.com/courses/1/5/15
 来源：牛客网

 给定两个单链表的头节点head1和head2，如何判断两个链表是否相交？
 相交的话返回true，不想交的话返回false。
 给定两个链表的头结点head1和head2(注意，另外两个参数adjust0和adjust1用于调整数据,
 与本题求解无关)。请返回一个bool值代表它们是否相交。
 */
public class 单链表相交判断 {
    public boolean chkInter(ListNode head1, ListNode head2, int adjust0, int adjust1) {
        // write code here
        if(head1==null||head2==null){
            return false;
        }

        ListNode tmp1 = getCircleEnter(head1);
        ListNode tmp2 = getCircleEnter(head2);
        if(tmp1==null||tmp2==null){
            if(tmp1!=tmp2){
                return false;
            }else{
                //不存在环
                tmp1 = head1;
                while(tmp1.next!=null){
                    tmp1 = tmp1.next;
                }
                tmp2 = head2;
                while(tmp2.next!=null){
                    tmp2 = tmp2.next;
                }

                return head1==head2;
            }
        }else{
            //存在环
            if (tmp1==tmp2){
                return true;
            }
            ListNode enter = tmp1;
            tmp1 = tmp1.next;
            while(tmp1!=enter){
                tmp1 = tmp1.next;
                if(tmp1==tmp2){
                    return true;
                }
            }
            return false;
        }
    }

    ListNode getCircleEnter(ListNode head){
        ListNode fast_node = head;
        ListNode slow_node = head;
        do{
            if(fast_node.next==null||fast_node.next.next==null||slow_node.next==null){
                return null;
            }
            fast_node = fast_node.next.next;
            slow_node = slow_node.next;
        }while(fast_node!=slow_node);

        fast_node = head;

        do{
            fast_node = fast_node.next.next;
            slow_node = slow_node.next;
        }while(fast_node!=slow_node);

        return fast_node;
    }

}
