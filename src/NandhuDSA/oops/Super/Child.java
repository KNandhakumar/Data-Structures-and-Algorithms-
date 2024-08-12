package NandhuDSA.oops.Super;

public class Child extends Parent{
    Child(){
        super(); // Calls the Parent class constructor
        System.out.println("child class");
    }

    void display() {
        super.display(); // Calls the Parent class display() method
        System.out.println("Child Display");
    }
}
