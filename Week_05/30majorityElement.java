class Solution {
    public int majorityElement(int[] nums) {
        // 摩尔投票法思路 O(n)
        int candidateNum = nums[0], count = 0;
        for(int num : nums) {
            if (candidateNum == num) {
                count++;
            } else if (--count == 0) {
                candidateNum = num;
                count = 1;
            }
        }
        return candidateNum;

        // 暴力解法 O(nlogn)
        // Arrays.sort(nums);
        // int mid = nums.length / 2;
        // return nums[mid];
    }
}
