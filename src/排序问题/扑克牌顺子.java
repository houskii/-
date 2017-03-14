package 排序问题;

/**
 * Created by Houskii on 17/3/14.
 * LL今天心情特别好,因为他去买了一副扑克牌,发现里面居然有2个大王,2个小王
 * (一副牌原本是54张^_^)...他随机从中抽出了5张牌,想测测自己的手气,看看能不能抽到顺子,
 * 他想了想,决定大\小 王可以看成任何数字,并且A看作1,J为11,Q为12,K为13。
 * 为了方便起见,你可以认为大小王是0。
 */
public class 扑克牌顺子 {
    public boolean isContinuous(int [] numbers) {
        int len = numbers.length;
        if(len<5){
            return false;
        }
        int[] arr = new int[14];
        for(int i = 0; i <len;i++){
            arr[numbers[i]]++;
            if(numbers[i]!=0&&arr[numbers[i]]>=2){
                return false;
            }
        }
        int dif = 0;
        int prePosition = 0;
        for(int i = 0;i<arr.length;i++){
            if(arr[i]==0){
                continue;
            }else{
                if(prePosition==0){
                    prePosition = i;
                }else{
                    dif+= (i-prePosition-1);
                    prePosition = i;
                }
            }
        }
        return arr[0]>=dif;
    }
}
