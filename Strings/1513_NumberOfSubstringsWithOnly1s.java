class Solution {
    public int numSub(String s) {
        final int mod = 1_000_000_007;
        int res = 0,count = 0;
        for(char ch : s.toCharArray()){
               if(ch == '1'){
                res = (res+ ++count)%mod;
               }
               else count = 0;
       }
        return res;
    }
}
