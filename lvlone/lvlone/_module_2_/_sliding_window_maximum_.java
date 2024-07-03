package _module_2_;

import java.util.Scanner;
import java.util.Stack;

public class _sliding_window_maximum_ {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array-");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the values at indexes of array-");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the sliding window Size-");
        int k = sc.nextInt();
//        int[] swm= new int[arr.length-k+1];
//        for(int i=0;i<swm.length;i++){
//           int temp= i;
//           swm[i]=arr[i];
//           while(temp<i+k){
//               if(arr[temp]>swm[i]){
//                   swm[i]=arr[temp];
//                   temp++;
//               }
//               else{
//                   temp++;
//               }
//           }
//        }
//        System.out.println("Values at indexes of desired array are- ");
//        for(int i=0;i<swm.length;i++){
//            System.out.print(swm[i] + "\t");
//        }
//    }
//}


//  Above is a intuitive/brute-force approach but by using stack the space-time complexity can significantly be
//  reduced.



    }
}