package NandhuDSA.BinarySearch;

public class OrderAgnosticBS {
    public static void main(String[] args) {
//        int[] arr = {1,2,3,5,6,88,99}; // Ascending Array
        int[] arr = {-18, -12, -4, 0, 2, 3, 4, 15, 16, 18, 22, 45, 89}; // descending Array
        int target = 1;
        System.out.println(orderAgnosticBS(arr,target));
    }

    static int orderAgnosticBS(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;

        boolean isAscending = arr[start]<arr[end];
        while (start<=end){
            int mid = start + (end - start)/2;
            // if ascending this run
            if (isAscending){
                if (target == arr[mid]){
                    return mid;
                }
                if (target > arr[mid]){
                    start = mid+1;
                }
                else {
                    end = mid-1;
                }
            }
            // if descending this run
            else{
                if (target < arr[mid]){
                    end = mid-1;
                }
                else {
                    start = mid+1;
                }
            }
        }
        return -1;
    }
}
