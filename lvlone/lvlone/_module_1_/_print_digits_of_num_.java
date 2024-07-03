package _module_1_;

import java.util.Scanner;
public class _print_digits_of_num_{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number-");
        int num= sc.nextInt();
        int temp= num;
        int nod=0;
        while(temp!=0){
            nod++;
            temp= temp/10;
        }
        int div= (int)Math.pow(10,nod-1);
        while(div!=0){
            int q= num/div;
            System.out.println(q);
            num= num%div;
            div= div/10;
        }
    }
}



/*
import java.util.Scanner;
public class chap._print_digits_of_num_{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int num= sc.nextInt();
        int temp= num;
        int nod= 0;
        while(temp!=0) {
            temp= temp/10;
            nod++;
        }
        int[] arr= new int[nod];
        for(int i= nod-1;i>=0;i--){
            while(num!=0){
                arr[i]= num%10;
                num= num/10;
                break;
            }
        }
        for(int i= 0;i<=nod-1;i++){
            System.out.println(arr[i]);
        }
    }
}
*/
