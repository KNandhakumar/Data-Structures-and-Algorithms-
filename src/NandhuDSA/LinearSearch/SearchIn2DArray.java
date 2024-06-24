package NandhuDSA.LinearSearch;

import java.lang.reflect.Array;
import java.util.Arrays;

public class SearchIn2DArray {
    public static void main(String[] args) {
        // Question : Search in 2D Array
        int[][] arr = {
                {23, 4, 1},
                {18, 12, 3, 9},
                {78, 99, 34, 56},
                {8, 12}
        };
        int target = 56;
        int[] ans = search2DArray(arr,target);
        System.out.println(Arrays.toString(ans));
    }

    static int[] search2DArray(int[][] arr, int target){
        for (int row = 0; row <arr.length; row++) { // outer loop
            for (int col = 0; col <arr[row].length; col++) { // inner loop
                if (arr[row][col] == target){
                    return new int[] {row,col};
                }
            }
        }
        return new int[] {-1};
    }
}
