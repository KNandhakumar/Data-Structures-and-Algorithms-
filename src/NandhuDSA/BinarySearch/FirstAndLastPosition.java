package NandhuDSA.BinarySearch;

import java.util.Arrays;

public class FirstAndLastPosition {
    // https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/
    public static void main(String[] args) {
        int[] arr = {5, 7, 7, 8, 8, 10};
        int target = 1;
        int[] ans = searchRange(arr,target);
        System.out.println(Arrays.toString(ans));
    }
        public static int[] searchRange(int[] nums, int target) {
            int[] ans = {-1,-1};
            ans[0] = findFirstAndLast(nums,target,true);
            if (ans[0] != -1){
                ans[1] = findFirstAndLast(nums,target,false);
            }
            return ans;
        }

        static int findFirstAndLast(int[] nums, int target, boolean firstIndex){
            int ans = -1;
            int start = 0;
            int end = nums.length-1;
            while(start<=end){
                int mid = start + (end - start)/2;
                if(target > nums[mid]){
                    start = mid+1;
                }
                else if(target < nums[mid]){
                    end = mid-1;
                }
                else {
                    ans = mid;
                    if(firstIndex){ // first check in left side
                        end = mid-1;
                    }
                    else { // // second check in right side
                        start = mid+1;
                    }
                }
            }
            return ans;
        }
}
