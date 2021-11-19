package chapter11;

public class StaticContextDemo {

    public static String staticDescription;
    public String instanceDescription;

    public static void myStaticMethod() {
        staticDescription = "Static fields belong to the type not the instance.";
        //instanceDescription = "Static fields have no idea about non-static fields and can't access them.";

        // We can not access non-static fields from static context
        //printDescription();
    }

    public void myInstanceMethod() {
        staticDescription = "We can access static fields from non-static context";
        myStaticMethod();
        StaticContextDemo.myStaticMethod();

        printDescription();
    }

    public void printDescription(){
        System.out.println("instanceDescription: " + instanceDescription);
        System.out.println("staticDescription: " + staticDescription);
    }
}