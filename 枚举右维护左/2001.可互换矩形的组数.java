
/*
 * @lc app=leetcode.cn id=2001 lang=java
 *
 * [2001] 可互换矩形的组数
 */

// @lc code=start

import java.util.HashMap;

class Solution {
    public long interchangeableRectangles(int[][] rectangles) {
        long result = 0;
        HashMap<Long, Long> infoMap = new HashMap<>();
        final long BASE = (long)1e6;
        for(int[] current : rectangles) {
            int divisor = gcd(current[0], current[1]);
            long currentValue = (current[0] / divisor) * BASE + (current[1] / divisor);
            if (infoMap.containsKey(currentValue)) {
                Long value = infoMap.get(currentValue);
                result += value;
                infoMap.put(currentValue, value + 1);
            } else {
                infoMap.put(currentValue,  1L);
            }
        }
        return result;
    }
    
    private int gcd(int a, int b) {
        return b > 0 ? gcd(b, a % b) : a;
    }
}
// @lc code=end


// 笔记：44/46 cases passed (N/A)：提交错误原因 浮点数计算带来的误差。
// 为了避免浮点数产生的误差，应使用分数表示矩形的宽高比，将每个矩形的宽高比用最简分数表示之后即可判断两个矩形的宽高比是否相同。
// 最大公约数以及[x, y] 压缩算法z = x * base + y; x = z / base; y = z % base 