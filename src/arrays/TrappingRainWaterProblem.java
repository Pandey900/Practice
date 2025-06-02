package arrays;

import java.util.Scanner;

public class TrappingRainWaterProblem {
    public static int trappingRainWater(int arr[]){
        int n=arr.length;
        int leftMax[]=new int[n];
        leftMax[0]=arr[0];
        for(int i=1;i<n;i++){
            leftMax[i]=Math.max(arr[i],leftMax[i-1]);
        }
        int rightMax[]=new int[n];
        rightMax[n-1]=arr[n-1];
        for (int i=n-2;i>=0;i--){
            rightMax[i]=Math.max(arr[i],rightMax[i+1]);
        }
        int trappedWater=0;
        for(int i=0;i<n;i++){
            int waterLevel=Math.min(leftMax[i],rightMax[i]);
            trappedWater+=waterLevel-arr[i];
        }
        return trappedWater;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int size= sc.nextInt();
        int arr[]=new int[size];
        System.out.println("Enter the elements of the array:");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(trappingRainWater(arr));
    }
}
