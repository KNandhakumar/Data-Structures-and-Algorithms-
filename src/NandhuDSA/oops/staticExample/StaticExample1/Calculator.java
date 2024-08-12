package NandhuDSA.oops.staticExample.StaticExample1;

public class Calculator {
    // Static variable
    static int count = 0;

    // Static method
    static int add(int a, int b) {
        count++;
        return a + b;
    }

    // Non-static method
    int multiply(int a, int b) {
        return a * b;
    }
}
