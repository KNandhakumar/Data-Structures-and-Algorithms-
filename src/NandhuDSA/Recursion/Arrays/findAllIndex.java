package NandhuDSA.Recursion.Arrays;

import java.util.ArrayList;

public class findAllIndex {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 4, 5};
        int target = 4;
        ArrayList<Integer> list = new ArrayList<>();
        System.out.println(findIndex(arr,target,0,list));
//        System.out.println(findIndex2(arr,target,0));
    }

    // enhance method
    static ArrayList<Integer> findIndex(int[] arr, int target, int index, ArrayList<Integer> list){
        if (index==arr.length){
            return list;
        }

        if (arr[index] == target){
            list.add(index);
        }
        return findIndex(arr,target,index + 1, list);
    }

    // creating object again and again so this method don't use because this time complexity is worst case
    static ArrayList<Integer> findIndex2(int[] arr, int target, int index){
        ArrayList<Integer> list = new ArrayList<>();
        if (index==arr.length){
            return list;
        }

        // this will contain answer for that function call only
        if (arr[index] == target){
            list.add(index);
        }
        ArrayList<Integer> ansFormBelowCalls = findIndex2(arr,target,index + 1);
        list.addAll(ansFormBelowCalls);
        return list;
    }
}
