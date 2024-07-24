package m13_exceptions;

public class TryCatch {
    public static void main(String[] args) {
        System.out.println("Execution started");

        String word  = "java";
        System.out.println(word.charAt(0));

        try{
            System.out.println(word.charAt(5));
        }catch (StringIndexOutOfBoundsException e){
//        }catch (RuntimeException e){
            System.out.println("Exception caught and handled");
        }

        System.out.println("after word.charAT");

        try {
            System.out.println(10 / 0);
        }catch (RuntimeException e){
            System.out.println("Number 10 cannot / by zero");
        }

        System.out.println("After tray catch of / by zero");

        try {
        int[] nums = {3,6,1,5};
        System.out.println(nums[2]);
    }catch (Exception e) {
            System.out.println("Exception caught with message = " +e.getMessage());
        }finally {
            System.out.println("Finally Block");
        }

    }


}
