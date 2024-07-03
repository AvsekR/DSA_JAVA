package _module_1_;

import  java.util.Scanner;
public class _rotate_num_{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number-");
        int n= sc.nextInt();
        System.out.println("Enter the no of rotations-");
        int k= sc.nextInt();
        int temp= n;
        int nod= 0;
        while(temp!=0){
            nod++;
            temp=temp/10;
        }
        k= k%nod;
        if(k<0){
            k= k+nod;
        }
        int a= n%((int)Math.pow(10,k));
        int N1= a*(int)Math.pow(10,nod-k);
        int N2= n/(int)Math.pow(10,k);
        int RN= N1+N2;
        System.out.println(RN);
    }
}