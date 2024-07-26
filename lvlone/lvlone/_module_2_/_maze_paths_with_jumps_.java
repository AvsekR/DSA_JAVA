package _module_2_;

import java.util.*;
public class _maze_paths_with_jumps_ {
    public static void main(String[] args){
        int r= 3;
        int c= 3;
        ArrayList<String> disp= getPaths(1,1,r,c);
        System.out.println(disp);
    }
    public static ArrayList<String> getPaths(int sr,int sc,int dr,int dc){
        if(dc==sc && dr==sr){
            ArrayList<String> base= new ArrayList<>();
            base.add("");
            return base;
        }
        ArrayList<String> paths= new ArrayList<>();
        for(int s=1;s<=dc-sc;s++){
            ArrayList<String> hrz= getPaths(sr,sc+s,dr,dc);
            for(String path: hrz){
                paths.add(" hrz"+s+path);
            }
        }
        for(int s=1;s<=dr-sr;s++){
            ArrayList<String> vrt= getPaths(sr+s,sc,dr,dc);
            for(String path: vrt){
                paths.add(" vrt"+s+path);
            }
        }
        for(int s=1;s<=dc-sc && s<=dr-sr;s++){
            ArrayList<String> dgn= getPaths(sr+s,sc+s,dr,dc);
            for(String path: dgn){
                paths.add(" dgn"+s+path);
            }
        }
        return paths;

    }
}
