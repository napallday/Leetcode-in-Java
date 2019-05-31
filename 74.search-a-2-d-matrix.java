/*
 思路是两步二分法，先搜索到对应的行，再搜索对应的列。
 注意的是第二次二分法循环条件是<=，不是<。原因在于每次循环left，right其中之一一定会改变，不会陷入死循环。
 O(logM+logN)
 */
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix==null||matrix.length==0){
            return false;
        }
        int M = matrix.length;
        int N = matrix[0].length;

        int left = 0, right=M-1;
        while(left<right){
            int mid=(left+right)/2;
            if(matrix[mid][0]==target){
                return true;
            }

            if(matrix[mid][0]<target){
                if(matrix[mid+1][0]>target){
                    left=mid;
                    break;
                } else{
                    left = mid+1;
                }
            } else {
                right = mid-1;           
            }
        }

        int row = left;
        left=0;
        right=N-1;
        while(left<=right){
            int mid=(left+right)/2;
            if(matrix[row][mid]==target){
                return true;
            }
            if(matrix[row][mid]<target){
                left=mid+1;
            } else{
                right=mid-1;
            }
        }
        return false;
    }
}

