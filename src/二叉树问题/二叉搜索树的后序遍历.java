package 二叉树问题;

/**
 * Created by Houskii on 17/3/4.
 */
public class 二叉搜索树的后序遍历 {
    public boolean VerifySquenceOfBST(int [] sequence) {
        if (sequence.length==0){
            return false;
        }
        return test(sequence,0,sequence.length-1);
    }

    boolean test(int[] s,int start,int end){
        if(start>=end||end>=s.length){
            return true;
        }
        int split_position = end;
        int root = s[end];
        for(int i = start;i<end;i++){
            if(s[i]>root){
                split_position = i;
                break;
            }
        }

        for(int i = start;i<split_position;i++){
            if(s[i]>root){
                return false;
            }
        }

        for(int i = split_position;i<end;i++){
            if(s[i]<root){
                return false;
            }
        }

        return test(s,start,split_position-1) && test(s,split_position,end-1);
    }
}
