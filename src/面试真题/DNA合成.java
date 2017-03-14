package 面试真题;

import java.util.Scanner;

/**
 * Created by Houskii on 17/3/8.
 */
public class DNA合成 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String str1 = in.next();
        String str2 = in.next();
        int length = str1.length();
        int count = 0,minCount = Integer.MAX_VALUE;
        for(int i = 0;i<length;i++){
            char c1 = str1.charAt(i);
            char c2 = str2.charAt(i);
            if(c1=='A'&& c2!='T') count++;
            if(c1=='C'&& c2!='G') count++;
            if(c1=='G'&& c2!='C') count++;
            if(c1=='T'&& c2!='A') count++;
        }
        if(count<minCount){
            minCount = count;
        }
        count = 0;
        for(int i = 0;i<length;i++){
            char c1 = str1.charAt(i);
            char c2 = str2.charAt(length-1-i);
            if(c1=='A'&& c2!='T') count++;
            if(c1=='C'&& c2!='G') count++;
            if(c1=='G'&& c2!='C') count++;
            if(c1=='T'&& c2!='A') count++;
        }

        if(count<minCount){
            minCount = count;
        }
        System.out.println(minCount);

    }
}
