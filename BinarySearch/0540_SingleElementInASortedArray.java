class Solution {
    public int singleNonDuplicate(int[] nums) {
        int start = 0 , end = nums.length-1;
        while(start < end){
            if(nums[end] == nums[end-1]){
                end -= 2;
            }
            else{
                return nums[end];
            }
            if(nums[start] == nums[start+1]){
                start += 2;
            }
            else{
                return nums[start];
            }
        }
        return nums[end];
    }
}
 
