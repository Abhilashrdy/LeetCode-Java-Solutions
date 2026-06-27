class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int start = 1,end = piles[0];
        for(int num : piles){
            end = Math.max(end,num);
        }
        int min = end;
        while(start <= end){
            int mid = start+(end-start)/2;
            if(isValidSpeed(mid,piles,h)){
                min = mid;
                end = mid-1;
            }
            else start = mid+1;
        }
        return min;
    }
    private boolean isValidSpeed(int min,int[] piles,int h){
        for(int i = 0 ; i < piles.length ; i++){
            if(h == 0)return false;
            h -= piles[i]/min;
            if(piles[i]%min != 0)h--;
        }
        return h >= 0;
    }
}
