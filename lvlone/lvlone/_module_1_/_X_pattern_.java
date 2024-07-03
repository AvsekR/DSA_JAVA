package _module_1_;

import java.util.Scanner;
public class _X_pattern_ {
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the size of X-");
        int n= sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(i==j || i+j==n+1){
                    System.out.print("*\t");
                }
                else{
                    System.out.print("\t");
                }
            }
            System.out.println();
        }
    }
}