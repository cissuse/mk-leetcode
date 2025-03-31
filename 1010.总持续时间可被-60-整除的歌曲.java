/*
 * @lc app=leetcode.cn id=1010 lang=java
 *
 * [1010] 总持续时间可被 60 整除的歌曲
 */

// @lc code=start

import java.util.HashMap;

class Solution {
    public int numPairsDivisibleBy60(int[] time) {
        int ans = 0;
        HashMap<Integer, Integer> cnt = new HashMap<>();
        for(int t : time) {
            int re = t % 60;
            int key = 60 - re;
            int c = cnt.getOrDefault(key, 0);
            if (c > 0) {
                ans += cnt.get(key);
                if(re == 0) {
                    re = 60;
                }
                cnt.merge(re, 1, Integer::sum);
            } else {
                if(re == 0) {
                    re = 60;
                }
                cnt.merge(re, 1, Integer::sum);
            }
        }
        return ans;
    }
}
// @lc code=end

