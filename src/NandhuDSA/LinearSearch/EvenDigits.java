package NandhuDSA.LinearSearch;

public class EvenDigits {
    // https://leetcode.com/problems/find-numbers-with-even-number-of-digits/description/
    public static void main(String[] args) {
        int[] arr = {12,345,2,6,7896};
        System.out.println(findNums(arr));
    }

    static int findNums(int[] arr){
        int count =0;
        for (int i = 0; i <arr.length; i++) {
            int nums = arr[i];
            if (even(nums)){
                count++;
            }
        }
        return count;
    }

    static boolean even(int nums){
        int numDigit = digits(nums);
        if (numDigit%2 == 0){
            return true;
        }
        return false;
    }

    static int digits(int nums){
        int count = 0;
        while (nums>0){
            count++;
            nums = nums/10;
        }
        return count;
    }
}
