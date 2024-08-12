package NandhuDSA.oops.staticExample.StaticExample1;

public class main {
    public static void main(String[] args) {
        // Calling the static method without creating an object
        int sum = Calculator.add(5, 10);
        System.out.println("Sum: " + sum); // Output: Sum: 15

        // Accessing the static variable
        System.out.println("Method calls: " + Calculator.count); // Output: Method calls: 1

        // Creating an object to call the non-static method
        Calculator calc = new Calculator();
        int product = calc.multiply(5, 10);
        System.out.println("Product: " + product); // Output: Product: 50
    }
}
