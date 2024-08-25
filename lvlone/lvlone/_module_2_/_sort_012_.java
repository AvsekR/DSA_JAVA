package _module_2_;
public class _sort_012_{
    public static void main(String[] args){
        int[] arr= new int[]{2,1,2,2,0,1,2,2,1,0,1,2,0,2,1};
        int i=0,j=0,k=arr.length-1;
        while(i<k){
            if(arr[i]==0){
                int temp= arr[i];
                arr[i]= arr[j];
                arr[j]= temp;
                i++;
                j++;
            }
            else if(arr[i]==1){
                i++;
            }
            else if(arr[i]==2){
                int temp= arr[i];
                arr[i]= arr[k];
                arr[k]= temp;
                k--;
            }
        }
        for(int l=0;l<arr.length;l++){
            System.out.println(arr[l]);
        }
    }
}
