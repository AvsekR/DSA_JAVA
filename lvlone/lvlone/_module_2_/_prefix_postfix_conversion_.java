package _module_2_;

import java.util.Scanner;
import java.util.Stack;
public class _prefix_postfix_conversion_ {
    public static int prcdnc(char c){
        switch(c){
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;
            default:
                return -1;  // for '(' so that +-*/ dont overpass brackets
        }
    }
    public static void process(Stack<String> pre, Stack<String> post, Stack<Character> op){
        String v2= pre.pop();
        String v1= pre.pop();
        String x2= post.pop();
        String x1= post.pop();
        char opr= op.pop();
        String preff= opr + v1 + v2;
        String suff= x1 + x2 + opr;
        pre.push(preff);
        post.push(suff);
    }
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the infix expression of which you want to print prefix and postfix-");
        String str= sc.nextLine();
        Stack <String> pre= new Stack<>();
        Stack <String> post= new Stack<>();
        Stack <Character> op= new Stack<>();
        for(int i=0;i<str.length();i++){
            char ch= str.charAt(i);
            if(Character.isLetterOrDigit(ch)){
                pre.push(ch+ "");
                post.push(ch+ "");
            }
            else if(ch=='('){
                op.push(ch);
            }
            else if(ch==')'){
                while(op.peek()!='(' && op.size()>0){
                    process(pre,post,op);
                }
                op.pop();
            }
            else if(ch=='+' || ch=='-' || ch=='*' || ch=='/'){
                while(op.size()>0 && prcdnc(ch)<=prcdnc(op.peek())){
                    process(pre,post,op);
                }
                op.push(ch);
            }
        }
        while(op.size()!=0){
            process(pre,post,op);
        }
        System.out.println("Prefix of the expression is- " + pre.peek());
        System.out.println("Postfix of the expression is- " + post.peek());
    }
}
