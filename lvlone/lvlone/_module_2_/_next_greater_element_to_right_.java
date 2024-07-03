package _module_2_;

import java.util.Scanner;
import java.util.Stack;

public class _next_greater_element_to_right_ {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the size of array-");
        int n= sc.nextInt();
        System.out.println("Enter the values at indexes of array-");
        int[] arr= new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int[] nge= new int[arr.length];
        Stack <Integer> st= new Stack<>();
        st.push(arr.length-1);
        nge[arr.length-1]=-1;
        System.out.println("The digits of required array are-");
        for(int i=arr.length-2;i>=0;i--){
            int temp= arr[i];
            if(temp>=st.peek()){
                while(st.size()!=0 && temp>st.peek()){
                    st.pop();
                }
                if(st.size()!=0 && st.peek()>temp){
                    nge[i]=st.peek();
                }
                else{
                    nge[i]=-1;
                }
                st.push(temp);
            }
            else if(temp<st.peek()){
                nge[i]=st.peek();
                st.push(temp);
            }
        }
        for(int i=0;i<arr.length;i++){
            System.out.println(nge[i]);
        }
//    }
//}

// Although the complexity of this code seems to be O(n^2) but it's not, it is O(n) only because the inner while loop
// is not executed in all iterations

// The above algorithm is based on right-to-left traversal but below algorithm is a slightly better approach as it can
// be used in other problems like "next greater element to left","next smaller element to right",etc. and is based on
// left-to-right traversal

//        int[] arr = new int[]{2, 5, 9, 3, 1, 12, 6, 8, 7};
//        int[] nge= new int[arr.length];
//        Stack <Integer> st= new Stack<>();
//        st.push(0);
//        for(int i=1;i<arr.length;i++){
//            while(st.size()>0 && arr[i]>arr[st.peek()]){
//                int pos= st.peek();
//                nge[pos]=arr[i];
//                st.pop();
//            }
//            st.push(i);
//        }
//        while(st.size()>0){
//            int pos= st.peek();
//            nge[pos]= -1;
//            st.pop();
//        }
//        for(int i=0;i<arr.length;i++){
//            System.out.println(nge[i]);
//        }
    }
}