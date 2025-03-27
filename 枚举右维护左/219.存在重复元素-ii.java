/*
 * @lc app=leetcode.cn id=219 lang=java
 *
 * [219] 存在重复元素 II
 */

// @lc code=start

import java.util.HashMap;

class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer, Integer> cnt = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (cnt.containsKey(nums[i]) && i - cnt.get(nums[i]) <= k) {
                return true;
            }
            cnt.put(nums[i], i);
        }
        return false;
    }
}
// @lc code=end
