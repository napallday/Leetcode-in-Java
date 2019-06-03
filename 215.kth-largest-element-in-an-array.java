/**
 * 快排的改进
 * 时间复杂度 O(n)
 * 空间复杂度 O(1)
 */
class Solution {
    public int findKthLargest(int[] nums, int k) {
        return findKth(nums, k, 0, nums.length-1);
    }

    public int findKth(int[] nums, int k, int start, int end) {
        int index = partition(nums, start, end);
        int rank = end - index + 1;
        if (rank == k){
            return nums[index];
        } else if (rank < k){
            return findKth(nums, k-rank, start, index-1);
        } else{
            return findKth(nums, k, index+1, end);
        }
    }

    public int partition(int[] nums, int start, int end){
        int pivot = nums[end];
        int left=start;
        for (int i=start;i<end;++i){
            if(nums[i]<=pivot){
                swap(nums, i, left++);
            }
        }

        swap(nums,left,end);
        return left;
    } 

    public void swap(int[] nums, int i, int j){
        int tmp=nums[i];
        nums[i]=nums[j];
        nums[j]=tmp;
    }
}
/**
 * 快排
 * 时间复杂度 O(nlogn)
 * 空间复杂度 O(1)
 */
/*
class Solution {
    public int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);
        return nums[nums.length-k];
    }
}
*/
/*
    优先队列
    时间复杂度 O(nlogk)
    空间复杂度 O(k)
 */
/*
class Solution {
    public int findKthLargest(int[] nums, int k) {
        Queue<Integer> q = new PriorityQueue<>();
        for (int n: nums) {
            q.offer(n);
            if (q.size()>k){
                q.poll();
            }
        }
        return q.peek();

    }
}
*/
