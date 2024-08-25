package _module_2_;
public class _merge_sort_{
    public static void main(String[] args){
       int[] arr= new int[]{7,4,1,3,6,9,8,2,5};
       int[] res= Sort(arr,0,arr.length-1);
       for(int i=0;i<res.length;i++){
           System.out.println(res[i]);
       }
    }
    public static int[] Sort(int[] arr,int lo,int hi){
        if(lo==hi){
            int[] base= new int[1];
            base[0]=arr[hi];
            return base;
        }
        int mid=(hi+lo)/2;
        int[] res1= Sort(arr,lo,mid);
        int[] res2= Sort(arr,mid+1,hi);
        return mergeSortedArrays(res1,res2);
    }
    public static int[] mergeSortedArrays(int[] res1,int[] res2){
        int[] res= new int[res1.length+res2.length];
        int i=0,j=0,k=0;
        while(i<res1.length && j<res2.length){
            if(res1[i]>res2[j]){
                res[k]= res2[j];
                j++;
                k++;
            }
            else{
                res[k]= res1[i];
                i++;
                k++;
            }
        }
        while(i<res1.length){
            res[k]= res1[i];
            i++;
            k++;
        }
        while(j<res2.length){
            res[k]= res2[j];
            j++;
            k++;
        }
        return res;
    }
}
