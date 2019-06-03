public class Solution {
    /**
     * @param length: the length of the array
     * @param updates: update operations
     * @return: the modified array after all k operations were executed
     */
    public int[] getModifiedArray(int length, int[][] updates) {
        // Write your code here
        int[] res = new int[length];
        for(int[] nums:updates){
            int start = nums[0];
            int end = nums[1]+1;
            int val = nums[2];
            res[start]+=val;
            if(end<length){
                res[end]-=val;
            }
        }
        for(int i=1;i<length;i++){
            res[i]=res[i-1]+res[i];
        }
        return res;
    }
}