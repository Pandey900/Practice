package arrays;

import java.util.Map;
import java.util.Scanner;

public class MaxSubArraySumKadanes {
//    public static void kadanes(int arr[]){
//        int currSum=0;
//        int maxSum=Integer.MIN_VALUE;
//        int minSum=Integer.MAX_VALUE;
//        for(int i=0;i<arr.length;i++){
//            currSum+=arr[i];
//            if (currSum<0){
//                minSum= Math.min(currSum,minSum);
//            }
//            if (currSum<0){
//                currSum=0;
//            }
//            maxSum=Math.max(currSum,maxSum);
//        }
//        System.out.println("Minimum SubArray Sum:"+minSum);
//        System.out.println("maximum SubArray Sum:"+maxSum);
//    }
    public static void kadanes(int arr[]){
        int currMin=0;
        int currSum=0;
        int maxSum=Integer.MIN_VALUE;
        int minSum=Integer.MAX_VALUE;
        for(int i=0;i< arr.length;i++){
            currSum+=arr[i];
            maxSum=Math.max(currSum,maxSum);
            if (currSum<0){
                currSum=0;
            }
         currMin+=arr[i];
            minSum=Math.min(currMin,minSum);
            if (currMin>0){
                currMin=0;
            }
        }
        System.out.println("Maximum SubArray Sum is:"+maxSum);
        System.out.println("Minimum SubArray Sum is:"+minSum);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int size= sc.nextInt();
        int arr[]=new int[size];
        System.out.println("Enter the elements of the array:");
        for(int i=0;i<size;i++){
            arr[i]= sc.nextInt();
        }
        kadanes(arr);
    }
}
