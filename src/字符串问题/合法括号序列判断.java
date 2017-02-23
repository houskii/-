package 字符串问题;

/**
 * Created by Houskii on 17/2/10.
 * 对于一个字符串，请设计一个算法，判断其是否为一个合法的括号串。
 * 给定一个字符串A和它的长度n，请返回一个bool值代表它是否为一个合法的括号串。
 * 测试样例：
 * "(()())",6
 * 返回：true
 * 测试样例：
 * "()a()()",7
 * 返回：false
 * 测试样例：
 * "()(()()",7
 * 返回：false

 */
public class 合法括号序列判断 {
    public boolean chkParenthesis(String A, int n) {
        // write code here
        int couple = 0;
        for (char a:A.toCharArray()){
            if (couple<0){
                return false;
            }
            if (a=='('){
                couple++;
            }else if (a==')'){
                couple--;
            }else {
                return false;
            }
        }
        return couple == 0;
    }
}
