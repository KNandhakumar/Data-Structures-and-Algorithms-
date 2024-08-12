package NandhuDSA.oops.Interface;

// Define an interface
public interface Animal {
    // Abstract method (does not have a body)
    void sound();

    // Default method (has a body, introduced in Java 8)
    default void sleep() {
        System.out.println("The animal is sleeping.");
    }
}
