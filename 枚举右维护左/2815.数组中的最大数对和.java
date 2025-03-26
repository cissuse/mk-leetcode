/*
 * @lc app=leetcode.cn id=2815 lang=java
 *
 * [2815] 数组中的最大数对和
 */

// @lc code=start

import java.util.HashMap;

class Solution {
    public int maxSum(int[] nums) {
        int result = -1;
        HashMap<Integer, Integer> infoMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int digit = maxDigit(nums[i]);
            if (infoMap.containsKey(digit)) {
                int current = infoMap.get(digit);
                int temp = current + nums[i];
                if (temp > result) {
                    result = temp;
                }
                if (nums[i] > current) {
                    infoMap.put(digit, nums[i]);
                }
            } else {
                infoMap.put(digit, nums[i]);
            }
        }
        return result;
    }

    private int maxDigit(int num) {
        int result = -1;
        while (num != 0) {
            int temp = num % 10;
            if (temp > result) {
                result = temp;
            }
            num /= 10;
        }
        return result;
    }
}
// @lc code=end
