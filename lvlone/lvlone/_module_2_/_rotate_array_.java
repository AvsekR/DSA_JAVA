package _module_2_;

import java.util.Scanner;

public class _rotate_array_ {
    public static void reverseArray(int[] arr,int i,int j){
        int st=i;
        int en=j;
        while( st<=(i+j)/2 ){
            int temp=arr[st];
            arr[st]=arr[en];
            arr[en]=temp;
            st++;
            en--;
        }
    }

    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the size of array-");
        int n= sc.nextInt();
        int[] arr= new int[n];
        System.out.println("Enter the values at indexes of array-");
        for(int i=0; i<arr.length;i++){
            arr[i]= sc.nextInt();
        }
        System.out.println("How many times do you want to rotate the array?-");
        int k= sc.nextInt();
        k= k%arr.length;
        if(k<0) {
            k= k+arr.length;
        }
        reverseArray(arr,0,n-1-k);
        reverseArray(arr,n-k,n-1);
        reverseArray(arr,0,n-1);
        System.out.println("Digits of rotated array are-");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
