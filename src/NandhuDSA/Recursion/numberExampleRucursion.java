package NandhuDSA.Recursion;

public class numberExampleRucursion {
    // write a function that takes in a number and prints it
    // print first 5 numbers : 1 2 3 4 5
    public static void main(String[] args) {
        print(1);
    }

    static void print(int n){
        // base condition
        if (n == 5){
            System.out.println(5);
            return;
        }
        // body
        System.out.println(n);
        // recursive call
        print(n + 1);
    }
}
