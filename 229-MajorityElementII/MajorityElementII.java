public class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> result = new LinkedList<Integer>();
        if (nums == null || nums.length == 0) {
            return result;
        }
        int itemA = 0, itemB = 1, countA = 0, countB = 0;
        for (int num : nums) {
            if (num == itemA) countA++;
            else if (num == itemB) countB++;
            else if (countA == 0) {
                itemA = num;
                countA++;
            } else if (countB == 0) {
                itemB = num;
                countB++;
            } else {
                countA--;
                countB--;
            }
        }
        countA = 0; countB = 0;
        for (int num : nums) {
            if (num == itemA) countA++;
            if (num == itemB) countB++;
        }
        if (countA > nums.length / 3) result.add(itemA);
        if (countB > nums.length / 3) result.add(itemB);
        return result;
    }
}
