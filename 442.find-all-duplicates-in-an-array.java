/*
 此题和 448.Find All Numbers Disappeared in an Array类似。
 * 
 */
class Solution {
    public List<Integer> findDuplicates(int[] nums) {
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
                res.add(nums[i]);
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

