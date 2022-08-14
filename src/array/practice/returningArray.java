package array.practice;

public class returningArray {
    public static void main(String[] args){
        int arr[] = m1();
        for (int i=0;i<arr.length;i++){
            System.out.println(arr[i] + " ");
            sum(arr);
        }
    }
    public static int[] m1(){
        return new int[] {1,2,3,4,5,6,7};
    }
    public static void sum( int[] arr) {
        for (int i = 0; i < arr.length; i++) {

            int sum = 0;
            sum += arr[i];
            System.out.println("Sum till " + i + "element is : " + sum);
        }
    }
}
