package 链表问题;

import bean.ListNode;

/**
 * Created by Houskii on 17/2/27.
 */
public class 链表的逆序 {
    public ListNode reverse(ListNode node){
        if (node==null){
            return null;
        }
        ListNode pre = null;
        ListNode cur = node;
        ListNode aft = node.next;

        if (aft==null){
            return cur;
        }

        while (aft.next!=null){
            cur.next = pre;
            pre = cur;
            cur = aft;
            aft = aft.next;
        }

        cur.next = pre;
        aft.next = cur;
        return aft;

    }
}
