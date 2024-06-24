package NandhuDSA.LinearSearch;

import java.util.Arrays;

public class findMax2DArray {
    public static void main(String[] args) {
        int[][] arr = {
                {23, 4, 1},
                {18, 12, 3, 9},
                {78, 99, 34, 56},
                {8, 112}
        };
        System.out.println(Arrays.toString(findMax2DWithIndex(arr)));
        System.out.println(findMax2D(arr));
    }

    // Question : find maximum value in 2d array with index
    static int[] findMax2DWithIndex(int[][] arr){
        if (arr.length == 0 || arr[0].length ==0){ // handle empty array case
            return null;
        }
        int maxVal = arr[0][0];
        int maxValRow = -1;
        int maxValCol = -1;
        for (int row = 0; row <arr.length; row++) {
            for (int col = 0; col <arr[row].length; col++) {
                if (maxVal < arr[row][col]){
                    maxVal = arr[row][col];
                    maxValRow = row;
                    maxValCol = col;
                }
            }
        }
        return new int[] {maxVal, maxValRow, maxValCol};
    }

    // Question : find maximum value in 2d array
    static int findMax2D(int[][] arr){
        if (arr.length == 0 || arr[0].length == 0){
            return -1;
        }
        int maxVal = arr[0][0];
        for (int row = 0; row <arr.length; row++) {
            for (int col = 0; col <arr[row].length; col++) {
                if (maxVal < arr[row][col]){
                    maxVal = arr[row][col];
                }
            }
        }
        return maxVal;
    }
}
