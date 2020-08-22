class Solution {
    public String removeOuterParentheses(String S) { 
        StringBuffer res = new StringBuffer();
        char[] s = S.toCharArray();
        for(int i = 0, begin = 1, count = 0; i < s.length; i++) {
            if(s[i] == '(') {
                count++;
                continue;
            } else {
                count--;
            }
            if(count == 0) {
                res.append(S.substring(begin, i));
                begin = i + 2;
            }
        }
        return res.toString();
    }
}
