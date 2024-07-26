package _module_2_;

import java.util.*;
public class _stair_paths_ {
    public static void main(String[] args){
        int n=5;
        ArrayList<String> disp= getPaths(n);
        System.out.println(disp);
    }
    public static ArrayList<String> getPaths(int n){
        if(n==0){
            ArrayList<String> base= new ArrayList<>();
            base.add("");
            return base;
        }
        else if(n<0){
            ArrayList<String> base= new ArrayList<>();
            return base;
        }
        ArrayList<String> one= getPaths(n-1);
        ArrayList<String> two= getPaths(n-2);
        ArrayList<String> three= getPaths(n-3);
        ArrayList<String> paths= new ArrayList<>();
        for(String path: one){
            paths.add("1"+path);
        }
        for(String path: two){
            paths.add("2"+path);
        }
        for(String path: three){
            paths.add("3"+path);
        }
        return paths;
    }
}
