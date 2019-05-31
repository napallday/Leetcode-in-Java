/*
 * 大致思路上将数字移动到正确的位置上，即nums[i]移动到nums[nums[i]-1]的位置上，最后遍历一遍进行检验。
 * 
 */
class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int N = nums.length;
        List<Integer> res = new ArrayList<>();
        for(int i=0;i<N;i++){
            if(nums[i]!=i+1){
                if(nums[i]!=nums[nums[i]-1]){
                    swap(nums,i,nums[i]-1);
                    i--;
                }
            }
        }
        for(int i=0;i<N;i++){
            if(nums[i]!=i+1){
                res.add(i+1);
            }
        }
        return res;
    }

    public void swap(int[] nums, int i, int j){
        int tmp=nums[i];
        nums[i]=nums[j];
        nums[j]=tmp;
    }
}

