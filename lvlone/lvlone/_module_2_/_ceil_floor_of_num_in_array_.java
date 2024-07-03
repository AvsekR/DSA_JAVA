package _module_2_;

import java.util.Scanner;

public class _ceil_floor_of_num_in_array_ {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the size of array-");
        int n= sc.nextInt();
        int[] arr= new int[n];
        System.out.println("Enter the values at indexes of array-");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the no. you wanna find floor and ceil of-");
        int k= sc.nextInt();
        int l=0;
        int h= arr.length-1;
        int m=0;
        int floor=0;
        int ceil=0;
        while(h>=l){
            m=(l+h)/2;
            if(k>arr[m]){
                l=m+1;
                floor=arr[m];
            }
            else if(k<arr[m]){
                h=m-1;
                ceil=arr[m];
            }
            else{
                ceil=floor=arr[m];
                break;
            }
        }
        System.out.println("Floor of "+ k +" is "+ floor);
        System.out.println("Ceil of "+ k +" is "+ ceil);
    }
}
