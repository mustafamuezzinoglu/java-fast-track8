package m17_collections;

import java.util.*;

public class ListImplementations {

    public static void main(String[] args) {
        //List<Character> list1 = new List<>(); ERROR: List is cannot be isntantiated
        List<Character> list1 = new ArrayList<>();
        list1.add('a');
        list1.add('b');
        list1.add(null);
        list1.add('c');
        list1.add('c');
        list1.add('d');
        list1.add('e');

        System.out.println(list1);

        System.out.println("============================");

        List<Character> list2 = new LinkedList<>();
        list2.add('a');
        list2.add('b');
        list2.add(null);
        list2.add('c');
        list2.add('c');
        list2.add('d');
        System.out.println(list2);

        System.out.println("============================");

        List<Character> list3 = new Vector<>();
        list3.add('a');
        list3.add('b');
        list3.add(null);
        list3.add('c');
        list3.add('c');
        list3.add('d');
        System.out.println(list3);

        System.out.println("============================");
        Stack <String> stack = new Stack<>();
        stack.push("java");
        stack.push("selenium");
        stack.push("maven");
        stack.push("git");
        stack.push("gittop");
        System.out.println(stack);
//peek() -> returns value on top of stack. does not remove it
        System.out.println("Top value using peek is = "+ stack.peek() + ", and it`s still in array");

//pop() -> returns value on top of stack. then removes it from stack
        System.out.println("Top value using pop is = "+ stack.pop()+ ", but its removed now");
        System.out.println(stack);

        System.out.println(stack.pop()+ " is removed from top of stack");
        System.out.println(stack.peek()+ " is now on the top stack");
        System.out.println(stack);

    }


}