package _module_2_;
public class _tower_of_hanoi_ {
    public static void main(String[] args){
        int n= 4;
        char t1= 'A';
        char t2= 'B';
        char t3= 'C';
        toh(n,t1,t2,t3);
    }
    public static void toh(int n,char t1,char t2,char t3){
        if(n==0){
            return;
        }
        toh(n-1,t1,t3,t2);
        System.out.println(n + " [" + t1 + "->" + t2 + "]");
        toh(n-1,t3,t2,t1);
    }
}