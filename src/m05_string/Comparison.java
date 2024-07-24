package m05_string;

public class Comparison {

    public static void main(String[] args) {
        String a = "Hello World"; // string pool
        String a2 = new String ("Hello World");  //heap memory

        System.out.println( a == a2); // false, == check if both point to same object/memory location
        System.out.println(a.equals(a2)); //true, equals() compares values

        System.out.println(a == "Hello World"); //true beacuse it shows the same point in the string pool
        System.out.println(a2 == "Hello World"); //false

        //hashCode is integer representation for object
        System.out.println(a.hashCode());
        System.out.println(a2.hashCode());
        System.out.println("Hello World".hashCode());

    }
}
