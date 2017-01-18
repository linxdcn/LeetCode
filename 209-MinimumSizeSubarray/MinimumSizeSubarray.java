public class Solution {
    public int minSubArrayLen(int s, int[] nums) {
        int min = Integer.MAX_VALUE;
        int head = 0;
        int tail = 0;
        int sum = 0;
        while (tail < nums.length) {
            sum += nums[tail++];
            while (sum >= s) {
                min = Math.min(min, tail - head);
                sum -= nums[head++];
            }
        }
        return min == Integer.MAX_VALUE ? 0 : min;
    }
}
