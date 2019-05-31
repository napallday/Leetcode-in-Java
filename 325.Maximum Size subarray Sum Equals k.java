public class Solution {
    /**
    前缀和 + HashMap
    注意 map.putIfAbsent 函数
    */
    public int maxSubArrayLen(int[] nums, int k) {
        int N = nums.length;
        int sum=0;
        int res=0;
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,-1);
        for(int i=0;i<N;i++){
            sum+=nums[i];
            int val = sum - k;
            if(map.containsKey(val)){
                int left = map.get(val);
                res=Math.max(res,i-left);
            }
            map.putIfAbsent(sum,i);
        }
        return res;
    }
}