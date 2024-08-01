package NandhuDSA.Recursion;

public class reverseNumber {
    public static void main(String[] args) {
        // Question : reverse a number with recursion
        System.out.println(reverse(12345));
    }

    static int reverse(int n){
        int digits = (int)Math.log10(n) +1;
        return calc(n,digits);
    }

    static int calc(int n, int digits){
        if (n<10){
            return n;
        }
        int rem = n % 10;
        return rem * (int)(Math.pow(10,digits-1)) + calc(n/10,digits-1);
        // this recursion working is 1.2*10+1 = 21. 2.3*100+21 = 321. 3.4*1000+321 = 4321
    }
}
