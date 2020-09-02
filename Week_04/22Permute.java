class Solution {
    List<List<Integer>> res;
    public List<List<Integer>> permute(int[] nums) {
        res = new ArrayList<>();
        if (nums == null && nums.length == 0) {
            return res;
        }
        
        int length = nums.length;
        boolean[] visited = new boolean[length];
        dfs(nums, new ArrayList<Integer>(), 0, length, visited);
        return res;
    }    

    private void dfs(int[] nums, List<Integer> path, int level, int maxLevel, boolean[] visited) {
        if (level == maxLevel) {
            res.add(new ArrayList<>(path));
            return;
        }
        for(int i = 0; i < maxLevel; i++) {
            if (!visited[i]) {
                visited[i] = true;
                path.add(nums[i]);
                dfs(nums, path, level + 1, maxLevel, visited);
                visited[i] = false;
                path.remove(path.size() - 1);
            }
        }
    }

    // public List<List<Integer>> permute(int[] nums) {
    //     if (nums.length == 0) {
    //         return res;
    //     }
    //     res = new ArrayList<>();
    //     dfs(nums, new LinkedHashSet<>());
    //     return res;
    // }

    // private void dfs(int[] nums, Set<Integer> path) {
    //     if (path.size() == nums.length) {
    //         res.add(new ArrayList<>(path));
    //         return;
    //     }
    //     for (int num : nums) {
    //         if (!path.add(num)) {
    //             continue;   
    //         }
    //         dfs(nums, path);
    //         path.remove(num);
    //     }
    // }
}
