package array.practice;

public class multidimensionalArray {
    public static void main(String[] args){
        int multi[][] = {{1,2,3},{4,5,6}};
        //printing 2d array
        for (int i=0;i<=multi.length;i++){
            for(int j=0;j<=multi.length;j++){
                System.out.print(multi[i][j]+" ");
            }
            System.out.println();
        }
    }
}
