package m12_oop_inheritance;

/*
    Constructors Inheritance.
    super class constructor is called first then sub class constructor
    super() is used to call parent class constructor
 */

    public class Clothing {
        String company;
        public  Clothing(){
        System.out.println("Company no args constructor");
    }

        public Clothing(String company){
            System.out.println("Clothing 1 arg constructor");
            this.company = company;
    }
}

//    class Shirts extends Clothing{
//
//        public Shirts(String company) {
//            super(company);
//        }
//    }


    class Jacket extends Clothing{
        public Jacket(){
            super(); //calling parent class constructor
//            super("H&M"); you can only use 1 super keyword and you must use before everything
            System.out.println("Jacket no args constructor");
    }

        public Jacket(String company){
            super(company);
            System.out.println("Jacket 1 arg constructor");
        }

}

    class ClothingObjects{
        public static void main(String[] args) {
            Jacket jk = new Jacket();
            Jacket jacket = new Jacket("Gap");
            System.out.println("jacket.company = " + jacket.company);

    }
}