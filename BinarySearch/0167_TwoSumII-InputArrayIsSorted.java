class Solution {
    public int[] twoSum(int[] nums, int target) {
      int j = nums.length-1,i = 0;
      while(i < j){
        int sum = nums[i]+nums[j];
        if(sum == target){
            return new int[]{i+1,j+1};
        }
        else if(sum > target)j--;
        else i++;
      }
      return new int[]{0,0};
    }
}
