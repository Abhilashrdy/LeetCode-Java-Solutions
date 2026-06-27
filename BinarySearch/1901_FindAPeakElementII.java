class Solution {
    public int[] findPeakGrid(int[][] mat) {
        int[] arr = new int[2];
        int max = mat[0][0];
        for(int i = 0 ; i < mat.length ; i++){
            int j = 0 , k = mat[0].length-1;
            while(j <= k){
                if(mat[i][j] > max){max = mat[i][j];arr[0] = i;arr[1] = j;}
                if(mat[i][k] > max){max = mat[i][k];arr[0] = i;arr[1] = k;}
                j++;
                k--;
            }
        }
        return arr;
    }
}
