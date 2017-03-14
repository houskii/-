package 链表问题;

import bean.RandomListNode;

/**
 * Created by Houskii on 17/2/26.
 * 输入一个复杂链表（每个节点中有节点值，以及两个指针，一个指向下一个节点，
 * 另一个特殊指针指向任意一个节点）。
 */
public class 复杂链表的复制 {
    public RandomListNode Clone(RandomListNode pHead){
        if(pHead==null){
            return null;
        }
        createCopyNode(pHead);
        copyRandomPointer(pHead);
        RandomListNode res = splitList(pHead);
        pHead.next = pHead.next.next;
        return res;
    }

    void createCopyNode(RandomListNode pHead){
        RandomListNode tmp = pHead;
        while (tmp!=null){
            RandomListNode node = new RandomListNode(tmp.label);
            node.next = tmp.next;
            tmp.next = node;
            tmp = node.next;
        }
    }

    void copyRandomPointer(RandomListNode pHead){
        RandomListNode tmp = pHead;
        while (tmp!=null){
            RandomListNode node = tmp.next;
            if(tmp.random!=null){
                node.random = tmp.random.next;
            }
            tmp = node.next;
        }
    }

    RandomListNode splitList(RandomListNode pHead){
        RandomListNode tmp = pHead;
        RandomListNode copyHead = tmp.next;
        RandomListNode head = copyHead;
        while (tmp.next.next!=null){
            tmp = head.next;
            head.next = tmp.next;
            head = tmp.next;
        }
        return copyHead;
    }
}
