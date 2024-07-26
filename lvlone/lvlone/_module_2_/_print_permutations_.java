package _module_2_;
public class _print_permutations_ {
    public static void main(String[] args){
       String str= "abcd";
       pPerm(str,"");
    }
    public static void pPerm(String str,String ans){
        if(str.length()==0){
            System.out.println(ans);
            return;
        }
        for(int i=0;i<str.length();i++){
            char c= str.charAt(i);
            String strn= str.substring(0,i)+str.substring(i+1);
            pPerm(strn,ans+c);
        }
    }

}
