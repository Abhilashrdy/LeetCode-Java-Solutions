class Solution {
    public boolean findRotation(int[][] mat, int[][] target) {
        for(int i = 0 ; i <= 3 ; i++){
            if(isEqual(mat,target))return true;
            rotate(mat);
        }
        return false;
    }
    void rotate(int[][] mat){
        int n = mat.length;
        for(int i = 0 ; i < n-1 ; i++){
            for(int j = i+1 ; j < n ; j++){
                int temp = mat[i][j];
                mat[i][j] = mat[j][i];
                mat[j][i] = temp;
            }
        }
        for(int i = 0 ; i < n ; i++) reverse(mat,i);
    }
    void reverse(int[][] mat,int i){
        int n = mat.length-1,j = 0;
        while(j <= n){
            int temp = mat[i][j];
            mat[i][j] = mat[i][n];
            mat[i][n] = temp;
            n--;
            j++;
        }
    }
    boolean isEqual(int[][] mat,int[][] target){
        int n = mat.length;
        for(int i = 0 ; i < n ; i++){
            for(int j = 0 ; j < n ; j++){
                if(target[i][j] != mat[i][j])return false;
            }
        }
        return true;
    }
}
