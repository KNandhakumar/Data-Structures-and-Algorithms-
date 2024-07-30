package NandhuDSA.Math;

public class countNumbers {
    public static void main(String[] args) {
        int n = 7789;
        int count = 0;
        System.out.println(countDigits1(n,count));
    }

    // logarithmic approach
    // this time complexity big O(log10(n))
    static int countDigits1(int n, int count){
        count = (int)Math.log10(n)+1;
        return count;
    }

    // normal approach
    static int countDigits(int n, int count){
        while (n>0){
            int rem = n%10;
            count++;
            n = n/10;
        }
        return count;
    }
}
