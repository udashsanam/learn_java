package designpattern;

public class SingletonImpl {

    public static void  main(String s[]){

        Singleton singleton = Singleton.getInstance();
        Singleton y = Singleton.getInstance();

        if(singleton == y) {
            System.out.println("both object are pointing to same memory location " + singleton.hashCode() + "and " + y.hashCode());
        }
    }
}
