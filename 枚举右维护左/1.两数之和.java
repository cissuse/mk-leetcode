package 枚举右维护左;
/*
 * @lc app=leetcode.cn id=1 lang=java
 *
 * [1] 两数之和
 */

// @lc code=start

import java.util.HashMap;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> infoMap = new HashMap<>();
        for(int i =0; i < nums.length; i ++) {
            int current = nums[i];
            if (infoMap.containsKey(target - current)) {
                return new int[]{infoMap.get(target - current), i};
            } else {
                infoMap.put(current, i);
            }
        }
        return new int[2];
    }
}
// @lc code=end

