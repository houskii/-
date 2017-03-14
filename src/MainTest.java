import bean.*;
import org.apache.batik.dom.util.HashTable;
import 二叉树问题.*;
import 字符串问题.*;
import 排序问题.*;
import 栈和队列.*;
import 链表问题.*;
import 面试真题.*;

import java.lang.*;
import java.lang.reflect.Array;
import java.math.BigInteger;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by Houskii on 17/2/4.
 * 上大学的小明为了完成计算机课作业，开发了款简单的聊天APP，没想到这个APP在学校里挺流行，同学们经常用这个APP来互发消息，但用了一段时间以后，有同学的指出这个APP以明文发送信息，安全性太差，要求小明对信息内容至少要做一个简单的加密。小明略加思考，想出了一个方案，步骤如下：
 * 1） 如果原文为字串s， 则在发送前先将s转换为UTF-8编码，然后按位取反，再将数据以字节为单位反转顺序，得到新的字节数组
 * 2） 取出新字节数组的每一字节，为其生成一个0到100的随机数，用该字节减于随机数，得到的结果作为一个32位整数的最后8位，而随机数按位取反后则作为该整数的9至16位，从而生成一个新的整数，以此类推，得到一个整形数组d
 * 3） 将该整形数组发送给接收方，对方解密后得到原文内容s
 * 输入范例:
 * 56477,56465,51835,63190,44858,62933,40492
 * 输出范例:
 * r u OK?
 */
public class MainTest {
    public static void main(String[] args) {
        MainTest test = new MainTest();
        int[] arr = {1,3,2,6,4};
        System.out.println(test.isContinuous(arr));
    }

    public boolean isContinuous(int [] numbers) {
        int len = numbers.length;
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
        return dif-arr[0]<=0?true:false;
    }
}
