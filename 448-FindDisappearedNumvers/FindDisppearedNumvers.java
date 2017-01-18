public class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> result = new LinkedList<Integer>();
        int i = 0;
        while (i < nums.length) {
            if (nums[i] == 0 || nums[i] == -1) {
                i++;
            } else if (nums[i] == (i + 1)) {
                nums[i] = 0;
                i++;
            } else if (nums[nums[i] - 1] == 0) {
                nums[i] = -1;
                i++;
            } else {
                int tmp = nums[i];
                nums[i] = nums[tmp - 1];
                nums[tmp - 1] = 0;
            }
        }
        for (i = 0; i < nums.length; i++) {
            if (nums[i] == -1) {
                result.add(i + 1);
            }
        }
        return result;
    }
}
