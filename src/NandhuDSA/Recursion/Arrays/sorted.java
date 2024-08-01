package NandhuDSA.Recursion.Arrays;

public class sorted {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7,8};
        System.out.println(sortedOrNot(arr,0));
    }

    static boolean sortedOrNot(int[] arr, int index){
        if (index == arr.length-1){
            return true;
        }

        return arr[index] < arr[index + 1] && sortedOrNot(arr, index + 1);
    }
}
