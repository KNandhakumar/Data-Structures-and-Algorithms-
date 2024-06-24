package NandhuDSA.LinearSearch;

public class findMinValue {
    public static void main(String[] args) {
        // Question : Find minimum value in this array
        int[] arr = {-18, -12, -7, 3, 14, 28};
        System.out.println(findMin(arr)); // Calling findMin method to find and print the minimum value
    }

    static int findMin(int[] arr){
        int minVal = Integer.MAX_VALUE; // Assume the first element is the maximum initially
        for (int i = 0; i <arr.length; i++) {
            if (minVal > arr[i]){
                minVal = arr[i];
            }
        }
        return minVal;
    }
}
