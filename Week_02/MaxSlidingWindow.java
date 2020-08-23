class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {

        //双指针解法
        if (nums == null || nums.length == 0 || k <= 0){
            return new int[0];
        }
        int numLen = nums.length;
        int[] res = new int[numLen - k + 1]; // 保存结果
        int left = 0; // 左指针
        int right = k - 1; // 右指针
        int max = -1; // 最大值指针
        while (right < numLen) {
            if (max >= left) {
                max = nums[max] <= nums[right] ? right : max;
            } else {
                max = left;
                for (int i = left; i <= right; i++) {
                    max = nums[max] <= nums[i] ? i : max;
                }
            }
            res[left] = nums[max];
            left++;
            right++;
        }
        return res;

        //函数解法
        // if (nums == null || nums.length == 0 ){
        //     return new int[0];
        // }
        // int len = nums.length + 1 - k;
        // int[] res = new int[len];
        // for (int i = 0; i < len; i++) {
        //     res[i] =  Arrays.stream(nums,i,i+k).max().getAsInt();
        // }
        // return res;


        // 暴力解法O(n*k)
        // if (nums.length == 0) {
        //     return new int[0];
        // }
        // int max = Integer.MIN_VALUE;
        // int i = 0;
        // int j = nums.length;
        // int[] res = new int[j - k + 1];
        // while (i < (j - k + 1 )) {
        //     for (int h = 0; h < k; h++) {
        //         max = Math.max(max, nums[i+h]);
        //     }
        //     res[i] = max;
        //     max = Integer.MIN_VALUE;
        //     i++;
        // }
        // return res;
    }
}
