class Solution {
    public void rotate(int[] nums, int k) {
        k %= nums.length;
        int[] arr = new int[nums.length];
        int[] arr1 = new int[k];
        int j = 0;
        for(int i = nums.length-k ; i< nums.length ; i++){arr1[j] = nums[i];j++;}
         for(int i = 0 ; i < j ; i++)arr[i] = arr1[i];
         for(int i = 0 ; i < nums.length-k ; i++)arr[i+k] = nums[i];
         for(int i = 0 ; i < nums.length ; i++)nums[i] = arr[i];
    }
}
