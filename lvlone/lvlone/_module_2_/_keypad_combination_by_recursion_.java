package _module_2_;

import java.util.*;
public class _keypad_combination_by_recursion_ {
    public static void main(String[] args){
        String[] arr= new String[]{"?!","abc","def","ghi","jkl","mnop","qrst","uv","wxyz",".;"};
        String comb= "786";
        ArrayList<String> disp= getComb(arr,comb);
        System.out.println(disp);
    }
    public static ArrayList<String> getComb(String[] arr,String comb){
        if(comb.length()==0){
            ArrayList<String> bgc= new ArrayList<>();
            bgc.add("");
            return bgc;
        }
        int c= comb.charAt(0)-'0';
        ArrayList<String> sgc= getComb(arr,comb.substring(1));
        String str= arr[c];
        ArrayList<String> fgc= new ArrayList<>();
        for(String val: sgc){
           for(int i=0;i<str.length();i++){
               char ch= str.charAt(i);
               fgc.add(ch+val);
           }
        }
        return fgc;
    }
}
