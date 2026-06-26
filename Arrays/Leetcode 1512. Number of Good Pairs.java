class Solution {
    public int numIdenticalPairs(int[] nums) {
        int[] arr = new int[101];
        int max = 1;
        for(int i : nums){
            if(i > max)max = i;
            arr[i]++; 
        }
        int res = 0;
        for(int i = 1 ; i <= max ; i++){
            if(arr[i] > 1){res += (arr[i]*(arr[i]+1))/2;
            res -= arr[i];
            }
        }
        return res;
    }
}
