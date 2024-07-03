package _module_2_;
import java.util.Scanner;
public class _bar_chart_ {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the no. of bars-");
        int n= sc.nextInt();
        System.out.println("Enter the individual heights of bars-");
        int[] arr= new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int max=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        for(int i=max;i>=1;i--){
            for(int j=0;j<n;j++){
                if(arr[j]<i){
                    System.out.print("\t");
                }else {
                    System.out.print("*\t");
                }
            }
            System.out.println(" ");
        }
    }
}
