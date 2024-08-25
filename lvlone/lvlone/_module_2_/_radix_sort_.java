package _module_2_;
public class _radix_sort_{
    public static void main(String[] args){
        int[] arr= new int[]{213,9,718,123,37,443,982,64,375,683};
        int exp= 1;
        int max= 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max= arr[i];
            }
        }
        while(exp<=max){
            countSort(arr,exp);
            exp= exp*10;
        }
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
    public static void countSort(int[] arr,int exp){
        int min= 0;
        int max= 9;
        int[] ans= new int[arr.length];
        int[] farr= new int[10];
        for(int i=0;i<arr.length;i++){
            int temp= arr[i]/exp%10;
            farr[temp]++;
        }
        farr[0]--;
        for(int i=1;i<farr.length;i++){
            farr[i]= farr[i]+farr[i-1];
        }
        for(int i=arr.length-1;i>=0;i--){
            int temp= arr[i]/exp%10;
            int temp1= farr[temp];
            ans[temp1]= arr[i];
            farr[temp]--;
        }
        for(int i=0;i<ans.length;i++){
            arr[i]= ans[i];
        }
    }
}
