package 栈和队列;

/**
 * Created by Houskii on 17/2/14.
 * 定义栈的数据结构，请在该类型中实现一个能够得到栈最小元素的min函数。
 */
public class 可查询最值的栈 {
    int size = 9192;
    int[] stack = new int[size];
    int[] shadowStack = new int[size];
    int topPosition = 0;

    public void push(int node) {
        if (topPosition<size){
            stack[topPosition] = node;
            if (topPosition>0){
                shadowStack[topPosition] = node< shadowStack[topPosition-1]? node:shadowStack[topPosition-1];
            }else {
                shadowStack[topPosition] = node;
            }
            topPosition++;
        }
    }

    public void pop() {
        if (topPosition>0){
            stack[topPosition] = 0;
            shadowStack[topPosition] = 0;
            topPosition--;
        }
    }

    public int top() {
        return stack[topPosition-1];
    }

    public int min() {
        return shadowStack[topPosition-1];
    }
}
