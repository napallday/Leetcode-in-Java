class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int res=0;
        int count=0;
        for(int n: nums){
            if(n==0){
                count=0;
            } else{
                count++;
                res=Math.max(res,count);
            }
        }
        return res;
    }
}