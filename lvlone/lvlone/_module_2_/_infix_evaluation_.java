package _module_2_;

import java.util.Scanner;
import java.util.Stack;

public class _infix_evaluation_ {
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
    public static int operation(int v1, int v2, char c){
        switch(c){
            case '+':
                return v1+v2;
            case '-':
                return v1-v2;
            case '*':
                return v1*v2;
            case '/':
                return v1/v2;
            default:
                throw new IllegalArgumentException("Invalid Operator");
        }
    }
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the infix exp you want to evaluate-");
        String exp= sc.nextLine().replaceAll("\\s","");
        Stack <Integer> oprnds= new Stack<>();
        Stack <Character> oprtrs= new Stack<>();
        for(int i=0;i<exp.length();i++){
            char ch= exp.charAt(i);
            if(ch=='('){
                oprtrs.push(ch);
            }
            else if(Character.isDigit(ch)){
                int num=0;
                while(i<exp.length() && Character.isDigit(exp.charAt(i))){
                    num= num*10 + (exp.charAt(i)-'0');
                    i++;
                }
                i--;
                oprnds.push(num);
            }
            else if(ch==')'){
                while(oprtrs.peek()!='('){
                    int v2= oprnds.pop();
                    int v1= oprnds.pop();
                    char oprtrl= oprtrs.pop();
                    int out= operation(v1,v2,oprtrl);
                    oprnds.push(out);
                }
                oprtrs.pop();
            }
            else if(ch=='+' || ch=='-' || ch=='*' || ch=='/' ){
                while(oprtrs.size()!=0 && prcdnc(ch)<=prcdnc(oprtrs.peek()) && oprtrs.peek()!='('){
                    int v2= oprnds.pop();
                    int v1= oprnds.pop();
                    char oprtrl= oprtrs.pop();
                    int out= operation(v1,v2,oprtrl);
                    oprnds.push(out);
                }
                oprtrs.push(ch);
            }
        }
        while(oprtrs.size()!=0){
            int v2= oprnds.pop();
            int v1= oprnds.pop();
            char oprtrl= oprtrs.pop();
            int out= operation(v1,v2,oprtrl);
            oprnds.push(out);
        }
        System.out.println("The value of the entered exp is- "+ oprnds.peek());
    }
}
