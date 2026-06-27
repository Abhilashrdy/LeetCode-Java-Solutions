class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);
        for(int i = 0 ; i < nums.length-3 ; i++){
           int j = i+1;
           while(j < nums.length-2){
            int start = j+1 , end = nums.length-1;
            while(start < end){
               long sum = (long)nums[i]+nums[j]+nums[start]+nums[end];
                if(sum == target){
                    ans.add(Arrays.asList(nums[i],nums[j],nums[start],nums[end]));
                    while(start < end && nums[start] == nums[start + 1])start++;
                    while(start < end && nums[end] == nums[end-1])end--;
                    start++;
                    end--;
                }
                else if(sum > target){
                    end--;
                }
                else start++;
            }
            while(j < nums.length-2 && nums[j] == nums[j+1])j++;
            j++;
           }
           while(i < nums.length-3 && nums[i] == nums[i+1])i++;
        }
        return ans;
    }
}
