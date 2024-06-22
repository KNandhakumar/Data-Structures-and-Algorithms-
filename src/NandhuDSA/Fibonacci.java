package NandhuDSA;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
//        Question :  find Fibonacci
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a = 0;
        int b= 1;
        int count = 2;
//        for (int i=2;i<=n;i++){
//            int temp = b;
//            b = b+a;
//            a = temp;
//        }

        while (count<=n){
            int temp = b;
            b = b+a;
            a = temp;
            count++;
        }
        System.out.println(b);
    }
}
