class Solution {
    public boolean checkIfExist(int[] nums) {
        for(int i = 0 ; i < nums.length; i++){
            for(int j = 0 ; j < nums.length ; j++){
                if(nums[i] == 2 * nums[j] && i!=j){
                    return true;
                }
            }
        }
        return false;
    }
} 
