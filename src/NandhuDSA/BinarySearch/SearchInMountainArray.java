package NandhuDSA.BinarySearch;

public class SearchInMountainArray {
    public static void main(String[] args) {
        // https://leetcode.com/problems/find-in-mountain-array/description/
        int[] arr = {1, 2, 3, 5, 6, 4, 3, 2};
        int target = 3;
        System.out.println(searchMountainArray(arr,target));
    }

    // search in mountain array
    static int searchMountainArray(int[] arr , int target){
        int peak = findPeakIndex(arr);
        int firstCheck = orderAgnosticBS(arr,target,0,peak);
        if (firstCheck != -1){
            return firstCheck;
        }
        return orderAgnosticBS(arr,target,peak+1,arr.length-1);
    }

    // find peak index
    static int findPeakIndex(int[] arr){
       int start = 0;
       int end = arr.length-1;
       while (start<end){
           int mid = start + (end - start)/2;
           if (arr[mid] > arr[mid+1]){
               end = mid;
           }
           else {
               start = mid+1;
           }
       }
       return start;
    }

    // Order of agnostic binary search
    static int orderAgnosticBS(int[] arr, int target, int start, int end) {
        boolean isAscending = arr[start] < arr[end];
        while (start <= end) {
            int mid = start + (end - start) / 2;
            // if ascending this run
            if (target == arr[mid]) {
                return mid;
            }
            if (isAscending) {
                if (target > arr[mid]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
            // if descending this run
            else {
                if (target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return -1;
    }
}
