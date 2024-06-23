package NandhuDSA.methods;

import java.util.Scanner;

public class methodsInJava {
    public static void main(String[] args) {
       int ans = sum1(10,20);
        System.out.println(ans);
        int minus = minus(5,1);
        System.out.println(minus);
    }
     /*
        Syntax
        access modifier return_type name() {
            // body
            return statement;
        }
         */

    public static void sum(){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number 1: ");
        int num1 = in.nextInt();
        System.out.print("Enter number 2: ");
        int num2 = in.nextInt();
        int sum = num1 + num2;
        System.out.print("sum = " + sum);
    }

    static int sum1(int num1, int num2){
        int sum = num1 + num2;
        return sum;
    }

    static int minus(int num1, int num2){
        int sum = num1 - num2;
        return sum;
    }
}
