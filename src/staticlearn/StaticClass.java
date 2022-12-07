package staticlearn;

import java.util.Arrays;

public class StaticClass {


     public static void print(String s){
        String x;
        x = s;
        System.out.println(x);
    }

    public static void main(String args[]){

        StaticClass.print("hello");

        StaticClass staticClass = new StaticClass();

        TestClass testClass = new TestClass();
        testClass.testMethod();



    }
}
 class TestClass{

    protected void testMethod(){

        StaticClass staticClass = new StaticClass();
        staticClass.print("he");
    }
}
