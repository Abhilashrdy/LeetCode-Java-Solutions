class Solution {
    public int findDuplicate(int[] nums) {
        int[] ans = new int[nums.length];
        for(int num : nums){
            if(++ans[num] == 2){
                return num;
            }
        }
        return -1;
    }
}
