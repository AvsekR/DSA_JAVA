package _module_2_;

import java.util.Stack;
public class _celebrity_problem_{
    public static void main(String[] args){
       int[][] arr= new int[][]{{0,1,1,1,1},
                                {1,0,0,1,0},
                                {1,0,0,1,0},
                                {0,0,0,0,0},
                                {0,1,0,1,0}};
       Stack<Integer> st= new Stack<>();
       for(int i=0;i<arr.length;i++){
           st.push(i);
       }
       while(st.size()!=1){
           int v1= st.pop();
           int v2= st.pop();
           int check= arr[v2][v1];
           if(check==0){
               st.push(v2);
           }
           else{
               st.push(v1);
           }
       }
       for(int i=0,j=st.peek();i<arr.length;i++){
            if(arr[i][j]==0 && j!=st.peek()){
                System.out.println("None of them is a celebrity");
                return;
            }
       }
        System.out.println(st);
       for(int j=0, i=st.peek();j<arr[0].length;j++){
           if(arr[i][j]==1){
               System.out.println("None of them is a celebrity");
               return;
           }
           else{
               System.out.println(st.peek()+ " is the celebrity.");
               break;
           }
       }
    }
}
