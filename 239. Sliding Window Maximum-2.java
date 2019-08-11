class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        if(k==0){
            return nums;
        }
        Deque<Integer> dp = new LinkedList<>();
        int[] res = new int[nums.length-k+1];
        for(int i=0;i<nums.length;i++){
            while(!dp.isEmpty() && nums[dp.getLast()]<=nums[i]){
                dp.removeLast();
            }
            dp.addLast(i);
            if(i-k+1>=0){
                res[i-k+1]=nums[dp.getFirst()];
            }
            if(dp.getFirst() == i-k+1){
                dp.removeFirst();
            }
        }
        return res;
    }
}