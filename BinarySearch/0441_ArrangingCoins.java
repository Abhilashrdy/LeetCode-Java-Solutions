class Solution {
    public int arrangeCoins(int n) {
       int start = 1;
        while(n > 0){
            start++;
            n -= start;
        }
        return start-1;
    }
}
