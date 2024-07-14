package _module_2_;

import java.util.Scanner;
public class _exit_point_of_matrix_ {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the no. of rows in the matrix-");
        int m= sc.nextInt();
        System.out.println("Enter the no. of columns in the matrix-");
        int n= sc.nextInt();
        int[][] mtrx= new int[m][n];
        System.out.println("Enter the values at indexes of matrix row-wise -");
        for(int i=0;i<mtrx.length;i++){
            for(int j=0;j<mtrx[0].length;j++){
                mtrx[i][j]= sc.nextInt();
            }
        }
        int dir=0;
        int i=0;
        int j=0;
        while(true){
            dir= (dir+mtrx[i][j])%4;
            if(dir==0){
                j++;
            }
            else if(dir==1){
                i++;
            }
            else if(dir==2){
                j--;
            }
            else if(dir==3){
                i--;
            }

            if(i<0){
                i++;
                break;
            }
            else if(j<0){
                j++;
                break;
            }
            else if(i==mtrx.length){
                i--;
                break;
            }
            else if(j==mtrx[0].length){
                j--;
                break;
            }
        }
        System.out.println("Exit point of the matrix is (" + i + "," + j + ")");
    }
}
