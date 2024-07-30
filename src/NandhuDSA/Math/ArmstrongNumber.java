package NandhuDSA.Math;

public class ArmstrongNumber {
    public static void main(String[] args) {
        // Question : Armstrong number or not
        // 371 cube this number
        int n = 371;
        int sum = 0;
        System.out.println(armOrNot(n,sum));
    }

    static boolean armOrNot(int n, int sum){
        int duplicate = n;
        while (n>0){
            int rem = n%10;
            n = n/10;
            sum = sum + (rem*rem*rem);
        }
        if (sum == duplicate){
            return true;
        }
        return false;
    }
}
