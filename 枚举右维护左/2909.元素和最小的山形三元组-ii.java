/*
 * @lc app=leetcode.cn id=2909 lang=java
 *
 * [2909] 元素和最小的山形三元组 II
 */

// @lc code=start
class Solution {
    public int minimumSum(int[] nums) {
        // 求后缀最小值
        int le = nums.length;
        int[] suf = new int[le];
        suf[le - 1] = nums[le - 1];
        for(int i = le - 2; i > -1; i --) {
            suf[i] = Math.min(suf[i + 1], nums[i]);
        }
        // 求前缀最小值
        int pre = nums[0];
        int result = Integer.MAX_VALUE;
        for (int i = 1; i < le - 1; i++) {
            if (pre < nums[i] && suf[i + 1] < nums[i]) {
                result = Math.min(result, pre + nums[i] + suf[i]);
            }
            pre = Math.min(pre, nums[i]);
        }
        return result == Integer.MAX_VALUE ? -1 : result;
    }
}
// @lc code=end

