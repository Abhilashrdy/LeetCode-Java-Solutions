class Solution {
    public int diagonalSum(int[][] mat) {
      int res = 0;
      for(int i = 0 ; i < mat.length ; i++){
        res += mat[i][i];
        if(i != mat.length-1-i)res += mat[i][mat.length-1-i];
      }
      return res;
    }
}
