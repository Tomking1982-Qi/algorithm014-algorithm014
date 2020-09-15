class Solution {
    public static String EMPTY = "%20";
    public String replaceSpace(String s) {
        // 解法一
        if (s == null || s.length() == 0) {
            return s;
        }
        char[] chars = new char[s.length() * 3];
        int i = 0;
        for(char c : s.toCharArray()) {
            if (c == ' ') {
                chars[i++] = '%';
                chars[i++] = '2';
                chars[i++] = '0';
            } else {
                chars[i++] = c;
            }
        }
        return new String(chars, 0, i);


        // 解法二
        // if (s == null || s.length() == 0) {
        //     return s;
        // }
        // StringBuilder res = new StringBuilder();
        // for(char c : s.toCharArray()) {
        //     if (' ' == c ) {
        //         res.append(EMPTY); 
        //         continue;  
        //     } 
        //     res.append(c);
        // }
        // return res.toString();
    }
}
