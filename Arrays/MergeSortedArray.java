class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] arr = new int[nums1.length];
        int i = 0 , j = 0 , k = 0;
        while(i < m && j < n){
            if(nums1[i] > nums2[j]){
                arr[k] = nums2[j];
                j++;
                k++;
            }
            else {
                arr[k] = nums1[i];
                k++;
                i++;
            }
        }
        while(i < m){
            arr[k] = nums1[i];
            i++;
            k++;
        }
        while(j < n){
            arr[k] = nums2[j];
            j++;
            k++;
        }
        i = 0;
        while(i < arr.length){nums1[i] = arr[i];i++;}
    }
}
