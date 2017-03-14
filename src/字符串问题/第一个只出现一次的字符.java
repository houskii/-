package 字符串问题;

/**
 * Created by Houskii on 17/3/13.
 * 在一个字符串(1<=字符串长度<=10000，全部由大写字母组成)
 * 中找到第一个只出现一次的字符,并返回它的位置
 */
public class 第一个只出现一次的字符 {
    public int FirstNotRepeatingChar(String str) {
        int size = 125;
        Entry[] set = new Entry[size];
        for(int i=0;i<set.length;i++){
            set[i] = new Entry();
            set[i].letter = (char)i;
        }

        for(int i = 0;i<str.length();i++){
            char c = str.charAt(i);
            set[c].count++;
            set[c].lastPosition = i;
        }
        int minPosition = str.length();
        for(int i = 0 ;i<size;i++){
            if(set[i].count==1){
                if(set[i].lastPosition < minPosition){
                    minPosition = set[i].lastPosition;
                }

            }
        }
        return minPosition>=str.length()?-1:minPosition;
    }

    class Entry{
        int count = 0;
        char letter;
        int lastPosition = -1;
    }
}
