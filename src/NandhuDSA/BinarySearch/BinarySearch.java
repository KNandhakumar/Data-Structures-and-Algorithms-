package NandhuDSA.BinarySearch;

public class BinarySearch {
    public static void main(String[] args) {
        // Binary Search
        int[] arr = {2, 4, 6, 9, 11, 12, 14, 20, 36,48};
        int target = 12;
        System.out.println(binarySearch(arr,target));
    }
    static int binarySearch(int[] arr, int target){
        int start = 0;
        int end = arr.length;
        while (start<end){
            int mid = start + (end - start)/2;
            if (target > arr[mid]){
                start = mid+1;
            }
            else if (target<arr[mid]){
                end = mid-1;
            }
            else {
                return mid;
            }
        }
        return -1;
    }
}
