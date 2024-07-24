package tasks;

import java.util.*;

public class T08_RemoveDuplicatedFromList {

    public static void main(String[] args) {

        List<Integer> nums   = new ArrayList<>(Arrays.asList(5,7,5,0,2,4,2,0,3,3));

//        1) using stream
//        List<Integer> unique = nums.stream().distinct().toList(); //you can do it also
        nums = nums.stream().distinct().toList();
        System.out.println("nums = " + nums);

//        2)add to set. set is collection of unique List
        Set<Integer> uniqueSet = new LinkedHashSet<Integer>(nums);
//        Set<Integer> uniqueSet = new HashSet<Integer>(nums); //you can order
        System.out.println("uniqueSet = " + uniqueSet);

//        3)use a loop and add to anothet list
        List<Integer> uniqueNumbersLoop = new ArrayList<>();
        for (int num : nums){
            if (!uniqueNumbersLoop.contains(num)){
                uniqueNumbersLoop.add(num);
            }
        }
        System.out.println("uniqueNumbersLoop = " + uniqueNumbersLoop);


    }



}
