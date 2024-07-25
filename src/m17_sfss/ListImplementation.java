package m17_sfss;

import java.util.*;

public class ListImplementation {

    //List<Character> list1 = new List<>(); ERROR: List is cannot be isntantiated
    public static void main(String[] args) {
        List<Character> list1 = new ArrayList<>(7);
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

        System.out.println("Top value = "+ stack.peek());

        System.out.println("Top value = "+ stack.pop());
        System.out.println(stack);

        System.out.println(stack.pop()+ " is removed from top of stack");
        System.out.println(stack.peek()+ " is now on the top stack");
        System.out.println(stack);

    }


}
