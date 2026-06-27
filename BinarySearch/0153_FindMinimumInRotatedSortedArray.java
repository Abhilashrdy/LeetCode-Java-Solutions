class Solution {
    public int findMin(int[] nums) {
        int start = 0 , end = nums.length-1,min = nums[0];
        while(start <= end){
            int mid = start+(end-start)/2;
            if(mid+1 <= end && nums[mid] > nums[mid+1]){
                return nums[mid+1];
            }
            else {
                if(mid != 0 && nums[mid] <= nums[0]){
                    min = nums[mid];
                    end = mid-1;
                }
                else start = mid+1;
            }
        }
        return min;
    }
}
