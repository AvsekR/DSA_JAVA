package _module_3_;

public class _n_knights_tour_ {
    public static void main(String[] args){
        int n= 5;
        int x= 2;
        int y= 2;
        int[][] board= new int[n][n];
        pCords(board,x,y,1);
    }
    public static void pCords(int[][] board,int x,int y,int move){
            if(x<0 || y<0 || x>=board.length || y>=board.length || board[x][y]>0) {
                return;
            }
            else if(move==board.length*board.length) {
                board[x][y]=move;
                displayBoard(board);
                System.out.println();
                board[x][y]=0;
                return;
            }
            board[x][y]=move;
            pCords(board,x-2,y+1,move+1);
            pCords(board,x-1,y+2,move+1);
            pCords(board,x+1,y+2,move+1);
            pCords(board,x+2,y+1,move+1);
            pCords(board,x-2,y-1,move+1);
            pCords(board,x-1,y-2,move+1);
            pCords(board,x+1,y-2,move+1);
            pCords(board,x+2,y-1,move+1);
            board[x][y]=0;

    }
    public static void displayBoard(int[][] board){
        for(int i=0;i<board.length;i++){
            for (int j=0;j<board.length;j++){
                System.out.print(board[i][j]+"\t");
            }
            System.out.println();
        }
    }
}
