class Solution {
    public int oddCells(int m, int n, int[][] indices) {
        int[][] result = new int[m][n];
        int r ;
        int c ;
        int count = 0;
        for(int i =0 ; i< m ; i++){
            for(int j =0 ; j< n ; j++){
                result[i][j] =0;
            }
        }
        for(int i = 0 ; i < indices.length ; i++){
               r = indices[i][0];
               c = indices[i][1];
                for(int j =0 ; j< n ;j++){
                result[r][j] += 1;
                }
                for(int j = 0 ; j<m ; j++){
                result[j][c] +=1;
               }
               
            
         }
            for(int i =0 ; i< m ; i++){
                for(int j =0 ; j<n ; j++){
                    if(result[i][j]%2 != 0){
                        count++;
                    }
                }
            }
        return count;
    }
}
