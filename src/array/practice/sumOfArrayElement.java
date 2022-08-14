package array.practice;

public class sumOfArrayElement {
    public static void main(String[] args){
        int arr[] = {1,2,3,4,5,6,7,8,9,10};
        sum(arr);

    }
    public static void sum (int[] arr){
        int sum = 0;
        for (int i= 0; i<= arr.length;i++){
            sum +=arr[i];

            System.out.println("sum of array values of element till:" +i +" and total sum :" +sum);
        }
    }
}
