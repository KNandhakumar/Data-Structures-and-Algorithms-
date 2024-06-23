package NandhuDSA.methods;

public class shadowing {
    static int x = 10;
    public static void main(String[] args) {
        System.out.println(x);
        int x;
        x = 900;
        System.out.println(x);
        fun();
    }

    static void fun(){
        x = 100;
        System.out.println(x);
    }
}
