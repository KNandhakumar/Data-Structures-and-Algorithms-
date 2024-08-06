package NandhuDSA.Leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class singleNumber {
    public static void main(String[] args) {
        // https://leetcode.com/problems/single-number/description/
        int[] arr = {4, 1, 2, 1, 2};
        System.out.println(singleNumber(arr));

    }

    public static int singleNumber(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }
        for (int i = 0; i < nums.length; i++) {
            if (map.get(nums[i]) == 1) {
                return nums[i];
            }
        }
        return -1;
    }
}
