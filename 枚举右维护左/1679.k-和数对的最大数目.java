
/*
 * @lc app=leetcode.cn id=1679 lang=java
 *
 * [1679] K 和数对的最大数目
 */

// @lc code=start

import java.util.HashMap;

class Solution {
    public int maxOperations(int[] nums, int k) {
        int ans = 0;
        HashMap<Integer, Integer> cnt = new HashMap<>();
        for (int num : nums) {
            int c = cnt.getOrDefault(k -num, 0);
            if (c > 0) {
                ans ++;
                cnt.put(k - num, c - 1);
            } else {
                cnt.merge(num, 1, Integer::sum);
            }
        }
        return ans;
    }
}

// @lc code=end

// public int maxOperations(int[] nums, int k) {
//     int result = 0;
//     HashMap<Integer, Integer> infoMap = new HashMap<>();
//     for (int num : nums) {
//         int target = k - num;
//         if (infoMap.containsKey(target)) {
//             result++;
//             int currentNum = infoMap.get(target);
//             if (currentNum <= 1) {
//                 infoMap.remove(target);
//             } else {
//                 infoMap.put(target, currentNum - 1);
//             }
//         } else {
//             if (infoMap.containsKey(num)) {
//                 infoMap.put(num, infoMap.get(num) + 1);
//             } else {
//                 infoMap.put(num, 1);
//             }
//         }
//     }
//     return result;
// }