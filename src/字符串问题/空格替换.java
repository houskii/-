package 字符串问题;

/**
 * Created by Houskii on 17/2/10.
 * 请编写一个方法，将字符串中的空格全部替换为“%20”。假定该字符串有足够的空间存放新增的字符，并且知道字符串的真实长度(小于等于1000)，同时保证字符串由大小写的英文字母组成。
 * 给定一个string iniString 为原始的串，以及串的长度 int len, 返回替换后的string。
 * 测试样例：
 * "Mr John Smith”,13
 * 返回："Mr%20John%20Smith"
 */
public class 空格替换 {
    public String replaceSpace(String iniString, int length) {
        // write code here
        int countSpace = 0;
        for (int i = 0;i<iniString.length();i++){
            if (' ' ==iniString.charAt(i)){
                countSpace ++;
            }
        }
        char[] arr = new char[length+countSpace*2];
        int arrPointer = arr.length-1;
        for (int i = length-1;i>=0;i--){
            char c = iniString.charAt(i);
            if (c!=' '){
                arr[arrPointer--] = c;
            }else {
                arr[arrPointer--] = '0';
                arr[arrPointer--] = '2';
                arr[arrPointer--] = '%';
            }
        }
        return new StringBuilder().append(arr).toString();
    }
}
