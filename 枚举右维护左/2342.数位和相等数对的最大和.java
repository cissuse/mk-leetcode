
/*
 * @lc app=leetcode.cn id=2342 lang=java
 *
 * [2342] 数位和相等数对的最大和
 */

// @lc code=start

import java.util.HashMap;

class Solution {
    public int maximumSum(int[] nums) {
        int result = -1;
        HashMap<Integer, Integer> infoMap = new HashMap<>();
        for (int num : nums) {
            int dit = getDitSum(num);
            if (infoMap.containsKey(dit)) {
                int value = infoMap.get(dit);
                int temp = num + value;
                if (temp > result) {
                    result = temp;
                }
                if (num > value) {
                    infoMap.put(dit, num);
                }
            } else {
                infoMap.put(dit, num);
            }
        }
        return result;
    }

    private int getDitSum(int number) {
        int sum = 0;
        while (number != 0) {
            sum += number % 10;
            number /= 10;
        }
        return sum;
    }
}
// @lc code=end
