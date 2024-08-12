package NandhuDSA.oops.Encapsulation;

public class main {
    public static void main(String[] args) {
        // Create an object of Student class
        Student student = new Student();

        // Set values using setter methods
        student.setName("vishnu");
        student.setAge(18);

        // Get values using getter methods
        System.out.println("Name: " + student.getName()); // Output: Name: vishnu
        System.out.println("Age: " + student.getAge());   // Output: Age: 18

        // Try setting an invalid age
        student.setAge(-5);  // Output: Age must be positive.
    }
}
