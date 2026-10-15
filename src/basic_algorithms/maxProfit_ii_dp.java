package basic_algorithms;

public class maxProfit_ii_dp {
    
    public int maxProfit(int[] prices) {

        int n = prices.length;
        int[][] dp = new int[n][2];
        dp[0][0] = 0;
        dp[0][1] = -prices[0];

        for(int i = 1; i<n; i++) {
            // today no stock max profit
            // yesterday no stock, today no act;
            // yesterday has stock, today sell out;
            dp[i][0] = Math.max(dp[i-1][0], dp[i-1][1]+prices[i]);

            // today has stock max profit
            // yesterday has stock, today no act;
            // yesterday no stock, today buy;
            dp[i][1] = Math.max(dp[i-1][1], dp[i-1][0] - prices[i]);
            
        }

        // last day no stock the profit always better than have stock
        return dp[n-1][0];
        
    }

    // 输入：prices = [7,1,5,3,6,4]
    // 输出：7
    // 解释：在第 2 天（股票价格 = 1）的时候买入，在第 3 天（股票价格 = 5）的时候卖出, 这笔交易所能获得利润 = 5 - 1 = 4。
    // 随后，在第 4 天（股票价格 = 3）的时候买入，在第 5 天（股票价格 = 6）的时候卖出, 这笔交易所能获得利润 = 6 - 3 = 3。
    // 最大总利润为 4 + 3 = 7 。
    
    // i 
}