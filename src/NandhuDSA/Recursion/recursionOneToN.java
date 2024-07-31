package NandhuDSA.Recursion;

public class recursionOneToN {
    public static void main(String[] args) {
        fun3(5);
    }

    // method - 1 print 5 to 1
    static void fun(int n){
        if (n==0){
            return;
        }
        System.out.println(n);
        fun(n-1);
    }

    // method - 2 reverse print 1 to 5
    static void fun2(int n){
        if (n==0){
            return;
        }
        fun2(n-1);
        System.out.println(n);
    }


    // method - 3 print both 5 to 1
    static void fun3(int n){
        if (n==0){
            return;
        }
        System.out.println(n);
        fun3(n-1);
        System.out.println(n);
    }
}
