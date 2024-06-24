package NandhuDSA.LinearSearch;

public class linearSearch {
    public static void main(String[] args) {
        int[] arr = {18, 12 ,9, 14, 77, 50};
        int target = 12;
        int ans = linearSearch(arr,target);
        System.out.println(ans);
    }

    // search in the array: return the index if item found
    // otherwise if item not found return -1;
    static int linearSearch(int[] arr, int target){
        if (arr.length == 0) {
            return -1;
        }

        for (int i = 0; i <arr.length; i++) {
            if (arr[i] == target){
                return i;
            }
        }
        return -1;
    }

    // forEach
//    static int linearSearch(int[] arr, int target){
//        if (arr.length == 0) {
//            return -1;
//        }
//
//        for(int element : arr){
//            if (element == target){
//                return element;
//            }
//        }
//        return -1;
//    }
}