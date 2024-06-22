package NandhuDSA;

import java.util.Scanner;

public class reverseNumber {
    public static void main(String[] args) {
//        Question : Reverse Number
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int ans = 0;
        while (num>0){
            int rem = num%10;
            num = num/10;
            ans = ans*10+rem;
        }
        System.out.println(ans);
    }
}
