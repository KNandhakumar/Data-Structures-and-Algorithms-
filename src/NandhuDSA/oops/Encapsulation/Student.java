package NandhuDSA.oops.Encapsulation;

public class Student {
    // Private variables, not accessible directly from outside the class
    private String name;
    private int age;

    // Public getter method for 'name'
    public String getName() {
        return name;
    }

    // Public setter method for 'name'
    public void setName(String name) {
        this.name = name;
    }

    // Public getter method for 'age'
    public int getAge() {
        return age;
    }

    // Public setter method for 'age'
    public void setAge(int age) {
        if(age > 0) { // Validation inside setter
            this.age = age;
        } else {
            System.out.println("Age must be positive.");
        }
    }
}
