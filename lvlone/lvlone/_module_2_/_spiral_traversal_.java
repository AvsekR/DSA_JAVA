package _module_2_;

import java.util.Scanner;
public class _spiral_traversal_ {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the no. of rows in array-");
        int m= sc.nextInt();
        System.out.println("Enter the no. of columns in array-");
        int n= sc.nextInt();
        System.out.println("Enter the values at indexes of array row-wise - ");
        int[][] mtrx= new int[m][n];
        for(int i=0;i<mtrx.length;i++){
            for(int j=0;j<mtrx[0].length;j++){
                mtrx[i][j]= sc.nextInt();
            }
        }
        int rmin= 0;
        int cmin= 0;
        int rmax= mtrx.length-1;
        int cmax= mtrx[0].length-1;
        int total= m*n;
        int cnt=0;
        while(cnt<total){
            for(int i=rmin, j=cmin;i<=rmax && cnt<total;i++){
                System.out.print(mtrx[i][j]+"\t");
                cnt++;
            }
            cmin++;
            for(int j=cmin, i=rmax;j<=cmax && cnt<total;j++){
                System.out.print(mtrx[i][j]+"\t");
                cnt++;
            }
            rmax--;
            for(int i=rmax, j=cmax;i>=rmin && cnt<total;i--){
                System.out.print(mtrx[i][j]+"\t");
                cnt++;
            }
            cmax--;
            for(int j=cmax, i=rmin;j>=cmin && cnt<total;j--){
                System.out.print(mtrx[i][j]+"\t");
                cnt++;
            }
            rmin++;
        }
    }
}
