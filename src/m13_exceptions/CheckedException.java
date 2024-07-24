package m13_exceptions;
/*

 */
public class CheckedException {
    public static void main(String[] args) {
        System.out.println("before thread.sleep()");

        try {
            Thread.sleep(2000);
        }catch (InterruptedException e) {
            e.printStackTrace();
        }catch (Exception e) {
            System.out.println("Caught an exception: " + e.getMessage());
        }finally {
            System.out.println("Finally clean up block");
        }
    }
}
