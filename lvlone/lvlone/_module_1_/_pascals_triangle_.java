package _module_1_;

import java.util.Scanner;
public class _pascals_triangle_{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the size of pascal's triangle-");
        int n= sc.nextInt();
        for(int i=0;i<n;i++){
            int icj=1;
            for(int j=0;j<=i;j++){
                System.out.print(icj+"\t");
                 icj= icj*(i-j)/(j+1);
            }
            System.out.println();
        }
    }
}
