package NandhuDSA.Recursion.Arrays;

public class searchInArray {
    public static void main(String[] args) {
        int[] arr = {3, 2, 1, 18, 18, 9};
        int target = 18;
        // check true or false method
        System.out.println(findIndex(arr,target,0));
        // check index method
        System.out.println(findIndex(arr,target,0));
        // check index method - 2
        System.out.println(searchIndex(arr,target,0));
        // check index method in reverse
        System.out.println(searchIndexReverse(arr,target,arr.length-1));
    }

    // check true or false method
    static boolean find(int[] arr, int target, int index){
        if (index==arr.length){
            return false;
        }

        return arr[index] == target || find(arr,target,index+1);
    }

    // check index method
    static int findIndex(int[] arr, int target, int index){
        if (index==arr.length){
            return -1;
        }
        if (arr[index] == target){
            return index;
        }
        else {
            return findIndex(arr,target,index+1);
        }
    }

    // check index method - 2
    static int searchIndex(int[] arr, int target, int index){
        if (index==arr.length){
            return -1;
        }
        if (arr[index] == target){
            return index;
        }
        else {
            return searchIndex(arr,target,index+1);
        }
    }

    // check index method in reverse
    static int searchIndexReverse(int[] arr, int target, int index){
        if (index==-1){
            return -1;
        }
        if (arr[index] == target){
            return index;
        }
        else {
            return searchIndexReverse(arr,target,index-1);
        }
    }
}
