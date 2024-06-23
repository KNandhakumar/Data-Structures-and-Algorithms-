package NandhuDSA.SwitchStatement;

import java.util.Scanner;

public class nestedSwitch {
    public static void switchStatement(String[] args) {
        Scanner in = new Scanner(System.in);
        int empId = in.nextInt();
        String department = in.next();
        switch (empId) {
            case 1:
                System.out.println("Vishnu");
                break;
            case 2:
                System.out.println("gullu");
                break;
            case 3:
                System.out.println("Emp number 3");
                switch (department) {
                    case "IT":
                        System.out.println("IT department");
                        break;
                    case "Management":
                        System.out.println("Management department");
                        break;
                    default:
                        System.out.println("No department entered");
                }
                break;
            default:
                System.out.println("Enter correct EmpId");
                break;
        }
    }
}
