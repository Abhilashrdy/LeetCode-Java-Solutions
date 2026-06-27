class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int l = weights[0];
        int sum = 0;
        for(int i = 0 ; i < weights.length ; i++){
            sum = sum + weights[i];
            if(l < weights[i]){
                l = weights[i];
            }
        }
        int r = sum;
        while(l < r){
            int mid = l + (r - l)/2;
            int sum1 = 0;
            int count = 0;
            for(int element : weights){
                if(sum1 + element > mid){
                    count++;
                    sum1 = 0;
                }
                sum1 += element;
            }
            if(count < days){
                r = mid;
            }
            else{
               l = mid+1;
            }
        }
        return l;
    }
}
