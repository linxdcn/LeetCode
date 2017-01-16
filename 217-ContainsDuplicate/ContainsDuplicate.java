public class Solution {
    public boolean containsDuplicate(int[] nums) {
        if (nums.length == 0) {
            return false;
        }
        boolean duplic = false;
        Arrays.sort(nums);
        int last = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (last == nums[i]) {
                duplic = true;
                break;
            }
            last = nums[i];
        }
        return duplic;
    }
}
