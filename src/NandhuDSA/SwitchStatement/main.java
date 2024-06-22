package NandhuDSA.SwitchStatement;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String fruit = in.next();

        switch (fruit) {
            case "Mango" -> System.out.println("Tasty mango");
            case "Apple" -> System.out.println("Red apple");
            case "Orange" -> System.out.println("Rounded orange fruit");
            case "Grapes" -> System.out.println("Tasty grapes");
            default -> System.out.println("Please Enter a valid fruit: ");
        }
    }
}
