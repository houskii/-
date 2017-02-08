package 字符串问题;

/**
 * Created by Houskii on 17/2/8.
 * 如果对于一个字符串A，将A的前面任意一部分挪到后边去形成的字符串称为A的旋转词。比如A="12345",A的旋转词有"12345","23451","34512","45123"和"51234"。对于两个字符串A和B，请判断A和B是否互为旋转词。
 给定两个字符串A和B及他们的长度lena，lenb，请返回一个bool值，代表他们是否互为旋转词。
 测试样例：
 "cdab",4,"abcd",4
 返回：true
 */
public class 两串旋转 {
    public boolean chkRotation(String A, int lena, String B, int lenb) {
        // write code here
        StringBuilder builder = new StringBuilder(A);
        builder.append(A);
        return builder.toString().contains(B);
    }

    public boolean sunday(char[] total,char[]part){
        int tSize = total.length;
        int pSize = part.length;
        int[] matrix = new int[150];
        for (int i=0;i<150;i++){
            matrix[i] = 0;
        }

        for (int i=0;i<pSize;i++){
            matrix[part[i]] = pSize-i;
        }

        int s = 0;
        int j;
        while(s<=tSize-pSize){
            j = 0;
            while(total[s+j]==part[j]){
                j++;
                if (j>=pSize){
                    return true;
                }
            }
            s+=matrix[total[s+pSize]];
        }
        return false;
    }
}
