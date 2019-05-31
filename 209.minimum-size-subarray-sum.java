/*
    双指针。当sum<s时，右指针移动。当sum>=s时，左指针移动到第一个满足sum<s的位置。
 */
class Solution {
    public int minSubArrayLen(int s, int[] nums) {
        int N = nums.length;
        if (N==0){
            return 0;
        }
        int left=0,right=0;
        int sum=0;
        int res=Integer.MAX_VALUE;

        for(;right<N;right++){
            sum+=nums[right];
            if(sum>=s){
                while(left<=right){
                    sum-=nums[left++];
                    if(sum<s){
                        break;
                    }
                }
                res=Math.min(res, right-left+2);
            }
            
        }
        return res==Integer.MAX_VALUE?0:res;
    }
}

