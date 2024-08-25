package _module_3_;
public class _target_sum_subsets_by_recursion_ {
    public static void main(String[] args){
        int n= 7;
        int[] arr= new int[]{10,20,30,40,50,60,70};
        int tar= 60;
        pss(arr,tar,"",0);
    }
    public static void pss(int[] arr,int tar,String ans,int i){
        if(tar==0 ){
            System.out.println(ans);
            return;
        }
        if(tar<0 || i==arr.length){
            return;
        }
       int num= arr[i];
       pss(arr,tar-num,ans+i,i+1);
       pss(arr,tar,ans,i+1);
    }
}
