public class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> result = new LinkedList<String>();
        if (nums == null || nums.length == 0) {
            return result;
        }
        int head = 0;
        int tail = 0;
        int last = nums[0];
        for (tail = 1; tail < nums.length; tail++) {
            if (nums[tail] - last != 1 && tail - head == 1) {
                result.add(nums[head] + "");
                head = tail;
            } else if (nums[tail] - last != 1 && tail - head != 1) {
                result.add(nums[head] + "->" + nums[tail - 1]);
                head = tail;
            }
            last = nums[tail];
        }
        result.add(head == (nums.length - 1) ? nums[head] + "" : nums[head] + "->" + nums[nums.length - 1]);
        return result;
    }
}
