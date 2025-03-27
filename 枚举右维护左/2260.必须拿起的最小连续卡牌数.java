/*
 * @lc app=leetcode.cn id=2260 lang=java
 *
 * [2260] 必须拿起的最小连续卡牌数
 */

// @lc code=start

import java.util.HashMap;

class Solution {
    public int minimumCardPickup(int[] cards) {
        int min = 1000000;
        int ans = -1;
        HashMap<Integer, Integer> cnt = new HashMap<>();
        for (int i = 0; i < cards.length; i++) {
            if (cnt.containsKey(cards[i])) {
                int temp = i - cnt.get(cards[i]) + 1;
                if (temp < min) {
                    ans = temp;
                    min = temp;
                }
            }
            cnt.put(cards[i], i);
        }
        return ans;
    }
}
// @lc code=end
