package NandhuDSA.methods;

import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
        // Variable length argument its use for create a array for functions you parameterized this ...v
        fun(1,2,34,5,6,7,8);
    }

      public static void fun(int ...v) {
          System.out.println(Arrays.toString(v));
    }
}
