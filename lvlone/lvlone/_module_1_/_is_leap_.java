package _module_1_;

import java.util.Scanner;
public class _is_leap_{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter year");
        int yr= sc.nextInt();
        if(yr%400==0 || (yr%4==0  && yr%100!=0)){
            System.out.println("leap year");
        }
        else{
            System.out.println("not a leap year");
        }
    }
}
