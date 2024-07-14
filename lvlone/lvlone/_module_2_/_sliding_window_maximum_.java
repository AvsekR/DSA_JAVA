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


//  Above is an intuitive/brute-force approach but by using stacks the space-time complexity can significantly be
//  reduced.
//  Hint- Check if the farthest next greater element of any element lies in that window or not



    int[] nge= new int[n];
    Stack <Integer> st= new Stack<>();
    st.push(0);
    for(int i=1;i<arr.length;i++){
        while(st.size()!=0 && arr[i]>arr[st.peek()]){
            nge[st.peek()]=i;
            st.pop();
        }
        st.push(i);
    }
    while(st.size()!=0){
        nge[st.peek()]=arr.length;
        st.pop();
    }
    System.out.println("The values at the indexes of desired array are-");
    int j=0;
    for(int i=0;i<=arr.length-k;i++){
        if(j<i){
            j=i;
        }
        while(nge[j]<i+k){
            j=nge[j];
        }
        System.out.print(arr[j]+"\t");
    }
    }
}