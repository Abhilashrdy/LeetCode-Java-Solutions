class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int i = 0;
        while(i < nums.length){
            while(nums[i] != nums[nums[i]-1]){
                int temp = nums[nums[i]-1];
                nums[nums[i]-1] = nums[i];
                nums[i] = temp;
            }
            i++;
        }
        List<Integer> lst = new ArrayList<>();
        for(i = 0 ; i < nums.length ; i++){
            if(nums[i] != i+1){
                lst.add(i+1);
            }
        }
        return lst;
    }
}
