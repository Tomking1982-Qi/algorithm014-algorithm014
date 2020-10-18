class Solution {
    public int[] productExceptSelf(int[] nums) {
        int k = 1;
        int[] ans = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            ans[i] = k;
            k *= nums[i];
        }
        k = 1;
        for (int j = nums.length - 1; j >= 0; j--) {
            ans[j] *= k;
            k *= nums[j];
        }

        return ans;
    }
}
