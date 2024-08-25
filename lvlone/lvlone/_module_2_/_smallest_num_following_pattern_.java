package _module_2_;
import java.util.*;
public class _smallest_num_following_pattern_{
    public static void main(String[] args){
        String str= "ddiidiid";
        Stack<Integer> st= new Stack<>();
        int i= 0;
        int cnt= 1;
        while(i<str.length()){
            char c= str.charAt(i);
            if(c=='d'){
                st.push(cnt);
                cnt++;
            }
            else{
                st.push(cnt);
                cnt++;
                while(st.size()!=0){
                    System.out.println(st.pop());
                }
            }
            i++;
        }
        st.push(cnt);
        while(st.size()!=0){
            System.out.println(st.pop());
        }
    }
}
