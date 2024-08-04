package NandhuDSA.Recursion.selectionSort;

import java.util.Arrays;

public class selectionSort {
    public static void main(String[] args) {
        int[] arr = {4,3,2,1};
        selectionSort1(arr,arr.length,0,0);
        System.out.println(Arrays.toString(arr));
    }

    static void selectionSort1(int[] arr, int r, int c, int max){
        if (r==0){
            return;
        }

        if (c<r){
            if (arr[c] > arr[max]){
                selectionSort1(arr,r,c+1,c);
            }
            else {
                selectionSort1(arr,r,c+1,max);
            }
        }
        else {
            int temp = arr[max];
            arr[max] = arr[r-1];
            arr[r-1] = temp;
        }
        selectionSort1(arr,r-1,0,0);
    }
}
