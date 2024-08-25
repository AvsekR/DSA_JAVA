package _module_3_;
public class _n_queens_ {
    public static void main(String[] args){
        int n= 4;
        int[][] board= new int[n][n];
        pCords(board,"",0);
    }
    public static void pCords(int[][] board,String ans,int row){
        if(row==board.length){
            System.out.println(ans);
            return;
        }
        for(int col=0;col<board.length;col++){
            if(isItSafePlace(board,row,col)==true){
                board[row][col]=1;
                pCords(board,ans+row+"-"+col+" ",row+1);
                board[row][col]=0;
            }
        }
    }
    public static boolean isItSafePlace(int[][] board,int row,int col){
        for(int i=row-1,j=col;i>=0;i--){
            if(board[i][j]==1){
                return false;
            }
        }
        for(int i=row-1,j=col-1;i>=0 && j>=0;i--,j--){
            if(board[i][j]==1){
                return false;
            }
        }
        for(int i=row-1,j=col+1;i>=0 && j<board.length;i--,j++){
            if(board[i][j]==1){
                return false;
            }
        }
        return true;
    }
}
