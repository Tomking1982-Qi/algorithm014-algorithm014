class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        // six rounds
        if (nums == null || nums.length < 3) {
            return Collections.emptyList();
        }
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();
        for (int i =0; i< nums.length - 2; i ++) {
            if (nums[i] > 0) {
                break;
            }
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            int target = -nums[i];
            int j = i + 1, k = nums.length -1;
            while (j < k) {
                if (nums[j] + nums[k] < target) {
                    while (j < k && nums[j] == nums[++j]);
                } else if (nums[j] + nums[k] > target) {
                    while (j < k && nums[k] == nums[--k]);
                } else {
                    res.add(Arrays.asList(nums[i], nums[j], nums[k]));
                    while (j < k && nums[j] == nums[++j]);
                    while (j < k && nums[k] == nums[--k]);
                }
            }
        }
        return res;



        // List<List<Integer>> res = new ArrayList<>();
        // for (int i = 0; i < nums.length - 2; i++) {
        //     if (nums[i] > 0) {
        //         break;
        //     }
        //     if (i > 0 && nums[i] == nums[i - 1]) {
        //         continue;
        //     }
        //     int target = -nums[i];
        //     int j = i + 1, k = nums.length - 1;
        //     while (j < k) {
        //         if (nums[j] + nums[k] < target) {
        //             while(j < k && nums[j] == nums[++j]);
        //         } else if (nums[j] + nums[k] > target) {
        //             while(j < k && nums[k] == nums[--k]);
        //         } else {
        //             res.add(Arrays.asList(nums[i], nums[j], nums[k]));
        //             while(j < k && nums[j] == nums[++j]);
        //             while(j < k && nums[k] == nums[--k]);
        //         }
        //     }
        // }
        // return res;
    }
}
