public class Solution {
    public int findMin(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        if (nums[0] <= nums[nums.length - 1]) {
            return nums[0];
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > nums[i + 1]) {
                return nums[i + 1];
            }
        }
        return 0;
    }
}
