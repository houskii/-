//package 链表问题;
//
//import bean.ListNode;
//
//
///**
// * Created by Houskii on 17/2/27.
// * 链接：https://www.nowcoder.com/courses/1/5/5
// 来源：牛客网
//
// 对于一个链表，我们需要用一个特定阈值完成对它的分化，使得小于等于这个值的结点移到前面，
// 大于该值的结点在后面，同时保证两类结点内部的位置关系不变。
// 给定一个链表的头结点head，同时给定阈值val，请返回一个链表，使小于等于它的结点在前，
// 大于等于它的在后，保证结点值不重复。
// 测试样例：
// {1,4,2,5},3
// {1,2,4,5}
// */
//public class 链表的分化 {
//    public ListNode listDivide(ListNode head, int val) {
//        // write code here
//        if (head==null){
//            return null;
//        }
//        ListNode low ,mid,high;
//        low = getNode(head,val,Integer.MAX_VALUE);
//        mid = getNode(head,val,0);
//        high = getNode(head,val,Integer.MIN_VALUE);
//        ListNode tmp = low;
//        ListNode pHead = tmp;
//        if (low!=null){
//            while(tmp.next!=null){
//                tmp = tmp.next;
//            }
//        }
//        if (tmp == null) {
//            tmp = mid;
//            pHead = tmp;
//        }else {
//            tmp.next = mid;
//        }
//
//        if (mid!=null){
//            while(tmp.next!=null){
//                tmp = tmp.next;
//            }
//        }
//
//        if (tmp ==null){
//            tmp = high;
//            pHead = tmp;
//        }else {
//            tmp.next = high;
//        }
//        return pHead;
//    }
//
//    ListNode getNode(ListNode head,int val,int judge){
//        ListNode tmp = head;
//        ListNode before = null;
//        ListNode res = null;
//        while (tmp!=null){
//            int k = tmp.val-val;
//            if (k == judge || (judge>0?k<0:k>0)){
//                if (res==null){
//                    res = tmp;
//                    if (before!=null){
//                        before.next = tmp.next;
//                    }else {
//                        head = tmp.next;
//                    }
//                    res.next = null;
//                }else {
//                    res.next = tmp;
//                    before.next = tmp.next;
//                    tmp.next = null;
//                    res = res.next;
//                }
//            }
//            before = tmp;
//            tmp = tmp.next;
//        }
//        return res;
//    }
//
//}
