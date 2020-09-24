class Solution {
    public int maxProduct(int[] nums) {
        int maxF = nums[0], minF = nums[0], ans = nums[0];

        for(int i = 1; i < nums.length; i++) {
            int max = maxF;
            maxF = Math.max(nums[i] * max, Math.max(nums[i], minF * nums[i]));
            minF = Math.min(nums[i] * minF, Math.min(nums[i], max * nums[i]));
            ans = Math.max(maxF, ans);
        }
        return ans;
    }
}
