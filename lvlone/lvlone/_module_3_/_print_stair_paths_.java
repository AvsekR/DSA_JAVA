package _module_3_;
public class _print_stair_paths_ {
    public static void main(String[] args){
       int n= 3;
       pPaths(n, "");
    }
    public static void pPaths(int n, String ans){
        if(n==0){
            System.out.println(ans);
            return;
        }
        else if(n<0){
            return;
        }
        pPaths(n-1,ans+"1");
        pPaths(n-2,ans+"2");
        pPaths(n-3,ans+"3");
    }
}
