package _module_3_;
public class _print_subsets_of_string_ {
    public static void main(String[] args){
        String str= "abc";
        pss(str,"");
    }
    public static void pss(String str,String ans){
        if(str.length()==0){
            System.out.println(ans);
            return;
        }
        char c= str.charAt(0);
        String strn= str.substring(1);
        pss(strn,ans+"");
        pss(strn,ans+c);
    }
}
