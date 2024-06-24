package NandhuDSA.LinearSearch;

import java.util.Arrays;

public class findMaxValue {
    public static void main(String[] args) {
        // Question : Find maximum value in this array
        int[] arr = {18, -12, 77, 3, 14, 28};
        int[] ans = findMaxValue(arr);
        System.out.println(Arrays.toString(ans));
    }

    static int[] findMaxValue(int[] arr){
        int maxValue = Integer.MIN_VALUE; // initially minus values
        int maxValueIndex = 0; // initially index = 0

        if (arr.length == 0){
            return new int[] {-1};
        }

        for (int i = 0; i <arr.length; i++) {
            if (maxValue < arr[i]){
                maxValue = arr[i];
                maxValueIndex = i;
            }
        }
        return new int[] {maxValue , maxValueIndex}; // new int[] {} - this use for return 2 values
    }
}
