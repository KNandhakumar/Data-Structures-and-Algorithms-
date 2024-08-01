package NandhuDSA.Recursion;

public class countZeros {
    public static void main(String[] args) {
        // Question : count zeros in a number
        System.out.println(count(30402));
    }

    static int count(int n){
        return calc(n,0);
    }

    static int calc(int n, int c){
        if (n==0){
            return c;
        }

        int rem = n%10;
        if (rem == 0){
            return calc(n/10,c+1);
        }
        return calc(n/10,c);
    }
}
