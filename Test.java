public class Test {
    public static void main(String[] args) {
        int[] result = test1(new int[] { 1, 2, 3, 4, 1, 4, 3, 2 });
        for (int num : result) {
            System.out.println(num);
        }
    }

    public static int[] test1(int[] nums) {
        // 求后缀最小值
        int le = nums.length;
        int[] suf = new int[le];
        suf[le - 1] = nums[le - 1];
        for (int i = le - 2; i > -1; i--) {
            suf[i] = Math.min(suf[i + 1], nums[i]);
        }
        
        return suf;
    }
}