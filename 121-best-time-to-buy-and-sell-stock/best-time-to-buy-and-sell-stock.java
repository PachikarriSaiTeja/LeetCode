class Solution {
    public int maxProfit(int[] prices) {
        if (prices == null || prices.length < 2) return 0;  // If there are less than two prices, no profit can be made.

        int minPrice = Integer.MAX_VALUE;  // Initialize minPrice to the largest possible value
        int maxProfit = 0;  // Initialize maxProfit to 0

        for (int price : prices) {
            // Update the minimum price encountered so far
            if (price < minPrice) {
                minPrice = price;
            }
            // Calculate profit if selling at the current price and update maxProfit
            maxProfit = Math.max(maxProfit, price - minPrice);
        }

        return maxProfit;
    }
}
