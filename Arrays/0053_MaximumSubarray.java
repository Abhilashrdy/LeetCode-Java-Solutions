class Solution {
    public int maxSubArray(int[] nums) {
        int sum = -100000,max = Integer.MIN_VALUE;
        for(int num : nums){
           max = Math.max(max,sum);
            if(sum < 0){
                sum = Math.max(sum+num,num);
            }
            else if(sum+num <= 0){
                sum = Math.max(sum+num,num);
            }
            else sum += num;
        }
        return Math.max(max,sum);
        
    }
}
