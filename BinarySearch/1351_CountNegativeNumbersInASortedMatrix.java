class Solution {
    public int countNegatives(int[][] arr) {
        int lo = arr[0].length-1;
        int up = 0;
        int count = 0;
        int row = arr.length;
        while(lo >= 0 && up < row){
            if(arr[up][lo] < 0){
                count += (row-up);
                lo--;
            }
            else{
                up++;
            }
        }
        return count;
    }
}
