public int subarraySum(int[] nums, int k) {
        Map<Integer, Integer> preSumMap = new HashMap<>();
        preSumMap.put(0, 1);
        int count = 0, sum = 0;
        for (int num : nums) {
            sum += num;
            if (preSumMap.containsKey(sum - k)) {
                count += preSumMap.get(sum -k);
            }
            preSumMap.put(sum, preSumMap.getOrDefault(sum, 0) + 1);
        }
        return count;

        //前缀和 O(n * n) 
        // int count = 0;
        // int len = nums.length;
        // int[] preSum = new int[len + 1];
        // preSum[0] = 0;
        // for (int i = 0; i < len; i++) {
        //     preSum[i + 1] = preSum[i] + nums[i];
        // }
        // for (int left = 0; left < len; left++) {
        //     for(int right = left; right < len; right++) {
        //         if(preSum[right + 1] - preSum[left] == k) {
        //             count++;
        //         }
        //     }
        // }
        // return count;

        // 优化的暴力解法
        // int count = 0;
        // for (int i = 0; i < nums.length; ++i) {
        //     int sum = 0;
        //     for(int j = i; j >= 0; --j) {
        //         sum += nums[j];
        //         if(sum == k) {
        //             count++;
        //         }
        //     }
        // }
        // return count;
    }
