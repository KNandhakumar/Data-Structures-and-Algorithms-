package NandhuDSA.BinarySearch;

public class InfinityArray {
    public static void main(String[] args) {
        // Infinity Array
        int[] arr = {3, 5, 7, 9, 10, 90, 100, 130, 140, 160};
        int target = 10;
        System.out.println(findRange(arr,target));
    }

    static int findRange(int[] arr, int target){
        int start = 0;
        int end = 1;
        while (target>arr[end]){
            int temp = end + 1;
            end = end + (end - start + 1) * 2;
            start = temp;
        }
        return binarySearch(arr,target,start,end);
    }

    // Binary Search
    static int binarySearch(int[] arr, int target, int start, int end){
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
