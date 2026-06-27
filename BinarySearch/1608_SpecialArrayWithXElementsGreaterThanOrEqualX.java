class Solution {
    public int specialArray(int[] nums) {
        int x = nums.length ;
        int[] arr = new int[x+1];
        for(int num : nums){
            if(num >= x)arr[x]++;
            else{
                arr[num]++;
            }
        }
        int result = 0;
        for(int i = arr.length-1 ; i > 0 ; i--){
            result += arr[i];
            if(result == i){
                return i;
            }
        }
        return -1;
    }
}
