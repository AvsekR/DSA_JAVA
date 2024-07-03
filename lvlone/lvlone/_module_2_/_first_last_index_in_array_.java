package _module_2_;

import java.util.Scanner;

public class _first_last_index_in_array_ {
    public static void main(String[] args){
            Scanner sc= new Scanner(System.in);
            System.out.println("Enter the size of array-");
            int n= sc.nextInt();
            int[] arr= new int[n];
            System.out.println("Enter the values at indexes of array-");
            for(int i=0;i<arr.length;i++){
                arr[i]=sc.nextInt();
            }
            System.out.println("Enter the no. you wanna find first and last index of-");
            int k= sc.nextInt();
            int l=0;
            int h= arr.length-1;
            int m=0;
            int st=0;
            int lst=0;
            while(h>=l){
                m=(l+h)/2;
                if(k>arr[m]){
                    l=m+1;
                }
                else if(k<arr[m]){
                    h=m-1;
                }
                else{
                    int x=m;
                    while(arr[x]==k){
                        st=x;
                        x=x-1;
                    }
                    while(arr[m]==k){
                        lst=m;
                        m=m+1;
                    }
                    break;
                }
            }
             System.out.println("First index of "+ k + "is - "+ st);
             System.out.println("Last index of "+ k + "is - "+ lst);
        }
}

// This is not an ideal solution