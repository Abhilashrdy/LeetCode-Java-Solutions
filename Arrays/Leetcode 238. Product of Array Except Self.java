class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] results = new int[n];
        int productL = 1;
        for (int i = 0; i < n; i++) {
            productL *= nums[i];
            results[i] = productL;          
        }
        int productR = 1;
        for (int i = n-1; i > 0; i--) {
            results[i] = productR * results[i-1];
            productR *= nums[i];
        }

        results[0] = productR * 1;

        return results;
    }
}
