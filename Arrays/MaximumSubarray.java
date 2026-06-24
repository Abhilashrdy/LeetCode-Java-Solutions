class Solution {
    public int maxSubArray(int[] nums) {
      int  sum = -30000,max = Integer.MIN_VALUE,n = nums.length;
    for(int i = 0 ; i < n ; i++){
        if(sum+nums[i] < nums[i] || sum + nums[i] <= 0){
            sum = nums[i];
        }
        else{
            sum += nums[i];
        }
        max = Math.max(max,sum);
    }
    return max;
    }
}
