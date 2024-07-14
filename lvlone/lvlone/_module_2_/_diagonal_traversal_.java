package _module_2_;

public class _diagonal_traversal_ {
    public static void main(String[] args){
        int[][] arr= new int[][]{{1,2,3,4},
                                 {5,6,7,8},
                                 {9,10,11,12},
                                 {13,14,15,16}};
        for(int g=0;g<arr.length;g++){
            for(int i=0, j=g;j<arr.length;i++,j++){
                System.out.println(arr[i][j]);
            }
        }

    }
}

// Main Challenge of this q is doing it in O(n^2) complexity, a little bit of pattern recognition does the
// work.
