package NandhuDSA.BinarySearch;

public class FindMountainArray {
    public static void main(String[] args) {
        // https://leetcode.com/problems/peak-index-in-a-mountain-array/description/
        int[] arr = {1, 2, 3 ,5, 6, 4, 3, 2};
        System.out.println(mountainArray(arr));
    }

    static int mountainArray(int[] arr){
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
}
