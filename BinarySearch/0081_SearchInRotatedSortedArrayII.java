class Solution {
    public boolean search(int[] nums, int target) {
         int pivot = findpivot(nums);
        if (pivot == -1) {
            // Array is not rotated, search the entire array
            return binarysearch(nums, target, 0, nums.length - 1);
        }
        if (nums[pivot] == target) {
            return true;
        }
        if (nums[0] <= target) {
            // Search in the left sorted part
            return binarysearch(nums, target, 0, pivot - 1);
        }
        // Search in the right sorted part
        return binarysearch(nums, target, pivot + 1, nums.length - 1);
    }

    Boolean binarysearch(int[] nums, int target, int start, int end) {
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] == target) {
                return true;
            }
            if (nums[mid] > target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return false;
    }

    int findpivot(int[] nums) {
        int start = 0;
        int end = nums.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (mid < end && nums[mid] > nums[mid + 1]) {
                return mid;
            }
            if (mid > start && nums[mid] < nums[mid - 1]) {
                return mid - 1;
            }
            if(nums[start]== nums[mid] && nums[end] == nums[mid]){
                if(start < nums.length-1 &&  nums[start] > nums[start+1]) return start;
                start++;
                if(end >0 && nums[end] < nums[end-1]) return end-1;
                end--;
            }
            else if(nums[start] > nums[mid] || ( nums[start] == nums[mid] && nums[end] > nums[mid]))end = mid-1;
            else start = mid+1;
            
        }
        return -1; // Array is not rotated
    }
    }
