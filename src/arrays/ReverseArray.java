package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseArray {
    public static int[] reverse(int arr[]){
        int l=0;
        int r=arr.length-1;
        while (l<r){
            int temp=arr[l];
            arr[l]=arr[r];
            arr[r]=temp;
            l++;
            r--;
        }
        return arr;
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
        System.out.println(Arrays.toString(reverse(arr)));
    }
}
