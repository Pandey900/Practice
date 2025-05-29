package arrays;

import java.util.Scanner;

public class LargestAndSmallest {
    public static int largestAndSmallest(int arr[]){
        int largest=Integer.MIN_VALUE;
        int smallest=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>largest){
                largest=arr[i];
            }
            if (arr[i]<smallest){
                smallest=arr[i];
            }
        }
        System.out.println(smallest);
        return largest;
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
        System.out.println(largestAndSmallest(arr));
    }
}
