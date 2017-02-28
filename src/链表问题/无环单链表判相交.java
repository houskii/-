package 链表问题;

import bean.ListNode;

/**
 * Created by Houskii on 17/2/26.
 * 链接：https://www.nowcoder.com/courses/1/5/13
 * 来源：牛客网
 *
 * 现在有两个无环单链表，若两个链表的长度分别为m和n，请设计一个时间复杂度为O(n + m)，
 * 额外空间复杂度为O(1)的算法，判断这两个链表是否相交。
 * 给定两个链表的头结点headA和headB，请返回一个bool值，代表这两个链表是否相交。
 * 保证两个链表长度小于等于500。

 */
public class 无环单链表判相交 {
    public boolean chkIntersect(ListNode headA, ListNode headB) {
        // write code here
        int lengthA = 1;
        ListNode tmpA = headA;
        ListNode tmpB = headB;

        while (tmpA.next!=null){
            lengthA++;
            tmpA = tmpA.next;
        }

        int lengthB = 1;
        while (tmpB.next!=null){
            lengthB++;
            tmpB = tmpB.next;
        }

        tmpA = headA;
        tmpB = headB;

        if (lengthA>lengthB){
            int k = lengthA-lengthB;
            for (int i = 0; i < k; i++) {
                tmpA = tmpA.next;
            }
        }else {
            int k = lengthB - lengthA;
            for (int i = 0; i < k; i++) {
                tmpB = tmpB.next;
            }
        }

        tmpA = headA;
        tmpB = headB;

        while(tmpA.next!=null||tmpA.next!=null){
            if (tmpB == tmpA){
                return true;
            }
            tmpA = tmpA.next;
            tmpB = tmpB.next;
        }
        return false;
    }
}
