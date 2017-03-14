package bean;

import java.util.Stack;

/**
 * Created by Houskii on 17/2/14.
 */
public class ListNode {
    public int val;
    public ListNode next = null;
    public ListNode(int x){
        val = x;
    }

    public static ListNode format(int[] arr){
        ListNode node = new ListNode(arr[0]);
        ListNode tmp = node;
        for (int i = 1; i < arr.length; i++) {
            tmp.next =new ListNode(arr[i]);
            tmp = tmp.next;
        }
        return node;
    }
}
