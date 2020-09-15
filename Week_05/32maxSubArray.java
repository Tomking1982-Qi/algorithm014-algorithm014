class Solution {
    public int maxSubArray(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int ans = nums[0], sum = 0;
        for(int num : nums) {
            if(sum > 0) {
                sum += num;
            } else {
                sum = num;
            }
            //sum = Math.max(sum + num, num);
            ans = Math.max(sum, ans);
        }
        return ans;
    }
    // public int max = 0, sum = 0;
    // public int maxSubArray(int[] nums) {
    //     if (nums == null || nums.length == 0) {
    //         return max;
    //     }
    //     PriorityQueue<Integer> deque = new PriorityQueue<>((Integer a, Integer b) -> (a - b));
    //     dfs(max, 0, nums, deque);
    //     return deque.poll();
    // }
    // private void dfs(int max, int start, int[] nums, PriorityQueue<Integer> deque) {
    //     if (start == nums.length) {
    //         deque.add(max);
    //         return;
    //     }
    //     for (int i = start; i < nums.length; i++) {
    //         sum += nums[i];
    //         max = Math.max(sum, max);
    //         dfs(max, i + 1, nums, deque);
    //         break;
    //     }
    // }
}
