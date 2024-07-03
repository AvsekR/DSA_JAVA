package _module_1_;

import java.util.Scanner;
public class _is_prime_{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number-");
        int num= sc.nextInt();
        int flag=1;
        for(int j=2;j<=(int)Math.pow(num,(float)1/2);j++){
            if(num%j==0 && num!=2){
                flag=0;
                break;
            }
        }
        if(flag==1){
            System.out.println("prime");
        }
        else{
            System.out.println("not prime");
        }
    }
}
