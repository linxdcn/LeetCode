public class Solution {
    public void rotate(int[] nums, int k) {
        int length = nums.length;
        int rotate = k % length;
        if (length == 0 || rotate <= 0) {
            return;
        }
        reverse(nums, 0, length - 1);
        reverse(nums, 0, rotate - 1);
        reverse(nums, rotate, length - 1);
    }
    
    public void reverse(int[] nums, int start, int end) {
        int tmp;
        while(start < end) {
            tmp = nums[start];
            nums[start] = nums[end];
            nums[end] = tmp;
            start++;
            end--;
        }
    }
}
