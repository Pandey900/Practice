package arrays;

import java.util.Scanner;

public class LinearSearch {
    public static int linearSearch(int arr[],int key){
        for (int i=0;i<arr.length;i++){
            if (arr[i]==key){
                return i;
            }
        }
        return 0;
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
        System.out.println("Enter the key you want to search:");
        int key= sc.nextInt();
        int index=linearSearch(arr,key);
        if (index==0){
            System.out.println("Element not present in the array");
        }else {
            System.out.println("Element found at index:"+index);
        }
    }
}
