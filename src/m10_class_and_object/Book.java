package m10_class_and_object;

import org.w3c.dom.ls.LSOutput;
import java.util.Stack;

public class Book { //Book is a class

//      instance variables
    int length;
    String author;

//    static variables
    static String publisher;

    static {
        publisher = "Cydeo learning";
    }
    /*
    the static block will be executed the first time the class is used

    Q: Why use the static block, can`t we just initialize on line 10?
    -> in this area we could have, but the static block is needed whenever there is other code statements that need to be run as part of set up. The static block can run other code. It`s not just for initializing
     */

    // Book book = new Book(100, "Mike");
    public  Book (int length, String author){
        this.length = length;
        this.author = author;

    }

    public Book(){
        this(11,"unknown");
        System.out.println("no args constructor");
    }
//static method
    public static  void entertainment(){
        System.out.println("Books are a source of entertainment");
    }


    //not using the static keyword allows the creation of instance methods which are access by the objects of the class
//instance method
    public void read(){
        System.out.println("Reading book by " + author);
    }
}
