class Solution {
    public int splitArray(int[] nums, int k) {
        int start = nums[0],end = 0;
      for(int x : nums){
        if(x > start)start = x;
        end+=x;
      }
    
     while(start < end){
        int mid = start + (end - start)/2;
        int pieces = 1,sum = 0;
        for(int num : nums){
           if(sum + num > mid){
                sum = num;
                 pieces++;
            }
            else{
               sum += num;
            }

        }
        if(pieces <= k)end = mid;
        else start = mid+1;
     }
     return start;
    }
}
