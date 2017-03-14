package 面试真题;

/**
 * Created by Houskii on 17/3/13.
 */
public class 丑数 {
    public int GetUglyNumber_Solution(int index) {
        if(index<=0){
            return 0;
        }
        int[] res = new int[index];
        res[0] = 1;
        int position = 1;
        int ugly_2 = 0;
        int ugly_3 = 0;
        int ugly_5 = 0;
        while(position<index){
            int ugly_now = getMin(res[ugly_2]*2,res[ugly_3]*3,res[ugly_5]*5);
            res[position++] = ugly_now;
            while(res[ugly_2]*2 <= ugly_now){
                ugly_2++;
            }
            while(res[ugly_3]*3 <= ugly_now){
                ugly_3++;
            }
            while(res[ugly_5]*5 <= ugly_now){
                ugly_5++;
            }
        }
        return res[index-1];
    }

    int getMin(int i1,int i2,int i3){
        int i4 = i1<i2?i1:i2;
        return i4<i3?i4:i3;
    }
}
