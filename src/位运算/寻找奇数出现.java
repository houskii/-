package 位运算;

/**
 * Created by Houskii on 17/3/6.
 * 给定一个整型数组arr，其中有两个数出现了奇数次，其他的数都出现了偶数次，找到这两个数。
 * 要求时间复杂度为O(N)，额外空间复杂度为O(1)。
 给定一个整形数组arr及它的大小n，请返回一个数组，其中两个元素为两个出现了奇数次的元素,
 请将他们按从小到大排列。

 测试样例：
 [1,2,4,4,2,1,3,5],8
 返回：[3,5]
 */
public class 寻找奇数出现 {
    public int[] findOdds(int[] arr, int n) {
        // write code here
        int res = 0 ;

        for(int i = 0 ; i < arr.length ; i++){
            res = res ^ arr[i];
        }

        int tmp = 1;
        for(int i = 0;i<32;i--){
            if((res&tmp)>0){
                break;
            }
            tmp = tmp << 1;
        }

        int res1 = 0;

        for(int i = 0 ; i < arr.length ; i++){
            if( (arr[i] & tmp) != 0 ){
                res1 = res1 ^ arr[i];
            }
        }

        int res2 = res ^ res1;

        if(res1>res2){
            int t = res1;
            res1 = res2;
            res2 = t;
        }

        int[] sum = {res1,res2};

        return sum;

    }
}
