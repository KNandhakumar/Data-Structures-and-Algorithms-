package NandhuDSA.Math;

public class reverseNumber {
    public static void main(String[] args) {
        int n = 12345;
        int ans = 0;
        System.out.println(reverseNum(n,ans));
    }
    static int reverseNum(int n, int ans){
        while (n>0){
            int rem = n%10;
            n = n/10;
            ans = ans*10+rem;
        }
        return ans;
    }
}
