package 枚举右维护左;
/*
 * @lc app=leetcode.cn id=121 lang=java
 *
 * [121] 买卖股票的最佳时机
 */

// @lc code=start
class Solution {
    public int maxProfit(int[] prices) {
        int result = 0;
        int max = 0;
        int leftMin = 100000;
        for(int currentValue : prices) {
            if (currentValue < leftMin) {
                leftMin = currentValue;
            }
            result = currentValue - leftMin;
            if (result > max) {
                max = result;
            }
        } 
        return max;
    }
}
// @lc code=end

