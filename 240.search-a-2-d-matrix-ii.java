/*
    从右上角的数开始调整位置，若当前数小于target，说明当前数同一行的数都不满足条件，向下调整位置。同理，若当前数大于target，说明当前数同一列的数都不满足条件，向左调整位置。
    O(M+N)
 */
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix==null||matrix.length==0){
            return false;
        }

        int M = matrix.length;
        int N = matrix[0].length;

        int rowIndex = 0, colIndex = N-1;
        while(rowIndex>=0 && rowIndex<M && colIndex>=0 && colIndex<N){
            if(matrix[rowIndex][colIndex]==target){
                return true;
            }
            if(matrix[rowIndex][colIndex]<target){
                rowIndex++;
            } else {
                colIndex--;
            }
        }

        return false;
    }
}

