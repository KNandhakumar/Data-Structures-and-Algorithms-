package NandhuDSA.Math;

public class divisibleNumbers {
    public static void main(String[] args) {
        int n = 36;
        divisibleNumber(n);
    }

    // this time complexity is big 0(n) because this loop run 1 to n
    static void divisibleNumber(int n){
        for (int i = 1; i <=n; i++) {
            if (n % i == 0){
                System.out.println(i);
            }
        }
    }
}
