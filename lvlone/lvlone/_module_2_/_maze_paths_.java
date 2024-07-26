package _module_2_;

import java.util.*;
public class _maze_paths_ {
    public static void main(String[] args){
        int r= 3;
        int c= 3;
        ArrayList<String> disp= getPaths(1,1,r,c);
        System.out.println(disp);
    }
    public static ArrayList<String> getPaths(int sr,int sc,int dr,int dc){
        if(sr==dr && sc==dc){
            ArrayList<String> base= new ArrayList<>();
            base.add("");
            return base;
        }
        ArrayList<String> hrz= new ArrayList<>();
        ArrayList<String> vrt= new ArrayList<>();
        if(sc<dc){
            hrz= getPaths(sr,sc+1,dr,dc);
        }
        if(sr<dr){
            vrt= getPaths(sr+1,sc,dr,dc);
        }
        ArrayList<String> paths= new ArrayList<>();
        for(String path: hrz){
            paths.add(" hrz "+path);
        }
        for(String path: vrt){
            paths.add(" vrt "+path);
        }
        return paths;
    }
}
