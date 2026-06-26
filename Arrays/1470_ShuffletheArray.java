class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] output = new int[nums.length];
        int j = 0,k  = 0;
        for(int i = 0 ; i < nums.length ; i++){
            if(i % 2 != 0){
                output[i] = nums[n+j];
                j++;
            }
            else {
                output[i] = nums[k];
                k++;
            }
        }
        return output;
    }
}
