package _module_2_;

import java.util.Scanner;
import java.util.Stack;

public class _balanced_brackets_ {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the expression-");
        String str= sc.nextLine();
        Stack<Character> st= new Stack<>();
        for(int i=0;i<str.length();i++){
            char temp= str.charAt(i);
            if(temp==')'){
                if(st.isEmpty()){
                    System.out.println("The brackets in this expression are not balanced.");
                    return;
                }
                else{
                    while(st.peek()!='('){
                        st.pop();
                    }
                    st.pop();
                }
            }
            else if(temp=='}'){
                if(st.isEmpty()){
                    System.out.println("The brackets in this expression are not balanced.");
                    return;
                }
                else{
                    while(st.peek()!='{'){
                        st.pop();
                    }
                    st.pop();
                }
            }
            else if(temp==']'){
                if(st.isEmpty()){
                    System.out.println("The brackets in this expression are not balanced.");
                    return;
                }
                else{
                    while(st.peek()!='['){
                        st.pop();
                    }
                    st.pop();
                }
            }
            else{
                st.push(temp);
            }
        }
        System.out.println(st.isEmpty());
    }
}
