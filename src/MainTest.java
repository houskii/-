import 排序问题.*;

/**
 * Created by Houskii on 17/2/4.
 */
public class MainTest {
    public static void main(String[] args){
        三色问题 test = new 三色问题();
        int[] a = {2,2,0,2,0};
        test.sortThreeColor(a,5);
        for (int i : a) {
            System.out.print(i+" ");
        }
    }
}
