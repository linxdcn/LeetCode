public class Solution {
    public int maxProfit(int[] prices) {
        if (prices.length <= 1) {
            return 0;
        }
        int max = 0;
        for (int i = 0; i < prices.length - 1; i++) {
            if (prices[i] < prices[i + 1]) {
                int tmpMax = prices[i + 1];
                for (int j = i + 1; j < prices.length; j++) {
                    if (tmpMax < prices[j]) {
                        tmpMax = prices[j];
                    }
                }
                if (max < tmpMax - prices[i]) {
                    max = tmpMax - prices[i];
                }
            }
        }
        return max;
    }
}
