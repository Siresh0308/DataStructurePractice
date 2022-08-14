package resh.data.structure.array.practice;
class Student{
    public int roll_no;
    public String name;
    Student(int roll_no , String name){
        this.roll_no = roll_no;
        this.name = name;
    }
}
public class arrayInitalization {
    public static void main (String[] args){

       Student[] arr = new Student[5 ];
       arr[0] = new Student (1, "aman");
        arr[1] = new Student (2, "amanff");
        arr[2] = new Student (3, "amancx");
        arr[3] = new Student (4, "amancx");
        arr[4] = new Student (5, "amanvx");

       for (int i=0;i<arr.length;i++) {
           System.out.println("Element of index at "+"  " + i +"  "+ ", roll number is " + "  " +arr[i].roll_no+" "+"and name" +"  "+ arr[i].name);
       }
       }

}
