class Solution {
    public int[][] generateMatrix(int n) {
        int[][] arr = new int[n][n];
        int top = 0 , bottom = n-1 , right = n-1 , left = 0;
        int count = 0; 
        while(left <= right && top <= bottom){
            for(int i = left ; i <= right ; i++){
                count++;
                arr[top][i] = count;
            }
            top++;
            for(int i = top ; i <= bottom ; i++){
                count++;
                arr[i][right] = count; 
            }
            right --;
            if(left <= right){
                for(int i = right ; i >= left ; i--){
                    count++;
                   arr[bottom][i] = count; 
                }
                bottom --;
            }
            if(top <= bottom){
                for(int i = bottom ; i >= top ; i--){
                    count++;
                    arr[i][left] = count; 
                }
                left++;
            }

        }
        return arr;
    }
}
