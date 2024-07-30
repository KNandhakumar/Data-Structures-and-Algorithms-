package NandhuDSA.Math;

public class palindromeOrNot {
    public static void main(String[] args) {
        int n = 121;
        int ans = 0;
        System.out.println(reverseNum(n,ans));
    }
    static boolean reverseNum(int n, int ans){
        int temp = n;
        while (n>0){
            int rem = n%10;
            n = n/10;
            ans = ans*10+rem;
        }
        if (ans == temp){
            return true;
        }
        return false;
    }
}
