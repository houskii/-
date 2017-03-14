//package 面试真题;
//
//import java.util.Scanner;
//
///**
// * Created by Houskii on 17/3/7.
// * 上大学的小明为了完成计算机课作业，开发了款简单的聊天APP，没想到这个APP在学校里挺流行，同学们经常用这个APP来互发消息，但用了一段时间以后，有同学的指出这个APP以明文发送信息，安全性太差，要求小明对信息内容至少要做一个简单的加密。小明略加思考，想出了一个方案，步骤如下：
// 1） 如果原文为字串s， 则在发送前先将s转换为UTF-8编码，然后按位取反，再将数据以字节为单位反转顺序，得到新的字节数组
// 2） 取出新字节数组的每一字节，为其生成一个0到100的随机数，用该字节减于随机数，得到的结果作为一个32位整数的最后8位，而随机数按位取反后则作为该整数的9至16位，从而生成一个新的整数，以此类推，得到一个整形数组d
// 3） 将该整形数组发送给接收方，对方解密后得到原文内容s
// 输入范例:
// 56477,56465,51835,63190,44858,62933,40492
// 输出范例:
// r u OK?
// */
//public class 阿里笔试 {
//
//    static String decrypt(String s) {
//        int length = s.length();
//        int count = 0;
//        int lastPosition = 0;
//        int[] numbers = new int[9192];
//        for(int i = 0;i<length;i++){
//            char res = s.charAt(i);
//            if (res == ',') {
//                int k = Integer.valueOf(s.substring(lastPosition,i));
//                lastPosition =i+1;
//                numbers[count++] = k;
//            }else if(i==length-1){
//                int k = Integer.valueOf(s.substring(lastPosition,i));
//                numbers[count++] = k;
//            }
//        }
//        length = count;
//
//        final int HIGH = 0x0000ff00;
//        final int LOW  = 0x000000ff;
//        char[] reverse_before = new char[length];
//        for(int position = 0; position <length ; position++){
//            int number = numbers[position];
//            int random_number = -(~((number & HIGH))>>8);//????
//            char byt = (char)((number & LOW)+ random_number);
//            reverse_before[position] = byt;
//        }
//        int tail = length -1;
//        for(int position = 0;position<(length+1)/2 ;position++){
//            char tmp = reverse_before[position];
//            reverse_before[position] = reverse_before[tail-position];
//            reverse_before[tail-position] = tmp;
//        }
//
//        for(int position = 0;position<length ;position++){
//            reverse_before[position] = (char)(~reverse_before[position]);
//        }
//        return new String(reverse_before);
//
//    }
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        String res;
//
//        String _s;
//        try {
//            _s = in.nextLine();
//        } catch (Exception e) {
//            _s = null;
//        }
//
//        res = decrypt(_s);
//        System.out.println(res);
//    }
//}
