package m17_collections;

import java.util.*;

public class QueueImplementations {
    public static void main(String[] args) {
//      FiFO-> first in, first out:
        Queue<Integer> queue = new PriorityQueue<>(); //uses its own priority system, influenced by natural order
        queue.add(3);
        queue.add(10);
        queue.add(2);
        queue.add(8);
        queue.add(2);
//        queue.add(null); null is not allowed in queue types
        System.out.println(queue);

        System.out.println(queue.peek()); //it gives the first element
        System.out.println(queue.poll()); //it gives the first element and removes it

        System.out.println(queue);
        System.out.println(queue.poll()); //it gives the first element and removes it
        System.out.println(queue);

        System.out.println(queue.poll()); //it gives the first element and removes it
        System.out.println(queue);
        System.out.println("------------------------------------------");

        ArrayDeque<String> queue2 = new ArrayDeque<>();
        queue2.offer("java");
        queue2.offer("tuesday");
        queue2.offer("soft skills");
        queue2.offer("automation");
        System.out.println(queue2);
        System.out.println(queue2.peek()); // the other method to use is element()

        System.out.println(queue2.poll()); // the other method to use is remove()
        System.out.println(queue2);

        System.out.println(queue2.peek());

        System.out.println(queue2);

        queue2.offerFirst("API"); // method from Deque
        System.out.println(queue2);

        //queue2.add(null);// null is not allowed in queue types
        queue2.pollLast();
        System.out.println(queue2);

//        new ArrayDeque<>().remove(); // causes exception
        //System.out.println(new ArrayDeque<>().poll()); // returns null, but no exception

        List<Integer> list = new LinkedList<>();
        ((Deque) list).addFirst(4);
    }



}
