class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k %= n;
        swappingOf(nums,0,n-1);
        swappingOf(nums,0,k-1);
        swappingOf(nums,k,n-1); 
    }
    void swappingOf(int[] nums , int start , int end){
        while(start <= end){
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}
