class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int max = getMax(nums,0,nums.length-1);
       int[] arr = new int[max+1];
       int[] count = new int[max+1];
       for(int i : nums)arr[i]++;
       int cn = 0;
       for(int i = 0 ; i < arr.length ; i++){
        while(i < arr.length && arr[i] == 0)i++;
        count[i] = cn;
        cn += arr[i];
       }
       for(int i = 0 ; i < nums.length ; i++){
        nums[i] = count[nums[i]];
       }
       return nums;
    }
    int getMax(int[] nums,int start,int end){
        int max = 0;
        while(start <= end){
            if(nums[start] > max)max = nums[start];
            if(nums[end] > max)max = nums[end];
            start++;
            end--;
        }
        return max;
    }
}
