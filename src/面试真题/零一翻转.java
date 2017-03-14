//package 面试真题;
//
//import java.util.Scanner;
//
///**
// * Created by Houskii on 17/3/7.
// */
//public class 零一翻转 {
//    public static void main(String[] args){
//        Scanner scanner = new Scanner(System.in);
//        int a = scanner.nextInt();
//        int b = scanner.nextInt();
//        int k = scanner.nextInt();
//        int times = 0;
//        while(a>k) {
//            a -= k;
//            b += k;
//            times++;
//        }
//
//        while(a<k){
//            int tmp = k-a;
//            if(k%2==1){
//                if(a%2==0){
//                    a += tmp;
//                    b -= tmp;
//                    times++;
//                    break;
//                }
//                b -= a-tmp;
//                a += a-tmp;
//                times++;
//            }else {//k为偶数
//                if(a%2==1){//a为奇数
//                    System.out.println(-1);
//                    return;
//                }else {//a为偶数
//                        a += tmp;
//                        b -= tmp;
//                        times++;
//                        break;
//                }
//            }
//        }
//
//        if(a==k){
//            times++;
//            System.out.println(times);
//        }
//
//
//
//
//    }
//}
