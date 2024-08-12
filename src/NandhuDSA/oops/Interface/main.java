package NandhuDSA.oops.Interface;

// Test the interface implementation
public class main {
    public static void main(String[] args) {
        Animal myDog = new Dog();
        Animal myCat = new Cat();

        // Call the implemented methods
        myDog.sound(); // Outputs: The dog barks.
        myCat.sound(); // Outputs: The cat meows.

        // Call the default method
        myDog.sleep(); // Outputs: The animal is sleeping.
        myCat.sleep(); // Outputs: The animal is sleeping.
    }
}
