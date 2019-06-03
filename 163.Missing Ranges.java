public class Solution {
    /*
     * @param nums: a sorted integer array
     * @param lower: An integer
     * @param upper: An integer
     * @return: a list of its missing ranges
     */
    public List<String> findMissingRanges(int[] nums, int lower, int upper) {
        // write your code here
        List<String> res = new LinkedList<>();
        long left = (long)lower-1;
        for(int n: nums){
            if (n<=left){
                continue;
            }
            if (n>left+1){
                res.add(getRange(left+1,n-1));
            }
            left = n;
        }
        if(left<upper){
            res.add(getRange(left+1,upper));
        }
        return res;
    }
    
    public String getRange(long left, long right){
        if (left==right){
            return String.valueOf(left);
        } else{
            return left + "->" + right;
        }
    

    }
}