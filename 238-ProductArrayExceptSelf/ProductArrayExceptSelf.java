public class Solution {
    public int[] productExceptSelf(int[] nums) {
        if (nums.length <= 1) {
            return nums;
        }
        return help(nums, 0, nums.length - 1);
    }
    
    public int[] help(int[] nums, int start, int end) {
        if (start >= end) {
            return nums;
        }
        if ((end - start) == 1) {
            int tmp = nums[start];
            nums[start] = nums[end];
            nums[end] = tmp;
            return nums;
        }
        int first = nums[start];
        nums[start] = 1;
        for (int i = start + 1; i <= end; i++) {
            nums[start] *= nums[i];
        }
        help(nums, start + 1, end);
        for (int i = start + 1; i <= end; i++) {
            nums[i] *= first;
        }
    }
}
