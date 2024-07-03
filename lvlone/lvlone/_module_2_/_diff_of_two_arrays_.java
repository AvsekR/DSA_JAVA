package _module_2_;

import java.util.Scanner;

public class _diff_of_two_arrays_ {
    public static void main(String[] args){
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter the no. of digits in first array-");
    int n1= sc.nextInt();
    int[] arr1= new int[n1];
    System.out.println("Enter the values at indexes-");
    for(int i=0;i<arr1.length;i++){
        arr1[i]= sc.nextInt();
    }
    System.out.println("Enter the no. of digits in second array-");
    int n2= sc.nextInt();
    int[] arr2= new int[n2];
    System.out.println("Enter the values at indexes-");
    for(int i=0;i<arr2.length;i++){
        arr2[i]=sc.nextInt();
    }
    int[] diff= new int[Math.max(n1,n2)];
    int i= arr1.length-1;
    int j= arr2.length-1;
    int k= diff.length-1;
    int c=0;
    while(k>=0){
        int digit1= arr1[i];
        int digit2= j>=0 ? arr2[j] : 0;
        int d= digit1-digit2+c;
        if(d<0){
            d+=10;
            c=-1;
        }
        else{
            c=0;
        }
        diff[k]=d;
        i--;
        j--;
        k--;
    }
    System.out.println("Digits of Differenced array are-");
    int idx=0;
    while(idx<diff.length){
        if(diff[idx]==0){
            idx++;
        }
        else{
            break;
        }
    }
    for(int f=idx;f<diff.length;f++){
        System.out.println(diff[f]);
    }
    }
}
