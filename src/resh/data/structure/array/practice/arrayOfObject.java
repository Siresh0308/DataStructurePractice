package resh.data.structure.array.practice;
class Students {
    public String name;
    Students(String name){
        this.name = name;
    }
    public String toString(){
        return  name;
    }
}
public class arrayOfObject {
    public static void main(String[] args){
        Students[] myStudents = new Students[]{new Students("Reshmi"),new Students("Reshma"),new Students("naResh")
                ,new Students("suResh"),new Students("Mukesh")};
     for(Students m: myStudents){
         System.out.println(m);
     }
    }
}
