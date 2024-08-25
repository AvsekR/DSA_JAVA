package _module_3_;

import java.util.*;
public class _subsets_of_array_by_recursion_ {
    public static void main(String[] args){
       String str= "abcd";
       ArrayList<String> disp= gss(str);
       System.out.println(disp);
    }
    public static ArrayList<String> gss(String str){
        if(str.length()==0){
            ArrayList<String> bgss= new ArrayList<>();
            bgss.add("");
            return bgss;
        }
        char c= str.charAt(0);
        ArrayList<String> sgss= gss(str.substring(1));
        ArrayList<String> fsgss= new ArrayList<>();
        for(String itr: sgss){
            fsgss.add(""+itr);
        }
        for(String itr: sgss){
            fsgss.add(c+itr);
        }
        return fsgss;
    }
}
