class Solution {
    // public int[] twoSum(int[] nums, int target) {
    //     for(int i = 0; i < nums.length -1; i++) {
    //         for (int j = i + 1; j < nums.length; j++ ) {
    //             if (nums[i] + nums[j] == target) {
    //                 return new int[]{i,j};
    //             }
    //         }
    //     }
    //     return null;       
    // }

    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> hash = new HashMap<Integer,Integer>();
        for(int i = 0; i < nums.length; i++) {
            if (hash.containsKey(nums[i])) {
                return new int[]{hash.get(nums[i]), i};
            } else {
                hash.put(target - nums[i], i);
            }
        }
        return null;
    }
}

//1. 暴力解法，两层循环

//2. 优化
