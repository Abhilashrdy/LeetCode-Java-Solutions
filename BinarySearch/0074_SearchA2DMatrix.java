class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
       int u = 0 , l = matrix[0].length-1;
       while(u < matrix.length && l >= 0){
        if(matrix[u][l] == target)return true;
        else if(matrix[u][l] > target)l--;
        else u++;
       }
       return false;
    }
}
