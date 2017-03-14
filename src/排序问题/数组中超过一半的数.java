package 排序问题;

/**
 * Created by Houskii on 17/3/9.
 * 数组中有一个数字出现的次数超过数组长度的一半，请找出这个数字。
 * 例如输入一个长度为9的数组{1,2,3,2,2,2,5,4,2}。由于数字2在数组中出现了5次，
 * 超过数组长度的一半，因此输出2。如果不存在则输出0。
 */
public class 数组中超过一半的数 {
    public int MoreThanHalfNum_Solution(int[] array) {
        int len = array.length;
        if (len <= 0) {
            return 0;
        }
        int res = 0;
        int cur = 0;

        for (int i = 0; i < len; i++) {
            if (cur == 0) {
                res = array[i];
                cur++;
                continue;
            }

            if (res == array[i]) {
                cur++;
            } else {
                cur--;
            }
        }
        int count = 0;
        for (int i = 0; i < len; i++) {
            if (array[i] == res) {
                count++;
            }
        }
        return (count > (len / 2)) ? res : 0;
    }
}
