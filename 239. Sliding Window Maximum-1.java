/**
 * 利用最大堆实现
 * 每一次remove掉最前面的数，并add最新的数
 * O(Nlogk)
 */
class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        if(nums==null||nums.length==0||k==1){
            return nums;
        }
        
        PriorityQueue<Integer> pq = new PriorityQueue<>((o1,o2)->o2-o1);
        int[] res = new int[nums.length-k+1];
        
        for(int i=0;i<k;i++){
            pq.add(nums[i]);
        }
        res[0]=pq.peek();
        
        for(int i=1;i<res.length;i++){
            pq.remove(nums[i-1]);
            pq.add(nums[i-1+k]);
            res[i]=pq.peek();
        }
        return res;
    }
}