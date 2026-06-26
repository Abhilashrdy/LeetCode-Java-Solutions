class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] arr = new int[2];
        arr[0] = binarySearch(nums,target,0,nums.length-1,true);
        arr[1] = binarySearch(nums,target,0,nums.length-1,false);
        return arr;
    }
    int binarySearch(int[] nums, int target , int start , int end , boolean first){
        int str = -1;
        while(start <= end){
            int mid = start + ( end - start )/2;
            if(nums[mid] == target){
                if(first){
                    str = mid;
                    end = mid-1;
                }
                else{
                    str = mid;
                    start = mid+1;
                }
            }
            else if(nums[mid] > target){
                end = mid-1;
            }
            else start = mid + 1;
        }
        return str;
    }
}
