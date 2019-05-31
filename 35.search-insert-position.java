/*
    二分法
    log(N)
 */
class Solution {
    public int searchInsert(int[] nums, int target) {
        int N = nums.length;
        int left=0,right=N-1;

        if(target>nums[N-1]){
            return N;
        }

        while(left<right){
            int mid=(left+right)/2;
            if (nums[mid]==target){
                return mid;
            }
            if (nums[mid]<target){
                left = mid+1;
            } else{
                right=mid;
            }
        }
        return left;
    }
}

