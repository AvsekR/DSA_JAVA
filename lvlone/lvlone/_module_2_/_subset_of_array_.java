package _module_2_;

import java.util.Scanner;

public class _subset_of_array_ {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the size of array-");
        int n= sc.nextInt();
        int[] arr= new int[n];
        System.out.println("Enter the values at indexes of array-");
        for(int i=0;i<arr.length;i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Subsets of the array are-");
        int limit= (int)Math.pow(2,arr.length);
        for(int i=0;i<limit;i++){
            int temp=i;
            for(int j=arr.length-1;j>=0;j--){
                int r=temp%2;
                temp=temp/2;
                int t=arr[j];
                t=t*r;
                if(t!=0){
                    System.out.print(t+"\t");
                }
                else{
                    System.out.print("-\t");
                }
            }
            System.out.println("");
        }
    }
}

// Ideal approach-
// public class _subset_of_array_ {
//    public static void main(String[] args){
//        Scanner sc= new Scanner(System.in);
//        System.out.println("Enter the size of array-");
//        int n= sc.nextInt();
//        int[] arr= new int[n];
//        System.out.println("Enter the values at indexes of array-");
//        for(int i=0;i<arr.length;i++) {
//            arr[i] = sc.nextInt();
//        }
//        System.out.println("Subsets of the array are-");
//        int limit= (int)Math.pow(2,arr.length);
//        for(int i=0;i<limit;i++){
//            String set= "";
//            int temp=i;
//            for(int j=arr.length-1;j>=0;j--){
//                int r=temp%2;
//                temp=temp/2;
//                if(r==0){
//                    set= "-\t" + set;
//                }
//                else{
//                    set= arr[j] + "\t"+ set;
//                }
//            }
//            System.out.println(set);
//        }
//    }
//}
