package NandhuDSA.Leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {
        int[] arr = {2, 7, 11, 15};
        int target = 9;
        int[] ans = twoSum(arr,target);
        System.out.println(Arrays.toString(ans));
    }

    // this complexity is O (n) because it's traverse n times only
    public static int[] twoSum(int[] nums, int target){
        int[] result = new int[2];
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i <nums.length; i++) {
            if (map.containsKey(target-nums[i])){
                result [0] = map.get(target-nums[i]);
                result [1] = i;
                return result;
            }
            else {
                map.put(nums[i],i);
            }
        }
        return result;
    }

    // this complexity is O (n) because it's traverse n times only
    public static int[] twoSum1(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[] {map.get(complement), i};
            } else {
                map.put(nums[i], i);
            }
        }
        return new int[] {-1, -1};
    }

    // this time complexity is O (n2) because traverse for n times
//    static int[] twoSum(int[] nums, int target){
//        for (int i = 0; i <nums.length; i++) {
//            for (int j = i+1; j <nums.length; j++) {
//                if (nums[i] + nums[j] == target){
//                    return new int[] {i,j};
//                }
//            }
//        }
//        return new int[] {};
//    }
}
