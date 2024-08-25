package _module_2_;
public class _count_sort_{
    public static void main(String[] args){
        int[] arr= new int[]{6,9,3,5,3,4,3,9,6,4,6,5,8,9,9};
        int min= arr[0];
        int max= arr[0];
        int[] ans= new int[arr.length];
        for(int i=0;i<arr.length;i++){
            if(arr[i]<min){
                min= arr[i];
            }
            if(arr[i]>max){
                max= arr[i];
            }
        }
        int[] farr= new int[max-min+1];
        for(int i=0;i<arr.length;i++){
            int temp= arr[i];
            farr[temp-min]++;
        }
        farr[0]--;
        for(int i=1;i<farr.length;i++){
            farr[i]= farr[i]+farr[i-1];
        }
        for(int i=arr.length-1;i>=0;i--){
            int temp= arr[i];
            int temp1= farr[temp-min];
            ans[temp1]= temp;
            farr[temp-min]--;
        }
        for(int i=0;i<ans.length;i++){
            System.out.println(ans[i]);
        }
    }
}
