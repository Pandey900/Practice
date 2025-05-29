package arrays;

import java.util.Scanner;

public class PairsInArray {
    public static void printPairs(int arr[]){
        for (int i=0;i<arr.length;i++){
            for(int j=i+1;j< arr.length;j++){
                System.out.print("("+arr[i]+","+arr[j]+")");
            }
            System.out.println();
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int size=sc.nextInt();
        int arr[]=new int[size];
        System.out.println("Enter the elements of the array:");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        printPairs(arr);
    }
}
