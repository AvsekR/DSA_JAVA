package _module_1_;

import java.util.Scanner;
public class _gcd_lcm_{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter first number-");
        int n1= sc.nextInt();
        System.out.println("Enter second number-");
        int n2= sc.nextInt();
        int temp1= n1;
        int temp2= n2;
        int rem=0;
        while(temp1 % temp2 != 0){
            rem= temp1 % temp2;
            temp1= temp2;
            temp2= rem;
        }
        System.out.println("GCD of the these numbers is "+rem);
        System.out.println("LCM of the these numbers is "+(n1*n2)/rem);
    }
}
