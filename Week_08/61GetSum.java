class Solution {
    public int getSum(int a, int b) {
        // while (b != 0) {
        //     int temp = a ^ b;
        //     b = (a & b) << 1;
        //     a = temp;
        // }
        // return a;
        return b == 0 ? a : getSum(a ^ b, (a & b) << 1);
    }
}
