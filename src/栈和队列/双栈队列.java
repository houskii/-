package 栈和队列;

import java.util.ArrayList;

/**
 * Created by Houskii on 17/2/14.
 * 编写一个类,只能用两个栈结构实现队列,支持队列的基本操作(push，pop)。
 * 给定一个操作序列ope及它的长度n，其中元素为正数代表push操作，为0代表pop操作，保证操作序列合法且一定含pop操作，请返回pop的结果序列。
 * 测试样例：
 * [1,2,3,0,4,0],6
 * 返回：[1,2]
 */
public class 双栈队列 {

    public int[] twoStack(int[] ope, int n) {
        int[] stack1 = new int[n];
        int sp1 = 0,sp2 = 0;
        int[] stack2 = new int[n];

        int size = 0;
        for (int i : ope) {
            if (i==0){
                size++;
            }
        }

        int[] res = new int[size];
        int rp = 0;



        for (int i = 0; i < ope.length; i++) {
            if (ope[i]>0){
                push(ope[i],stack1,sp1++);
            }else if (ope[i]==0){
                while (sp1!=0) {
                    push(pop(stack1, --sp1), stack2, sp2++);
                }
                res[rp++] = pop(stack2,--sp2);
                while (sp2!=0){
                    push(pop(stack2,--sp2),stack1,sp1++);
                }
            }
        }
        return res;
        // write code here
    }

    void push(int n,int[] stack,int sp){
        stack[sp] = n;
    }

    int pop(int[] stack,int sp){
        int res =stack[sp];
        stack[sp] = 0;
        return res;
    }
}
