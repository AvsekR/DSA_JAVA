package _module_2_;
public class _rat_in_a_maze_ {
    public static void main(String[] args){
       int r= 6;
       int c= 7;
       int[][] maze= new int[][]{{0,1,0,0,0,0,0},
                                 {0,1,0,1,1,1,0},
                                 {0,0,0,0,0,0,0},
                                 {1,0,1,1,0,1,1},
                                 {1,0,1,1,0,1,1},
                                 {1,0,0,0,0,0,0}};
       boolean[][] visited= new boolean[r][c];
       printPaths(maze,0,0,"",visited);
    }
    public static void printPaths(int[][] maze,int sr,int sc,String ans,boolean[][] visited){
        if(sr==maze.length-1 && sc==maze[0].length-1){
            System.out.println(ans);
            return;
        }
        if(sr<0 || sc<0 || sr==maze.length || sc==maze[0].length || maze[sr][sc]==1 || visited[sr][sc]){
            return;
        }
        visited[sr][sc]= true;
        printPaths(maze,sr+1,sc,ans+" down ",visited);
        printPaths(maze,sr,sc-1,ans+" left ",visited);
        printPaths(maze,sr-1,sc,ans+" up ",visited);
        printPaths(maze,sr,sc+1,ans+" right ",visited);
        visited[sr][sc]=false;
    }
}

