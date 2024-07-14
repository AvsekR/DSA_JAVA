package _module_2_;

import java.util.Scanner;
public class  _shell_rotate_ {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int m=6;
        int n=6;
        int[][] arr= new int[][]{{1,2,3,4,5,6},
                                 {7,8,9,10,11,12}, 
                                 {13,14,15,16,17,18},
                                 {19,20,21,22,23,24},
                                 {25,26,27,28,29,30},
                                 {31,32,33,34,35,36}};
        System.out.println("Enter the no. of shell that you want to rotate-");
        int s= sc.nextInt();
        System.out.println("Enter the no. of times you want to rotate the shell-");
        int rot= sc.nextInt();

        System.out.println("Matrix before shell update-");
        displayArray(arr);

        int rmin=s-1;
        int cmin=s-1;
        int rmax=arr.length-s;
        int cmax=arr[0].length-s;

        int[] oneD= fillOneDfromShell(rmin,cmin,rmax,cmax,arr);

        rot= rot % oneD.length;
        if(rot<0){
            rot= rot+ oneD.length;
        }

        reverseArray(0, oneD.length-rot-1,oneD);
        reverseArray(oneD.length-rot,oneD.length-1,oneD);
        reverseArray(0,oneD.length-1,oneD);

        updateShell(rmin,cmin,rmax,cmax,arr,oneD);

        System.out.println("Matrix after shell update-");
        displayArray(arr);


    }
    public static void reverseArray(int i,int j,int[] arr){
        for(int l=i;l<=(i+j)/2;l++){
            int temp=arr[l];
            arr[l]=arr[(i+j)-l];
            arr[(i+j)-l]=temp;
        }
    }
    public static int[] fillOneDfromShell(int rmin, int cmin, int rmax, int cmax, int[][] arr){
        int[] oneD= new int[2*(cmax-cmin+1)+2*(rmax-rmin+1)-4];
        int k=0;
        for(int i=rmin, j=cmin;i<=rmax;i++){
            oneD[k]=arr[i][j];
            k++;
        }
        cmin++;
        for(int j=cmin, i=rmax;j<=cmax;j++){
            oneD[k]=arr[i][j];
            k++;
        }
        rmax--;
        for(int i=rmax, j=cmax;i>=rmin;i--){
            oneD[k]=arr[i][j];
            k++;
        }
        cmax--;
        for(int j=cmax, i=rmin;j>=cmin;j--){
            oneD[k]=arr[i][j];
            k++;
        }
        return oneD;
    }
    public static void updateShell(int rmin, int cmin, int rmax, int cmax,int[][] arr,int[] oneD){
        int z=0;
        for(int i=rmin, j=cmin;i<=rmax;i++){
            arr[i][j]= oneD[z];
            z++;
        }
        cmin++;
        for(int j=cmin, i=rmax;j<=cmax;j++){
            arr[i][j]= oneD[z];
            z++;
        }
        rmax--;
        for(int i=rmax, j=cmax;i>=rmin;i--){
            arr[i][j]= oneD[z];
            z++;
        }
        cmax--;
        for(int j=cmax, i=rmin;j>=cmin;j--){
            arr[i][j]= oneD[z];
            z++;
        }
    }
    public static void displayArray(int[][] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                System.out.print(arr[i][j]+"\t");
            }
            System.out.println();
        }
    }
}

// Central Idea-
//  Extract the items of shell in an one dimensional array, then rotate the oneD array as specified
//  then update the shell with same data as in oneD array