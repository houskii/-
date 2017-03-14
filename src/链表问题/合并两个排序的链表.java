package 链表问题;

import bean.ListNode;

/**
 * Created by Houskii on 17/3/2.
 */
public class 合并两个排序的链表 {
    public ListNode Merge(ListNode list1,ListNode list2) {
        ListNode head1 = list1;
        ListNode head2 = list2;
        ListNode tmp = new ListNode(0);
        ListNode head = tmp;

        while(head1!=null || head2!=null){

            if(head1==null){
                head.next = new ListNode(head2.val);
                head2 = head2.next;
            }else if(head2==null){
                head.next = new ListNode(head1.val);
                head1 = head1.next;
            }else if(head1.val>=head2.val){
                head.next = new ListNode(head2.val);
                head2 = head2.next;
            }else if(head2.val>=head1.val){
                head.next = new ListNode(head1.val);
                head1 = head1.next;
            }
            head = head.next;
        }
        return tmp.next;
    }
}
