/*
 * @lc app=leetcode.cn id=624 lang=java
 *
 * [624] 数组列表中的最大距离
 */

// @lc code=start

import java.util.List;

class Solution {
    public int maxDistance(List<List<Integer>> arrays) {
        int min = arrays.get(0).get(0);
        int max = arrays.get(0).get(arrays.get(0).size() - 1);
        int ans = -999999;
        for (int i = 1; i < arrays.size(); i++) {
            int currentMin = arrays.get(i).get(0);
            int currentMax = arrays.get(i).get(arrays.get(i).size() - 1);
            int disMax = Math.abs(currentMax - min);
            int disMin = Math.abs(currentMin - max);
            if (Math.max(disMax, disMin) > ans) {
                ans = Math.max(disMax, disMin);
            }
            if (currentMax > max) {
                max = currentMax;
            }
            if (currentMin < min) {
                min = currentMin;
            }
        }
        return ans;
    }
}
// @lc code=end
