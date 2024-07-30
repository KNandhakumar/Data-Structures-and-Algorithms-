package NandhuDSA.Math;

public class BitwiseOperators {
    public static void main(String[] args) {
        /*
            * bitwise Operators
            * ~ not     << left shift
            * & and     >> right shift
            * | or      >>> right shift zero fill
            * ^ xor
         */

        int a = 9, b = 12;
        int c = a & b;
        System.out.println("a & b : " + c);
        c = a| b;
        System.out.println("a | b : " + c);
        c = a ^ b;
        System.out.println("a ^ b : " + c);
    }
}
