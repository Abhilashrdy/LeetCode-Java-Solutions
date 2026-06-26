class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        int n = image.length;
        int temp = 0;
        int[][] result = new int[n][n];
        for(int i =0 ; i< n ; i++){
            for(int j = 0 ; j <n; j++){
                result[i][j] = image[i][n-1-j];
                if(result[i][j]==1){
                    result[i][j]=0;
                }
                 else if(result[i][j]==0){
                    result[i][j]=1;
                }
            
            }
        }
    return result;
}
}
