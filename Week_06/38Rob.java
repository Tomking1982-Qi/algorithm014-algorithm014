class Solution {
    public int rob(int[] nums) {
        if (nums.length == 1) return nums[0];
        int amout1 = rob(nums, 0, nums.length - 2);
        int amout2 = rob(nums, 1, nums.length - 1);
        return Math.max(amout1, amout2);
    }

    private int rob(int[] num, int lo, int hi) {
        int include = 0, exclude = 0;
        for (int j = lo; j <= hi; j++) {
            int i = include, e = exclude;
            include = e + num[j];
            exclude = Math.max(e, i);
        }
        return Math.max(include, exclude);
    }
}
