class Solution {
    public boolean isPerfectSquare(int num) {
        //解法二：二分查找
        int left = 1;
        int right = num;
        while(left <= right){
            //int mid = (left + right) >>> 1;
            int mid = left + (right - left) / 2;
            if((long) mid * mid < num) left = mid + 1;
            else if((long) mid * mid > num) right = mid - 1;
            else return true;
        }
        return false;
        
        //解法三：数学定理(1 + 3 + 5 + ... + (2n - 1) = n ^ 2)
        // int i = 1;
        // while(num > 0) {
        //     num -= i;
        //     i += 2;
        // }
        // return num == 0;
        
        //解法四：牛顿迭代法
        // if(1 == num) return true;
        // int i = num / 2;
        // while((double)i * i > num){
        //     i = (i + num / i) / 2;
        // }
        // return i * i == num;


        //解法一：暴力循环
        // double i = 1;
        // while(i * i < num) i++;
        // return i * i == num;
    }


    // 多余的判断
    // if (num == 0 || num == 1 || num == 2) {
    //     return true;
    // }
}
