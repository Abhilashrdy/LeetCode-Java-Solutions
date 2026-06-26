class Solution {
    public boolean canJump(int[] nums) {
       int i = nums.length-1, j = nums.length-2;
       while(j >= 0){
        if(nums[j] >= i-j)i = j;
        j--;
       }
       return i <= 0 ? true : false;
        
    }
}
