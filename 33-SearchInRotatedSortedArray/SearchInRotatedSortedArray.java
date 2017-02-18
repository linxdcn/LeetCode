public class Solution {
    public int search(int[] nums, int target) {
        if (nums == null || nums.length == 0) {
            return -1;
        }
        int start = 0;
        int end = nums.length - 1;
        while (start <= end) {
            if (start == end) {
                if (nums[start] == target) return start;
                else return -1;
            }
            
            int mid = (start + end) >> 1;
            if (nums[mid] == target) return mid;
            
            if (nums[start] <= target) {
                if (nums[mid] >= nums[start]) {
                    if (nums[mid] < target) start = mid + 1;
                    else end = mid;
                } else {
                    end = mid;
                }
            } else {
                if (nums[mid] < nums[start]) {
                    if (nums[mid] < target) start = mid + 1;
                    else end = mid;
                } else {
                    start = mid + 1;
                }
            }
        }
        return -1;
    }
}
