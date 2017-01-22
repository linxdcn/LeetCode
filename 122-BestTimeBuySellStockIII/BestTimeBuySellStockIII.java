public class Solution {
    public int maxProfit(int[] prices) {
        if (prices == null || prices.length <= 1) {
            return 0;
        }
        int maxProfit = 0;
        boolean isBuy = false;
        int buyPrice = -1;
        for (int i = 0; i < prices.length - 1; i++) {
            if (prices[i + 1] > prices[i] && !isBuy) {
                isBuy = true;
                buyPrice = prices[i];
            } else if (prices[i + 1] < prices[i] && isBuy) {
                isBuy = false;
                maxProfit += prices[i] - buyPrice;
                buyPrice = -1;
            }
        }
        if (buyPrice != -1) {
            maxProfit += prices[prices.length - 1] - buyPrice;
        }
        return maxProfit;
    }
}
