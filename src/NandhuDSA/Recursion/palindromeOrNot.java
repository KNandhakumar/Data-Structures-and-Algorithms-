package NandhuDSA.Recursion;

public class palindromeOrNot {
    public static void main(String[] args) {
        System.out.println(palindrome(121));
    }

    static int reverse(int n){
        int digits = (int)Math.log10(n) +1;
        return calc(n,digits);
    }

    static int calc(int n, int digits){
        if (n<10){ // single digits return n
            return n;
        }
        int rem = n%10;
        return rem * (int)(Math.pow(10,digits-1)) + calc(n/10,digits-1);
    }

    static boolean palindrome(int n){
        return n==reverse(n);
    }
}
