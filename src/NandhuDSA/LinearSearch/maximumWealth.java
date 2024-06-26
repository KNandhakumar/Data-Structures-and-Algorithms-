package NandhuDSA.LinearSearch;

// https://leetcode.com/problems/richest-customer-wealth/
public class maximumWealth {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 3},
                {3, 2, 2}
        };
        System.out.println(maxWealth(arr));
    }

    static int maxWealth(int[][] arr){
        int maxValue = Integer.MIN_VALUE;
        for(int row =0; row<arr.length;row++){
            int sum = 0;
            for(int col =0;col<arr[row].length;col++){
                sum += arr[row][col];
            }
            if (maxValue<sum){
                maxValue = sum;
            }
        }
        return maxValue;
    }

    // enhance forLoop
    static int maxWealth2(int[][] arr){
        int maxValue = Integer.MIN_VALUE;
        for(int[] ints : arr){
            int sum = 0;
            for(int anInt : ints){
                sum += anInt;
            }
            if (maxValue<sum){
                maxValue = sum;
            }
        }
        return maxValue;
    }
}
