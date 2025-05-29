package arrays;

import java.util.Scanner;

public class BinarySearch {
    public static int binarySearch(int arr[],int key){
        int si=0;
        int ei=arr.length-1;
        while (si<=ei){
            int mid=si+(ei-si)/2;
            if(arr[mid]==key){
                return mid;
            }
            if(arr[mid]<key){
                si=mid+1;
            }else{
                ei=mid-1;
            }
        }
        return -1;
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
        System.out.println(binarySearch(arr,key));
    }
}
