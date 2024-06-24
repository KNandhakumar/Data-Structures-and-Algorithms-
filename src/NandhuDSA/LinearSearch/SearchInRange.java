package NandhuDSA.LinearSearch;

public class SearchInRange {
    public static void main(String[] args) {
        // Question : Search for 3 in the range of Index [1 , 4]
        int[] arr = {18, 12, -7, 3, 14, 28};
        int target = -7;
        System.out.println(searchRange(arr,target,1,4));
    }

    static int searchRange(int[] arr, int target, int start, int end){
        for (int i = start; i <=end; i++) {
            if (target == arr[i]){
                return i;
            }
        }
        return -1;
    }
}
