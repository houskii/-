package 字符串问题;

/**
 * Created by Houskii on 17/2/8.
 * 对于一个字符串，请设计一个算法，只在字符串的单词间做逆序调整，也就是说，字符串由一些由空格分隔的部分组成，你需要将这些部分逆序。
 * 给定一个原字符串A和他的长度，请返回逆序后的字符串。
 * 测试样例：
 * "dog loves pig",13
 * 返回："pig loves dog"
 */
public class 句子的逆序 {
    public String reverseSentence(String A, int n) {
        // write code here
        char[] a = A.toCharArray();
        reverse(a,0,a.length-1);
        int start = 0;
        StringBuilder builder1 = new StringBuilder();
        builder1.append(a);
        for (int i= 0;i<a.length;i++){
            if (a[i]==' '){     //每个单词
                reverse(a,start,i-1);
                start = i+1;
            }
            if (i==a.length-1){ //最后一个单词
                reverse(a,start,i);
            }
        }
        StringBuilder builder = new StringBuilder();
        builder.append(a);
        return builder.toString();
    }

    void reverse(char[] a,int start,int end){
        int mid = (start+end)/2;
        for (int i =start;i<=mid;i++){
            int j = end-i+start;
            char tmp = a[i];
            a[i] = a[j];
            a[j] = tmp;
        }
    }
}
