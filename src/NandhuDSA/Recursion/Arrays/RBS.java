package NandhuDSA.Recursion.Arrays;

public class RBS {
    public static void main(String[] args) {
        // Question : find target in RBS array
        int[] arr = {5, 6, 7, 8, 9, 1, 2, 3};

        System.out.println(search(arr,3,0,arr.length-1));
    }

    static int search(int[] arr, int target, int start, int end){
        if (start>end){
            return -1;
        }

        int mid = start + (end - start) / 2;
        if (target==arr[mid]){
            return mid;
        }

        // ascending
        if (arr[start]<=arr[mid]){
            if (target>=arr[start] && target<=arr[mid]){
                return search(arr,target,start,mid-1);
            }
            else {
                return search(arr,target,mid+1,end);
            }
        }

        // not proper ascending
        if (target>=arr[mid] && target<=arr[end]){
            return search(arr,target,mid+1,end);
        }
        return search(arr,target,start,mid-1);
    }
}
