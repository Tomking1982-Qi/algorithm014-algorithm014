class Solution {
    public String replaceSpace(String s) {
        if (s == null || "" == s) {
            return s;
        }
        char[] chars  = new char[s.length() * 3];
        int i = 0;
        for (char c : s.toCharArray()) {
            if (c == ' ') {
                chars[i++] = '%';
                chars[i++] = '2';
                chars[i++] = '0';
                continue;
            }
            chars[i++] = c;
        }
        return new String(chars, 0, i);
    }
}
