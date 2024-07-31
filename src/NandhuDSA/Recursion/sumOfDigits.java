package NandhuDSA.Recursion;

public class sumOfDigits {
    public static void main(String[] args) {
        int n = 1342;
        int sum = 0;
        System.out.println(sumDigits2(n));
    }

    // this time complexity O(n)
    static int sumDigits(int n, int sum){
        while (n>0){
            int rem = n%10;
            n = n/10;
            sum = sum + rem;
        }
        return sum;
    }

    static int sumDigits2(int n){
        if (n==0){
            return 0;
        }
        return (n%10) + sumDigits2(n/10);
    }
}
