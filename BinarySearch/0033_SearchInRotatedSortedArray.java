class Solution {
    public int search(int[] nums, int target) {
      return getTargetIndex(nums,target,0,nums.length-1);
    }
int getTargetIndex(int[] arr, int target,int start,int end) {
        if(start > end)return -1;
        int mid = start + (end - start)/2;
        if(arr[mid] == target)return mid;
        if(arr[start] <= arr[mid]){
            if(arr[start] <= target && target < arr[mid]){
                return getTargetIndex(arr,target,start,mid-1);
            }
            else return getTargetIndex(arr,target,mid+1,end);
        }
        else if(arr[start] > target) return getTargetIndex(arr,target,start+1,end);
        else return getTargetIndex(arr,target,start,end-1);

}
}
