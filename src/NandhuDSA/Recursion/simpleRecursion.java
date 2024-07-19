package NandhuDSA.Recursion;

public class simpleRecursion {
    public static void main(String[] args) {
        int ans = findNum(5);
        System.out.println(ans);
    }

    static int findNum(int n){
        if (n == 1){
            return 1;
        }
        return n + findNum(n - 1);
    }
}
