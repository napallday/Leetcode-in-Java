public class Solution {
    /**
     * 用双指针，lastzero变量记录上一个0位置，初始化为-1.
     */
    public int findMaxConsecutiveOnes(int[] nums) {
        // write your code here
        int left=0, right=0;
        int res = 0;
        int lastzero=-1;
        while(right<nums.length){
            if (nums[right]==1){
                res = Math.max(res,right-left+1);
            } else {
                left = lastzero + 1;
                lastzero=right;
            }
            right++;
        }
        return res;
    }
}