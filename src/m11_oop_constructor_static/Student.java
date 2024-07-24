package m11_oop_constructor_static;

public class Student  extends Object {

    public Student(){
        //if we dont add any constructor, compiler will add one
        //no args default constructor
        super(); //call to Object class constructor
     }
}

class StudentObjects{

    public static void main(String[] args) {
        Student student = new Student();
        System.out.println(student.toString());
    }
}