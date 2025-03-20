package 枚举右维护左;
/*
 * @lc app=leetcode.cn id=1512 lang=java
 *
 * [1512] 好数对的数目
 */

// @lc code=start

import java.util.HashMap;

class Solution {
    public int numIdenticalPairs(int[] nums) {
        int result = 0;
        HashMap<Integer, Integer> infoMap = new HashMap<>();
        for(int i =0; i < nums.length; i++) {
            int current = nums[i];
            if (infoMap.containsKey(current)) {
                int currentNum = infoMap.get(current);
                result += currentNum;
                infoMap.put(current, currentNum + 1);
            } else {
                infoMap.put(current, 1);
            }
        }
        return result;
    }
}
// @lc code=end

