package NandhuDSA.methods;

import java.util.Scanner;

public class Greetings {
    public static void main(String[] args) {
        greetings();
        sum();
        name();
    }

    public static void greetings(){
        System.out.println("hello world");
    }

    static int sum(){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number 1: ");
        int num1 = in.nextInt();
        System.out.print("Enter number 2: ");
        int num2 = in.nextInt();
        int sum = num1 + num2;
        System.out.println("sum = " + sum);
        return sum;
    }

    static String name(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Your Name: ");
        String name = in.next();
        System.out.println("Your name is " + name);
        return name;
    }
}
