package NandhuDSA.SwitchStatement;

import java.util.Scanner;

public class switchStatement {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        String fruit = in.next();

//        switch (fruit) {
//            case "Mango" -> System.out.println("Tasty mango");
//            case "Apple" -> System.out.println("Red apple");
//            case "Orange" -> System.out.println("Rounded orange fruit");
//            case "Grapes" -> System.out.println("Tasty grapes");
//            default -> System.out.println("Please Enter a valid fruit: ");
//        }

        int day = in.nextInt();
        switch (day){
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("Thursday");
            case 5 -> System.out.println("Friday");
            case 6 -> System.out.println("Saturday");
            case 7 -> System.out.println("Sunday");
            default -> System.out.println("invalid enter");
        }
    }
}
