package NandhuDSA.oops.packages;

/* import the package and access the class in this method */
import NandhuDSA.oops.staticExample.Human;

import static NandhuDSA.oops.packages.greetings.greeting.greeting;
import static NandhuDSA.oops.packages.messagePackage.message.message;

public class Main {
    public static void main(String[] args) {
        Human vishnu = new Human(17,"vadai",0,false);
        Human gullu = new Human(19,"gullu",10000,false);
        System.out.println(vishnu.name);
        System.out.println(gullu.name);
        System.out.println(Human.population); // this is common variable for population

        // this is static method so don't have object for this method
        greeting();

        // non-static method access in first you create an object then you access the non-static  method
        Main obj = new Main();
        obj.message();

    }

    // creating a static method
    public static void greeting(){
        System.out.println("hi hello everyone");
    }

    // creating non static method
    void message(){
        System.out.println("this is message method");
    }
}
