package _module_1_;

import java.util.Scanner;
public class _prime_factorization_{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number-");
        int n= sc.nextInt();
        System.out.println("Prime Factors of this number are-");
        for(int i=2;i<=(int) Math.pow(n,(float)1/2);i++){
           while(n%i == 0){
               System.out.println(i);
               n= n/i;
            }
        }
        if(n!=1){
            System.out.println(n);
        }
    }
}
