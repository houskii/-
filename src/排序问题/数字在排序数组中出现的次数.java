package 排序问题;

/**
 * Created by Houskii on 17/3/13.
 * 统计一个数字在排序数组中出现的次数。
 */
public class 数字在排序数组中出现的次数 {
    public int GetNumberOfK(int [] array , int k) {
        int len = array.length-1;
        int start = getStart(array,0,len,k);
        int end = getEnd(array,0,len,k);
        return end-start+1;
    }

    int getStart(int[] array,int start,int end,int k){
        if(array[start]==k){
            return start;
        }
        int half = (start+end)/2;

        if(array[half]==k){
            if(array[half-1]!=k){
                return half;
            }else{
                return getStart(array,start,half,k);
            }
        }

        if(array[half]>k){
            return getStart(array,0,half,k);
        }

        if(array[half]<k){
            return getStart(array,half,end,k);
        }
        return start;
    }

    int getEnd(int[] array,int start,int end,int k){
        if(array[end]==k){
            return end;
        }
        int half = (start+end)/2;
        if(array[half]==k){
            if(array[half+1]!=k){
                return half;
            }else {
                return getEnd(array,half,end,k);
            }
        }

        if(array[half]>k){
            return getEnd(array,start,half,k);
        }

        if(array[half]<k){
            return getEnd(array,half,end,k);
        }

        return end;
    }
}
