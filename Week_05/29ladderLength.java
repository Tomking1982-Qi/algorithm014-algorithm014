class Solution {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        if (!wordList.contains(endWord)) {
            return 0;
        }
        Set<String> dict = new HashSet<>(wordList);
        Set<String> beginSet = new HashSet<>();
        Set<String> endSet = new HashSet<>();
        beginSet.add(beginWord);
        endSet.add(endWord);

        int step = 1;
        Set<String> visited = new HashSet<>();
        while (!beginSet.isEmpty() && !endSet.isEmpty()) {
            if (beginSet.size() > endSet.size()) {
                Set<String> set = beginSet;
                beginSet = endSet;
                endSet = set;
            }
            Set<String> temp = new HashSet<>();
            for (String word : beginSet) {
                char[] chs = word.toCharArray();
                for (int i = 0; i < chs.length; i++) {
                    for (char c = 'a'; c <= 'z'; c++) {
                        char old = chs[i];
                        chs[i] = c;
                        String target = String.valueOf(chs);
                        if (endSet.contains(target)) {
                            return step + 1;
                        }
                        if (!visited.contains(target) && dict.contains(target)) {
                            temp.add(target);
                            visited.add(target);
                        }
                        chs[i] = old;
                    }
                }
            }
            beginSet = temp;
            step++;
        }
        return 0;
    }
    // 超时 O(n ^ n)
    // int count = Integer.MAX_VALUE;
    // public int ladderLength(String beginWord, String endWord, List<String> wordList) {
    //     Set<String> visited = new HashSet<>();
    //     dfs(visited, 1, beginWord, endWord, wordList);
    //     return count == Integer.MAX_VALUE ? 0 : count;
    // }

    // private void dfs(Set<String> visited, int step, String start, String end, List<String> wordList) {
    //     if (start.equals(end)) {
    //         count = Math.min(count, step);
    //         return;
    //     }
    //     for (String word : wordList) {
    //         int diff = 0;
    //         for (int j = 0; j < word.length(); j++) {
    //             if (start.charAt(j) != word.charAt(j)) {
    //                 diff++;
    //             }
    //             if (diff > 1) {
    //                 break;
    //             }
    //         }
    //         if (diff == 1 && !visited.contains(word)) {
    //             visited.add(word);
    //             dfs(visited, step + 1, word, end, wordList);
    //             visited.remove(word);
    //         }
    //     }
    // }
}
