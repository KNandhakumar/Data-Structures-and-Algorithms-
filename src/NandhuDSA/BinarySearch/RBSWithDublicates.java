package NandhuDSA.BinarySearch;

public class RBSWithDublicates {
    public static void main(String[] args) {
        int[] nums = {4,5,6,7,0,1,2};
        int target = 6;
        System.out.println(search(nums,target));
    }

    static int search(int[] nums, int target) {
        int pivot = findPivotWithDuplicates(nums);
        // if you did not found a pivot, it means the array is not rotated
        if (pivot == -1){
            // just do normal binary search
            return binarySearch(nums,target,0,nums.length-1);
        }

        // if pivot found, i have  2 ascending sorted array
        if (nums[pivot]  == target){
            return pivot; // found ans
        }

        if (target>=nums[0]){
            return binarySearch(nums,target,0,pivot-1);
        }
        return binarySearch(nums,target,pivot+1,nums.length-1);
    }

    static int findPivotWithDuplicates(int[] nums){
        int start = 0;
        int end = nums.length-1;
        while (start<=end){
            int mid = start + (end - start)/2;
            if (mid < end && nums[mid]>nums[mid+1]){
                return mid;
            }
            if (mid > start && nums[mid]<nums[mid-1]){
                return mid-1;
            }

            // if elements at mid, start, end are equal then just skip the duplicates
            if (nums[mid] == nums[start] && nums[mid] == nums[end]){
                // check if start is pivot
                if (nums[start]>nums[start+1]){
                    return start;
                }
                start++;

                // check end is pivot
                if (nums[end]<nums[end-1]){
                    return end-1;
                }
                end--;
            }

            // left side is sorted, so pivot should be in right side
            else if (nums[start]<nums[mid] || nums[start] == nums[mid] && nums[mid]>nums[end]){
                start = mid+1;
            }
            else {
                end = mid-1;
            }
        }
        return -1;
    }

    static int binarySearch(int[] arr, int target, int start, int end){
        while (start <= end){
            int mid = start + (end - start)/2;
            if (target > arr[mid]){
                start = mid+1;
            }
            else if (target < arr[mid]){
                end = mid-1;
            }
            else {
                return mid;
            }
        }
        return -1;
    }
}
