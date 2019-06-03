/**
 * 双指针思路。记录0的个数，当0的个数超过K时，左指针向前移动直至删除第一个0.
 */
class Solution {
    public int longestOnes(int[] A, int K) {
        int left=0,right=0;
        int res=0;
        int zeroNum=0;
        
        for(right=0;right<A.length;right++){
            if(A[right]==0){
                zeroNum++;
                if (zeroNum>K){
                    while (A[left++]==1){}
                }
            }
            res = Math.max(res,right-left+1);
        }
        return res;
    }
}