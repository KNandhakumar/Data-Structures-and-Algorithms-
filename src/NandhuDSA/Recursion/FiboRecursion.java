package NandhuDSA.Recursion;

public class FiboRecursion {
    public static void main(String[] args) {
        // Question : find n fibo number
        // Note : How to understand & approach the problem
        // step - 1 : identify if you can break down problem into smaller problems
        // step - 2 : write the recurrence relation if needed
        // step - 3 : draw the recursive tree
        // step - 4 : about the tree :
        // * see the flow of functions, how they are getting in stack
        // * identify and focus on left tree calls and right tree calls
        // step - 5 : see how the values are returned at each step.see where two function called will come out in the end, you will come out of the main
        int ans = fibo(4);
        System.out.println(ans);
    }

    static int fibo(int n){
        // draw recursive tree and debug slowly step by step we will learn easy in recursion
        // this base condition already we know because already we have 0 , 1 value so 0 < 2 return 0; 1 < 2 return 1;
        // base condition
        if (n < 2){
            return n;
        }
        // this is not tail recursion because of this function is not last function this function is extra addition and returning so this is tail recursion
        return fibo(n-1) + fibo(n-2);
    }
}
