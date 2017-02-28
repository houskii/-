package 链表问题;

import bean.ListNode;

/**
 * Created by Houskii on 17/2/26.
 * 链接：https://www.nowcoder.com/courses/1/5/12
 * 来源：牛客网
 *
 * 如何判断一个单链表是否有环？有环的话返回进入环的第一个节点的值，无环的话返回-1。
 * 如果链表的长度为N，请做到时间复杂度O(N)，额外空间复杂度O(1)。
 * 给定一个单链表的头结点head（注意另一个参数adjust为加密后的数据调整参数，方便数据设置，与本题求解无关)，请返回所求值。

 */
public class 链表判环 {
    public int chkLoop(ListNode head, int adjust) {
        // write code here
        ListNode slow_node = head;
        ListNode fast_node = head;
        while(true){
            if (fast_node.next==null||fast_node.next.next==null){
                return -1;
            }
            slow_node = slow_node.next;
            fast_node = fast_node.next.next;
            if (slow_node==fast_node){
                break;
            }
        }
        fast_node = head;
        while (fast_node!=slow_node){
            fast_node = fast_node.next;
            slow_node = slow_node.next;
        }
        return fast_node.val;
    }
}
