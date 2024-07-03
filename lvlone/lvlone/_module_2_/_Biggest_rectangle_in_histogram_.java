package _module_2_;

import java.util.Scanner;
import java.util.Stack;

public class _Biggest_rectangle_in_histogram_ {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the size of array-");
        int n= sc.nextInt();
        int[] arr= new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]= sc.nextInt();
        }
//        int max=0;
//        for(int i=0;i<arr.length;i++){
//            if(arr[i]>max){
//                max=arr[i];
//            }
//        }
//        int area=0;
//        for(int i=1;i<=max;i++){
//           int cnt=0;
//           int tempArea=0;
//           for(int j=0;j<arr.length;j++){
//               if(arr[j]>=i){
//                   ++cnt;
//                   tempArea=cnt*i;
//                   if(tempArea>area){
//                       area=tempArea;
//                   }
//               }
//               else{
//                   cnt=0;
//               }
//           }
//
//        }
//        System.out.println(area);


// Although above approach is quite intuitive but its time complexity is high
// Below is stack based approach and has lower time complexity
// Here the idea is to find the next smaller element to the right and to the left for all the elements, difference
// of these gives width of possible rectangle, and then the area can be calculated


        int[] rb= new int[arr.length];
        Stack <Integer> st= new Stack<>();
        int maxArea=0;
        st.push(0);
        for(int i=1;i<arr.length;i++){
            while(st.size()!=0 && arr[i]<=arr[st.peek()]){
                rb[st.peek()]=i;
                st.pop();
            }
            st.push(i);
        }
        while(st.size()!=0){
            rb[st.peek()]=arr.length;
            st.pop();
        }
        st.push(arr.length-1);
        int[] lb= new int[arr.length];
        st.push(arr.length-1);
        for(int i=arr.length-2;i>=0;i--){
            while(st.size()!=0 && arr[i]<=arr[st.peek()]){
                lb[st.peek()]=i;
                st.pop();
            }
            st.push(i);
        }
        while(st.size()!=0){
            lb[st.peek()]=-1 ;
            st.pop();
        }
        for(int i=0;i<arr.length;i++){
            int width= rb[i]-lb[i]-1;
            int area= width*arr[i];
            if(area>maxArea){
                maxArea=area;
            }
        }
        System.out.println("Area of biggest rectangle is- "+ maxArea);
    }
}
