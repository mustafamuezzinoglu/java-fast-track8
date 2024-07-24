package m09_arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo {

    public static void main(String[] args) {
        int[] nums = {10, 44, 22};
        System.out.println(Arrays.toString(nums));

        List<Integer> numList = new ArrayList<>();
        numList.add(10);
        numList.add(44);
        numList.add(22);
        numList.add(66);
        numList.remove(0);

        System.out.println("numList = " + numList);

        /*
    Wrapper classes are used to convert a primitive to an object
    byte -> Byte
    short -> Short
    int -> Integer
    long -> Long
    float -> Float
     */

        ArrayList<String> groceriesList = new ArrayList<>();

        System.out.println(groceriesList);

        // add(object): appends the specific element to the end of a list.
        groceriesList.add("Eggs");
        groceriesList.add("Paper Towels");
        groceriesList.add("Apples");
        groceriesList.add("Cooking Oil");

        System.out.println(groceriesList);

        // add(index, object): inserts the specific element at a specific position index in the list.
        groceriesList.add(2, "Chicken");
        System.out.println(groceriesList);


        // size(): Returns the number of elements in list.
        System.out.println(groceriesList.size());


        // get(index): Returns the element at the given index.
        String firstElement = groceriesList.get(0);
        System.out.println("firstElement = " + firstElement);
        String lastElement = groceriesList.get( groceriesList.size() -1 );
        System.out.println("lastElement = " + lastElement);


        // set(index, object): Replaces the element at the given index with the given element.
        groceriesList.set(2, "Oranges");
        System.out.println(groceriesList);


        // remove(int): Removes/Returns value at given index.
        groceriesList.remove(1);
        System.out.println(groceriesList);


        // remove(Object): Removes the first occurrence of the specified element from this list, if it is present.
        groceriesList.remove("Eggs");
        System.out.println(groceriesList);


        // indexOf(object): Returns the index the first occurrence of a specific element.
        System.out.println( groceriesList.indexOf("Oranges") );


        // lastIndexOf(object): Returns the index in this list of the last occurrence of the specified element.
        System.out.println( groceriesList.indexOf("Apples"));
        groceriesList.add("Apples");
        System.out.println(groceriesList);
        System.out.println( groceriesList.lastIndexOf("Apples"));


        // contains(object): Returns true if this list contains the specified element.
        System.out.println( groceriesList.contains("Cooking Oil") );
        System.out.println(groceriesList.contains("Milk"));


        // isEmpty(): Returns true if this list contains no elements.
        System.out.println( groceriesList.isEmpty() );


        // clear(): Removes all elements of the list.
//        groceriesList.clear();
        System.out.println(groceriesList);
        System.out.println(groceriesList.isEmpty());


        // removeIf(Predicate): It is used to remove all the elements from the list that satisfies the given predicate.

        System.out.println(groceriesList);

        groceriesList.removeIf( p -> p.startsWith("A") );

        System.out.println(groceriesList);

//        ================================================

        List<Integer> myNums = new ArrayList<>(Arrays.asList(5,23,66,1,7,98,4));
        System.out.println("myNums = " + myNums);

//        1) for loop
        for (int i = 0; i <myNums.size() ; i++) {
            System.out.print(myNums.get(i) + " ");
        }
        System.out.println();

//        2) for each loop
            for (int each : myNums) {
                System.out.print(each + " ");
//                try modify like remove
//            if (each < 10) { ConcurrentModificationException
//                myNums.remove(each);
//            } //you can not do it
            }

        System.out.println();

//        3)iterotor with while loop
        Iterator <Integer> it = myNums.iterator();
        while (it.hasNext()) {
            int num = it.next();
            System.out.print(num+" ");
            if (num < 10) {
                it.remove();
            }

            System.out.println("\nmyNums = " + myNums);

//            4) forEach method
            myNums.forEach(nu -> System.out.print(num+" "));
            myNums.removeIf(nu -> nu>50);
            System.out.println("\nmyNums = " + myNums);


        }

        }
    }

