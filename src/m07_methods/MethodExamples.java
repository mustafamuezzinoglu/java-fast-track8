package m07_methods;

public class MethodExamples {
    public static void main(String[] args) {
        method1();
//        System.out.println(method1()); it gives error because method1 is void method so it doesnt return no output
//        int m = method1();
        method1(); // you can use again and again so its useable and maintable

        method2(); //if you run like this it doesnt give anything but if you assign it as below line
        String val = method2();
        System.out.println("val = " + val); //or as below you can print
        System.out.println(method2()); //or you can use it as a string and string methods
        System.out.println("uppercase -> " + method2().toUpperCase());

        //void method with parameter
        method3("java interview"); //it assigns s in the method3 so it gives 14 mean its lengt as in method

        //return method with parameter
        int len = method4("python");
        System.out.println("len = " + len);
        if (method4("java") > 0) {
            System.out.println("it is more than 0");
        }

        //static methods can be called without an object
        //for instance method, we need to create object before calling
        //new MethodExamples().method5();
        MethodExamples obj = new MethodExamples();
        obj.method5();

        //calling void method taht has return statement
        method6(-4);
        method6(6);
        MethodExamples.method6(7);

    }
        //void method
        public static void method1 () {
            System.out.println("Hello World");
        }

        //return method
        public static String method2 () {
            return "Hello Universe";
        }

        //parameters

        public static void method3 (String s){
            System.out.println(s.length());
        }

        public static int method4 (String s){
            return s.length(); // can be any int type
        }

         // instance method
        public void method5(){
            System.out.println("Java is fun");
         }

         //return in void
        public static void method6(int n){

        if(n < 0){
            return; // to exit method
        }
        for (int i = 0; i < n ; i++) {
            System.out.println(i);

        }
    }

}
