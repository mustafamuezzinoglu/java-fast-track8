package m15_abstraction;

public abstract class App {

    //regular instance method. non=abstract method
    public void build(){
        System.out.println("building an app using java");
    }

    //abstract method/ No implementation
    public abstract void launch();

}
