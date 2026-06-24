class Solution {
    public int[] productExceptSelf(int[] nums) {
        int count0 = 0, pdt = 1;
        for(int i : nums){
            if(i == 0)count0++;
            else pdt *= i;
        }
        if(count0 >= 2)return new int[nums.length];
        if(count0 == 1){
            for(int i = 0 ; i< nums.length ; i++){
                if(nums[i] == 0)nums[i] = pdt;
                else nums[i] = 0;
            }
            return nums;
        }
        for(int i = 0 ; i < nums.length ; i++)nums[i] = pdt/nums[i];
        return nums;
    }
}
