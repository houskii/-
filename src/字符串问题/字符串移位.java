package 字符串问题;

/**
 * Created by Houskii on 17/2/10.
 * 对于一个字符串，请设计一个算法，将字符串的长度为len的前缀平移到字符串的最后。
 * 给定一个字符串A和它的长度，同时给定len，请返回平移后的字符串。
 * 测试样例：
 * "ABCDE",5,3
 * 返回："DEABC"
 */
public class 字符串移位 {
    public String stringTranslation(String A, int n, int len) {
        // write code here
        char[] a = A.toCharArray();
        reverse(a,0,n);
        reverse(a,0,n-len);
        reverse(a,n-len,len);
        return new String(a);
    }

    char[] reverse(char[] a,int start,int len){
        if (a==null||len+start>a.length){
        }else {
            for (int i = 0;i<len/2;i++){
                char tmp = a[i+start];
                a[i+start] = a[start+len-i-1];
                a[start+len-i-1] = tmp;
            }
        }
        return a;
    }

}
