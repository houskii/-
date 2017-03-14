//package 面试真题;
//
//import java.util.Scanner;
//
///**
// * Created by Houskii on 17/3/7.
// */
//public class 序列和 {
//    public static void main(String[] args){
//        Scanner scanner = new Scanner(System.in);
//        int number = 0,len = 0;
////        while(scanner.hasNextInt()){
//            number = scanner.nextInt();
//            len = scanner.nextInt();
////        }
//        if(number<0||len<=0){
//            return;
//        }
//
//
//
//
////        int small = number/len,big = number/len+1;
////        int limit = number/100;
////        int shortest = Integer.MAX_VALUE;
////        int short_end = -1;
////        int sum = big,size = 1;
////        while(small>0 && big>limit){
////            while(sum<number){
////                sum+=small;
////                small--;
////                size++;
////            }
////            System.out.println("small: "+small);
////            while(sum>number){
////                sum-=big;
////                big--;
////                size--;
////            }
////            System.out.println("big: "+big);
////            if(sum==number){
////                if(size<shortest && size>=len){
////                    shortest = size+1;
////                    short_end = big;
////                    break;
////                }
////                sum+=small;
////                size++;
////            }
////        }
////
////        if(shortest == Integer.MAX_VALUE || shortest>100){
////            System.out.print("No");
////            return;
////        }
////        for(int i = shortest-2;i>=0;i--){
////            if(i==0){
////                System.out.print(short_end-i);
////            }else{
////                System.out.print(short_end-i + " ");
////            }
////        }
//
//
//    }
//}
