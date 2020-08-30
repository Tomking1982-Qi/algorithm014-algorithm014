class Solution {
    public int getKthMagicNumber(int k) {
        int p1 = 0, p2 = 0, p3 = 0;
        int[] nums = new int[k];
        nums[0] = 1;
        for (int i = 1; i < k; i++) {
            nums[i] = Math.min(Math.min(nums[p1] * 3, nums[p2] * 5), nums[p3] * 7);
            if (nums[i] == nums[p1] * 3) {
                p1++;
            }
            if (nums[i] == nums[p2] * 5) {
                p2++;
            } 
            if (nums[i] == nums[p3] * 7) {
                p3++;
            }
        }
        return nums[k-1];
    }
}
