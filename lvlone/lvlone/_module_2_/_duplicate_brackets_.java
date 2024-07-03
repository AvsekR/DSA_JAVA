package _module_2_;

import java.util.Scanner;
import java.util.Stack;

public class _duplicate_brackets_ {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the expression-");
        String str= sc.nextLine();
        Stack <Character> st= new Stack<>();
        for(int i=0;i<str.length();i++){
            char temp = str.charAt(i);
            if(temp==')'){
                if(st.peek()=='('){
                    System.out.println("The expression does have duplicate brackets.");
                    return;
                }else{
                    while(st.peek()!='('){
                        st.pop();
                    }
                    st.pop();
                }
            }
            else{
                st.push(temp);
            }
        }
        System.out.println("The expression does not have any duplicate brackets.");
    }
}
