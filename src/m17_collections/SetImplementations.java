package m17_collections;

import java.util.*;

public class SetImplementations {
    public static void main(String[] args) {
        Set<String> set1 = new HashSet<String>(); //random ORDER
        set1.add(null);
        set1.add("hello world");
        set1.add("5.0");
        set1.add("#zebra");
        set1.add("hello world");
        set1.add("java");
        set1.add("java");
        System.out.println(set1);

        System.out.println("----------------------------------------------------");

        Set<String> set2 = new LinkedHashSet<String>(); //maintains insertion ORDER
        set2.add(null);
        set2.add("hello world");
        set2.add("5.0");
        set2.add("#zebra");
        set2.add("hello world");
        set2.add("java");
        set2.add("java");
        System.out.println(set2);

        System.out.println("----------------------------------------------------");

        Set<String> set3 = new TreeSet<>(); // maintains natural order (sorted) -> String types: lexicographically (ascii order)
        // Q: How does it handle when they are the same first character? It compares the 2nd and 3rd, and so on until it can determine which goes first
        // set3.add(null); // null is not allowed in TreeSet
        set3.add("hello world");
        set3.add("5.0");
        set3.add("#zebra");
        set3.add("hello world");
        set3.add("Java");
//        set3.add(null); // null is not allowed TreeSet
        System.out.println(set3);

        //set3.get(0); its not regular it hasnt indexes
        set3.forEach(e -> System.out.println("e = " + e));
        System.out.println("set3.size() = " + set3.size());

        //convert list to set. remove duplicates from arraylist
        List<Integer> nums = new ArrayList<>(List.of(44,44,5,5,3,3));
        Set<Integer> numsSet = new HashSet<>(nums);
        System.out.println("numsSet = " + numsSet);

        String word = "aaabbbcccddd";
        //split word and convert to String[] array
        //convert to String[] to arrayList<String> using Arrays.asList
        //pass list object to HashSet constructor
        Set<String> wordSet = new HashSet<>(Arrays.asList(word.split("")));
        System.out.println("wordSet = " + wordSet);





    }
}
